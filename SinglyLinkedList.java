package com.company;

public class SinglyLinkedList {
   private ListNode head;             //instance variable of type listnode name head and it will hold the sll for us
                                      //now AS we created the head of type listnode,we have to create the listnode class
                                      //as we know that sll internally contains listnode class
   private static class ListNode{     //list node has two property data,pointer to next node of list
       private int data;              //this listnode will point to the data part
      private ListNode next;          //this listnode will point to the next node
        public ListNode(int data){    // now we will provide the constructor ,this constructor  will take the data part
            this.data = data;         //when next list will be created its next will point to null bydefault
            this.next = null;
        }
   }
   //this algorithm is for how to print elements of sll in java
   public void display(){ // display is the name of methode
       ListNode current = head; //temp node
        while( current != null){
            System.out.print(current.data + "-->");
            current = current.next;
        }
       System.out.println("null");

   }
   //this algo is to find lemgth of sll
    public int length(){ //int cause it will return an integer value
       if(head == null){
           return 0;
       }
       int count = 0;//int variable count and we assigned a value 0 to it and this count var will hold the lenght of sll
        ListNode current = head;//created a listnode name current and assigned the value of head and head is pointing to next node
        //now in order to traverse each and every node of sll provide while loop
        while(current!=null){
            count++;//we are actually traversing particular node of sll so increement count by one and after this will simply traverse current to its next node
            current = current.next;//and when next will ppoint to null means no node is left to traverse to we'll call return
        }
        return count;


    }
    //algo for inserting node at biggining
    public void insertfirst(int value){  // this method is taking int value which we'll insert
       ListNode newNode = new ListNode(value);//new node made and pass in value to its contructor
                                              // after this new listnode will be created having value we want to insert
        newNode.next = head;// to newnode next we'll provide a value which is stored in its head
        head = newNode;//last step point head to this newnode
    }


    //algo for inserting node at end
    public void insertlast(int value){
       ListNode newNode = new ListNode(value);
       if(head==null){  //reason we are checking head ==  null cause we have to insert at end and when head is null means now list is empty
           head = newNode;//assigning value newnode to its head
           return;
       }
       //and if sll is not empty then will create a temp node and will assign  a value head to it
       ListNode current = head;//so here in order to insert this new listnode to the end of sll we need to start from the head and to reach till end of sll
       while(current.next!=null){ //inside this while loop simply iterate current to its next
           current = current.next;
       }
       current.next = newNode;//assigning value of newnode to its current next as we want to insert new node at end
                              //and we checked condition of null and we raeched at end


   }
   //algo for inserting a node in a sll at a given position
    public void insert(int position,int value){
       //1-->4-->5
        //1-->6-->4-->5
       ListNode node = new ListNode(value);//the value which we want to insert
        if(position==1){//position 1 means we want to insert at biggining
            node.next = head;//node next is pointing to null,we want to point it to head because we want to insert this node before head,so node next should point
                             //to head and after next node is pointing to head,in order to make node part of our sll and to inserted portion one ,we need to assign
                             //the nodes value to head ,now head will point to node which would be at position 1 and which will become the part of our sll
            head = node;
        }
        else{
            ListNode previous = head;//temp node previous as we want to somehow reach to a node previous to this position,where we actually want to insert our
                                     //newly created node.so we will start from head and as we already started from head,we'll create a int var count,we'll assign
                                     //it avalue 1,because this count will help us in traversing to position-1 ,so in a while loop we'll provide a condition
            int count =1;//position -1
            while(count<position-1 ){//and inside this while till this condition fails,we'll keep incrementing previous to its next position by assigning previous.next
                                     //to its previous and will increment count by one,one position.so when previous will reach to position -1 this while loop will terminate
                                     //and it terminated we'll create next temp node and will assign previoius .next to it
              previous = previous.next;
              count++;
            }
            ListNode current = previous.next; //to current we are assigning previous.next (4),after assigning this we can simply remove the linkage and assign it to
                                             //our next node which we want to insert
            previous.next = node;
            node.next = current;//because if we will not write this our next node will be gone as there wouldn't be any reference to them
        }
    }


