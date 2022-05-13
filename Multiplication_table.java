package com.company;
import java.util.Scanner;
public class Multiplication_table {
    public static void main(String[] args) {
        Scanner table = new Scanner(System.in);
        System.out.println("enter the num");
        int a = table.nextInt();
        for(int i = 1; i<=10; i++){
            System.out.println(" "+a+"*"+i+"="+a*i);
        }
    }
}
