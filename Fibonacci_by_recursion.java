package com.company;

public class Fibonacci_by_recursion {
    static int a = 0,b=1,c;
    public static void main(String[] args) {
        System.out.print(a+" "+b);
        Fibonacci_by_recursion ob = new Fibonacci_by_recursion();
        ob.printFib(10);
        }
        void printFib(int i){
        if(i>=1){
            c=a+b;
            System.out.println(" "+c);
            a=b;
            b=c;
            printFib(i-1);
        }
    }
}
