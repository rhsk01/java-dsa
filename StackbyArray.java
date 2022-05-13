package com.company;

public class StackbyArray {
    /* Java program to implement basic stack operations */
        static  final int MAX = 1000;
        int top;
        int[] a = new int[MAX]; // Maximum size of Stack

    boolean push(int x) {
        if (top >= (MAX - 1)) {
            System.out.println("Stack Overflow");
            return false;
        }
        else {
            a[++top] = x;
            System.out.println(x + " pushed into stack");
            return true;
        }
    }


        int pop() {
            if (top < 0) {
                System.out.println("Stack Underflow");
                return 0;
            }
            else {
                int x = a[top--];
                return x;
            }
        }

        int peek() {
            if (top < 0) {
                System.out.println("Stack Underflow");
                return 0;
            }
            else {
                int x = a[top];
                return x;
            }
        }
        void print(){
            for(int i = top;i>-1;i--){
                System.out.print(" "+ a[i]);
            }
        }

    // Driver code
//    class Main {
        public static void main(String args[])
        {
            StackbyArray s = new StackbyArray();
            s.push(10);
            s.push(20);
            s.push(30);
            s.push(40);
//            s.push(50);
            System.out.println(s.pop() + " Popped from stack");
            System.out.println("Top element is :" + s.peek());
            System.out.print("Elements present in stack :");
            //s.print();



        }
    }


