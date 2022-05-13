package com.company;

import java.util.NoSuchElementException;

public class DoublyLinkedList {
                                //dll has a head and tail pointer - two instance variable
    private ListNode head;      //inner class listnode--,head will hold the first node of dll
    private ListNode tail;      //tail will hold the last node of dll
    private int length;         // this integer variable will hold the length of dll

    private class ListNode{        //this listnode class will hold the pointer to next and previous node
        private int data;          //listnode contains three things
        private ListNode next;     //pointer to the next node
        private ListNode previous; //pointer to the previous node

        public ListNode(int data){  // this constructor will hold the data part
            this.data = data;
        }
    }

                                 //a next constructor for dll
    public DoublyLinkedList(){   //here we'll assign the value of three instance variable
        this.head   = null;      //cause we're intialising this dll so head and tail will point to null and length is 0
        this.tail   = null;
        this.length = 0;
    }

                                //we'll also create a methode by name isEmpty
    public boolean isEmpty(){   //it will return a boolean value which will tell us whether the dll is empty or not
        return length == 0;     //head == null then the list is empty
    }

                                //we'll also create a methode which will return the length
    public int length(){
        return length;
    }

    //algo to insert node at the beggining
    public void insertFirst(int value){
        ListNode newNode = new ListNode(value);
        if(isEmpty()){
            tail = newNode;
        }
        else{
            head.previous = newNode;
        }
        newNode.next = head;
        head = newNode;
        length++;
    }

    //algo to insert node at the ending
    public void insertLast(int value){
        ListNode newNode = new ListNode(value);
        if(isEmpty()){
            head = newNode;
        }else {
            tail.next = newNode;
            newNode.previous = tail;
        }
        tail = newNode;
        length++;
    }

    //algo to print elements in forward direction
    public void displayForward(){
        if(head==null){
            return;
        }
        ListNode temp = head;
        while (temp!=null){
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

       //algo to print elements in backward direction
    public void displayBackward() {
        if (tail == null) {
            return;
        }
        ListNode temp = tail;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.previous;
        }
        System.out.println("null");
    }


    //algo to delete first node of dll
    public ListNode deleteFirst(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        ListNode temp = head;
        if(head==tail){ //means only one node is in list
            tail=null;
        }
        else{
            head.next.previous = null;
        }
        head = head.next;
        temp.next = null;
        length--; //we know size of lenght decreased by one therefor we'll decriment it by 1
        return temp;
    }

    //algo to delete last node
    public ListNode deleteLast(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        ListNode temp = tail;
        if(head==tail){
            head=null;
        }
        else{
            tail.previous.next=null;
        }
        tail=tail.previous;
        temp.previous=null;
        length--;
        return temp;
    }


    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertFirst(1);
        dll.insertFirst(12);
        dll.insertFirst(17);
        dll.insertFirst(29);

//        dll.insertLast(1);
//        dll.insertLast(10);
//        dll.insertLast(15);
//        dll.insertLast(25);

        dll.displayForward();
//        dll.displayBackward();

//        dll.deleteFirst();
//        dll.deleteFirst();
//        dll.displayForward();

        dll.deleteLast();
        dll.displayForward();

    }
}
