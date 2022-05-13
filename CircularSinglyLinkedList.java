package com.company;

import java.util.NoSuchElementException;
import java.util.concurrent.Callable;

public class CircularSinglyLinkedList {

    private ListNode last; //this listnode will help us in keeping the track of lat node of the csll
    private int length;    //this will hold the size of csll

    private class ListNode{
        private ListNode next;  //here listnode contains data part and the reference to the next listnode
        private int data;

        public ListNode(int data){ //this contructor will take the data part
            this.data = data;
        }
    }

    public CircularSinglyLinkedList(){  // this constructor for csll,after initialising this contructor we know if last points to null
     last   = null;
     length = 0;                        // list in empty and length is  0
    }

    public int length(){
        return length;
    }

    public boolean isEmpty(){
        return length == 0;
    }

    public void createCircularSinglyLinkedList(){
        ListNode first  = new ListNode(1);
        ListNode second = new ListNode(5);
        ListNode third  = new ListNode(10);
        ListNode fourth = new ListNode(15);

        first.next  = second;
        second.next = third;
        third.next  = fourth;
        fourth.next = first;   //fourth will point to first

        last = fourth;
    }
    //algo to reverse csll
    public void display(){
        if(last==null){
            return;
        }
        ListNode first = last.next;
        while(first!=last){
            System.out.print(first.data+" ");
            first = first.next;
        }
        System.out.print(first.data);
    }

    //algo to insert node at the beggining of csll
    public void insertFirst(int data){
        ListNode temp = new ListNode(data);
        if(last==null){   //if list is empty
            last = temp;
        }else{             //if list isn't empty
            temp.next = last.next;
        }
        last.next = temp;
        length++;
    }

    //algo to insert node at the end of csll
    public void insertLast(int data){
        ListNode temp = new ListNode(data);
        if(last==null){    //or isEmpty mwthod
            last = temp;
            last.next = last;
        }
        else{
            temp.next = last.next;
            last.next = temp;
            last = temp;
        }
        length++;
    }

    //algo to remove first node from a csll
 //   public ListNode removeFirst(){
    public int removeFirst(){
        if(isEmpty()){
            throw new NoSuchElementException("ciecular Singly Linked List");
        }
        ListNode temp = last.next;
        int result = temp.data;
        if(last.next == last){   //this condition occurs only when there is only one node left in csll
            last = null;
        }
        else{
            last.next = temp.next;
        }
      //  temp.next = null;
        length--;
      //  return temp;
        return result;
    }
    public static void main(String[] args) {
        CircularSinglyLinkedList csll = new CircularSinglyLinkedList();
//          csll.createCircularSinglyLinkedList();
 //       csll.display();  //to display the reverse of csll

//        csll.insertFirst(2);
//        csll.display();

          csll.insertLast(1);
          csll.insertLast(10);
          csll.insertLast(15);
            csll.display();


//        csll.removeFirst();
//        csll.removeFirst();
        System.out.println(csll.removeFirst());

        csll.display();

    }
}
