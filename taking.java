package com.company;
import java.util.Scanner;
public class taking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name ");
        String name = sc.next();
        System.out.println("enter your gender");
        char gender = sc.next().charAt(0);
        System.out.println("enter your age");
        int age = sc.nextInt();
        System.out.println("enter your phone number");
        long phone = sc.nextLong();
        System.out.println(" name "+name+" gender "+gender+" age "+age+" phone number "+phone);
    }
}