    //algo to delete first node of a sll
    public ListNode deletefirst(){
       if(head==null){//means list is empty
           return null;
       }
       ListNode temp = head;//temp variable pointed to the head,after assigning head to this temp var,we can simply move head to its next position by asigning head.next to head
        head = head.next;//now we can delete the first node after assigning the value null to temp.next in order to break the linkage between temp node and rest of the list
        temp.next = null;
        return temp;//finally we can return the deleted node
    }


    //algo to delete last node of sll
    public ListNode  deletelast(){
       if(head==null || head.next==null){//head==null means list is empty and head.next==null means only one node is in list
           return head;//if head is null,null will be returned or head.next is null then head will be returned
       }
       //in order to delete the last node somehow we have to traverse to the second last node and remove the linkage,after creating two pointers we can acheive that
       //one will be current which will start from head and other is previous which will always be previous to current because once current reaches to the last node
       //previous is already at the second last node and we can remove linkage  by using previous
       ListNode current = head;//current points to head
       ListNode previous = null;//previous points to null
       while(current.next!= null){//when current points to null it means we reached at end,now we'll move current by one position and before moving current to
                                  //one position a head we simply assign current to previous so that previous always remains one node behind current so that when current
                                  //reaches the last node previous is at the second last node and once we get the location of second last node we can simply
                                  //remove the last node from the sll by simply putting previous.next to null this breaks the chain of sll from the last node
           previous = current;
           current = current.next;
       }
       previous.next=null;//break the chain
       return current;

    }
    //algo to delete a node from sll at a given position

    public void delete(int position){
       //assuming position is valid and starting from 1
        if(position ==1){  //position = 1 means we are deleting the first node and head is pointing to the first node and after its removal
            head = head.next; //head should point to next node
        } else{
            ListNode previous = head;  //temp listniode and it's starting from head
            int count = 1;//as previous is already pointing to head we will assign it value 1,now using count n position we'll reach to next node
            while(count<position-1){  //and this while loop keep on  eterating and with each eteration we'll simply traverse previous to its next
                previous = previous.next;
                count++;             //and will simply increment count by one
            }
            ListNode current = previous.next;//temp node and we'll provide it a value as previous.next
            previous.next = current.next;
        }
    }


    //algo to search an element in sll in java
    public boolean find(int searchkey){  //this methode takes a head and search key
       if(head==null){
          return false;
       }
       ListNode current = head;
       while(current!=null){  //we'll eterate till current = null
           if(current.data == searchkey){
               return true;
           }
           current = current.next;
       }
       return false;
    }


    //algo to reverse sll
    public  ListNode reverse(ListNode head){
       if(head==null){
          return head;
       }
       ListNode current = head;
       ListNode previous = null;
       ListNode next = null;
       while(current!=null){
           next = current.next;
           current.next=previous;
           previous = current;
           current = next;
       }
       return previous;
    }


    //algo to find middle node in a sll
   public ListNode getMiddleNode(){
       if(head==null){
           return null;
       }
       ListNode slowPtr = head;
       ListNode fastPtr = head;
       while(fastPtr!=null && fastPtr.next!=null){
           slowPtr = slowPtr.next; //slowptr traversed to one node
           fastPtr = fastPtr.next.next; //fastptr traversed to 2 nodes
       }
       return slowPtr;
   }


   //algo to n th node from the end of a sll
    public ListNode getNthNodeFromEnd(int n){
       if(head==null){
           return null;
       }
       if(n<=0){
           throw new IllegalArgumentException("invalid value: n "+n);
       }
       ListNode mainPtr = head;
       ListNode refPtr  = head;
       int count = 0; //integer variable count and will assign it a value 0

        while(count<n){
            if(refPtr==null){
                throw new IllegalArgumentException("n is greater than the numbers of of nodes in list"+n);
            }
            refPtr = refPtr.next;
            count++;   //but if there is only 3 nodes in sll then we have to check an if condition too
        }
        while(refPtr!=null){
            refPtr = refPtr.next;
            mainPtr = mainPtr.next;
        }
        return mainPtr;
    }

    //algo to remove duplicate from sorted sll

    public void removeDuplicate(){
       if(head==null){
           return;
       }
       ListNode current = head;
       while(current!=null && current.next!=null){
           if(current.data==current.next.data){
               current.next = current.next.next;
           }
           else{
               current = current.next;
           }
       }
    }


