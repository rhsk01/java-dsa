package com.company;

import java.util.EmptyStackException;

public class Stack {

    private ListNode top;
    private int length;

    private class ListNode{
        private int data;
        private  ListNode next;

        public ListNode(int data){
            this.data = data;
        }
    }

    public Stack(){
        top = null;
        length= 0;
    }

    public int length(){
        return length;
    }

    public boolean isEmpty(){
        return length ==0;
    }

    public void push(int data){
        ListNode temp = new ListNode( data);
        temp.next = top;
        top = temp;
        length++;
        }

        public int pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
             //if the stack is not empty we'll create an integer variable by name result
        int result = top.data;
        top = top.next;
        length--;
        return  result;
        }

        public int peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return top.data;
        }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(15);
        s.push(20);
        System.out.println(s.peek());
        s.pop();
        System.out.println(s.peek());
        s.pop();
        System.out.println(s.peek());
        s.pop();
        System.out.println(s.peek());
    }
}
