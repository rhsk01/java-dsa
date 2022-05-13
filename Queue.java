package com.company;

import java.util.NoSuchElementException;

public class Queue {

    public ListNode front;
    public ListNode rear;
    public int length;

    public Queue(){
        this.front = null;
        rear = null;
        length = 0;

    }
    public  class ListNode{
        public int data ;
        public ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public int length(){
        return length;
    }

    public boolean isEmpty(){
        return length == 0;   // if length is 0 then this method will return true or false
    }

    public void enqueue(int data){
        ListNode temp = new ListNode(data);
        if(isEmpty()){
            front = temp;
        }else{
            rear.next = temp;
        }
        rear =temp;
        length++;
    }

    public void print(){
        if(isEmpty()) {
            return;  // and if queue is not empty we'll traverse each and every element in the queue and will print it in the console
        }
        ListNode current = front;
            while(current !=null){
                System.out.print(current.data+"-->");
                current = current.next;
            }
        System.out.println("null");
        }

        public int dequeue(){
        if(isEmpty()){
            throw new NoSuchElementException("Queue is already empty");
        }
        int result = front.data;
        front = front.next;
        if(front==null){
            rear=null;
        }
        length--;
        return result;
        }

        public int first(){
        if(isEmpty()){
            throw new NoSuchElementException("Queue ia already empty");
        }
        return front.data;
        }

        public int last(){
        if(isEmpty()){
            throw new NoSuchElementException("Queue ia already empty");
        }
        return rear.data;
        }

    public static void main(String[] args) {
    Queue queue = new Queue();
    queue.enqueue(10);
    queue.enqueue(20);
    queue.enqueue(30);
    queue.print();

        System.out.println(queue.first());
        System.out.println(queue.last());
//    queue.dequeue();
//    queue.dequeue();
//    queue.dequeue();//list is empty now
//    queue.dequeue();//list is empty so it will throw an execption
//    queue.print();


    }

}