    //algo to insert a node in a sorted sll
    public ListNode insertInsortedList(int value){
       ListNode newNode = new ListNode(value); //created a new listnode for new node value
        if(head==null){
            return newNode;
        }
        ListNode current = head;
        ListNode temp    = head;

        while(current!=null && current.data<newNode.data){
            temp    = current;
            current = current.next;//now current will be pointing at the node which is just greater than new node and temp will be pointed at node which is just lesser than
                                   //newnode now nest step will be
        }
        newNode.next = current;
        temp.next    = newNode;
        return head;
    }

    //algo to remove a given key from sll
    public void deleteNode(int key){
       ListNode current = head;
       ListNode temp    = null;
                              //if head data matched with key then we have to handle it separately by if condition
        if(current!=null && current.data ==key){
            head = current.next; //we'll shift head by one
            return;
        }
        while(current!=null && current.data!=key){
            temp = current; //temp node will hold the position of the previous node to current
            current = current.next;
        }
        if(current==null){ //it means we haven't found the key in sll
            return;
                   //and if current != null means current is pointing to the key
        }
        temp.next = current.next; //to remove the key
    }

    //algo to detect a loop in a linked list in java
    public boolean containsLoop(){   //bollean type cause it will tell us whether loop is there aren't as true or false
       ListNode fastPtr = head;
       ListNode slowPtr = head;

       while (fastPtr != null && fastPtr.next != null){
           fastPtr = fastPtr.next.next;
           slowPtr = slowPtr.next;

           if(fastPtr==slowPtr){ //if there  will be loop in sll this condition will occur 100%
               return true;
           }
       }
       return false;
    }

    //algo to find start of loop in a sll
    public ListNode startNodeInaLoop(){
       ListNode fastPtr = head;
       ListNode slowPtr = head;

       while(fastPtr != null && fastPtr.next != null) {
           fastPtr = fastPtr.next.next;
           slowPtr = slowPtr.next;

           if (fastPtr == slowPtr) {
               return getStartingNode(slowPtr);
           }
       }
       return null;
    }

    public ListNode getStartingNode(ListNode slowPtr){ //slowptr is our meeting point so it becomes our first node
       ListNode temp = head; //temp node--now we have two node temp,slowptr is pointing to the meeting point of fastptr and slowptr
       while(slowPtr!=temp){
           temp    = temp.next; //keep on iterating until slowptr and temp met
           slowPtr = slowPtr.next;
       }
       return temp; //when both meet that will be the our firstt node
    }

    //algo to remove loop from sll
    public void removeLoop(){
       ListNode fastPtr = head;
       ListNode slowPtr = head;

       while(fastPtr!=null && fastPtr.next!=null){
           fastPtr = fastPtr.next.next;
           slowPtr = slowPtr.next;

           if(slowPtr==fastPtr){
               removeLoop(slowPtr);
               return;
           }
       }
    }
    public void removeLoop(ListNode slowPtr){
       ListNode temp = head;

       while(slowPtr.next != temp.next){  // in order to remove loop we have to reach one node before loop
           temp    = temp.next;
           slowPtr = slowPtr.next;
       }
       slowPtr.next = null;  // this will break the loop
    }


    public void creataLoopinSll(){               //algo to create a loop
       ListNode first  = new ListNode(1);
       ListNode second = new ListNode(2);
       ListNode third  = new ListNode(3);
       ListNode fourth = new ListNode(4);
       ListNode fifth  = new ListNode(5);
       ListNode sixth  = new ListNode(6);
                                           // and we know head was pointing to the first node so
        head = first;
        first.next  = second;
        second.next = third;
        third.next  = fourth;
        fourth.next = fifth;
        fifth.next  = sixth;
        sixth.next  = third; // as we saw in ex and in oredr to create loop

    }

