package com.company;
import java.util.Scanner;
public class Fibonacci_series {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc =new Scanner(System.in);
        int num = sc.nextInt();
        int a=0,b=1;
        System.out.print(a+" "+b);
        int c;
        for(int i = 0;i<=num;i++){
            c = a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
        }
    }
}