    //algo to merge 2 sorted sll
    public static ListNode merge(ListNode a ,ListNode b){ //listnode a,b presents two sorted sll
       // 1-->3-->5-->null
       // 2-->4-->6-->null
       // 1-->2-->3-->4-->5-->6-->null
       ListNode dummy = new ListNode(0);  //it provides us a concrete object in the heep so that wec can  avoid null pointer execption
        ListNode tail = dummy;                 //and this dummy list will hold our sorted sll
                                               //while loop cause we want to merge two sorted sll but first we have to compare their respective elements
        while(a != null && b != null) {        //if any of the list get exosted we'll exit from while loop
                                               //will provide if condition cause we need tp find the smallest element among the both the list for thr current iretation
            if (a.data <= b.data) {
                tail.next = a;
                a = a.next;
            } else {
                tail.next = b;
                b = b.next;
            }
            tail = tail.next; //and we will keep on moving tail till the time their will be node in list
        }
        // 1-->3-->null
        // 2-->4-->6--> 7-->9 -->10-->null
        // 1-->2-->3-->4-->6-->7-->9 -->10-->null

        if(a==null){           // if a will get exosted we will upend the b
            tail.next = b;
        } else{                // if b will get exosted we will upend the a
            tail.next = a;
        }
        return dummy.next; //we are returning the dummy cause earlier dummy listnode we created and whatever rnode we added ,we added after dummy using tail.next, so the actual
                           //head would be dummy's next because the first node was inserted i tail's next and tail was pointing to dummy
                           //so at the end we need to return dummy's next
    }


    public static void main(String[] args){
       SinglyLinkedList sll = new SinglyLinkedList();
       sll.head = new ListNode(1);
       ListNode second = new ListNode(2);
       ListNode third  = new ListNode(3);
       ListNode fourth = new ListNode(4);
                                  //now we will connect together to form a chain
       sll.head.next = second; // 10-->1
       second.next   = third;  // 10-->1-->8
       third.next    = fourth; // 10-->1-->8-->11

       sll.display(); //it will print the sll

//        System.out.println("Length is : " + sll.length()); //it will print the length of sll

        sll.insertfirst(11); //it will insert the node at the beggining of sll
        sll.insertfirst(8);
        sll.insertfirst(1);
        sll.display();

//        sll.insertlast(11); //it will insert the node at the end  of sll
//        sll.insertlast(8);
//        sll.insertlast(1);
//        sll.display();

//        sll.insert(1,3);  // to inserting node at a given node
//        sll.insert(2,5);
//        sll.insert(1,2);
//        sll.insert(2,4);
//        sll.display();

//        System.out.println(sll.deletefirst().data); //it will delete the first node
//        sll.display();

//        System.out.println(sll.deletelast().data);   //it will delete the last node
//        sll.display();

//        sll.delete(1); // it will delete the node at a given position
//        sll.display();

//        if(sll.find(1)){   // for searching an element in sll
//            System.out.println("found");
//        } else{
//            System.out.println("Not found");
//        }

//        sll.head = sll.reverse(sll.head); // it will reverse the sll
//        sll.display();

//        ListNode middleNode = sll.getMiddleNode(); //serching the middle node
//        System.out.println("middle node is :" + middleNode.data);

//        ListNode nthNodeFromEnd = sll.getNthNodeFromEnd(2);  // finding nth node from end
//        System.out.println("nth bode from the end is: " + nthNodeFromEnd.data);

//        sll.removeDuplicate(); // for this in the main method first create duplicate like 1-->1-->2-->3-->3-->null
//        sll.display();

//        sll.insertInsortedList(11); //it will insert a node in sorted sll
//        sll.display();

//        sll.deleteNode(4);  //removing a given key from sll
//        sll.display();

//        sll.creataLoopinSll();
//        System.out.println(sll.containsLoop());      //detecting loop in a sll
//        System.out.println(sll.startNodeInaLoop().data);  //to find start of a loop

//        sll.creataLoopinSll();    //removing loop from a sll
//        sll.removeLoop();
//        sll.display();


        //written inside main method to display 2 sorted & merged sll
//       SinglyLinkedList sll1 = new SinglyLinkedList();
//       sll1.insertlast(1);
//       sll1.insertlast(4);
//       sll1.insertlast(8);
//
//        SinglyLinkedList sll2 = new SinglyLinkedList();
//        sll2.insertlast(3);
//        sll2.insertlast(5);
//        sll2.insertlast(8);
//        sll2.insertlast(9);
//        sll2.insertlast(14);
//        sll2.insertlast(18);
//
//        sll1.display();
//        sll2.display();
//
//        SinglyLinkedList result = new SinglyLinkedList();
//        result.head = merge(sll1.head,sll2.head); //this method will return a merged and sorted sll
//
//        result.display();

    }
}
