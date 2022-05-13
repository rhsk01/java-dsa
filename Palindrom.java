package com.company;
import java.util.Scanner;
public class Palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int no = sc.nextInt();
        int temp = no;
        int rem;
        int rev = 0;
        while(temp!=0){
            rem = temp%10;
            rev = rev*10+rem;
            temp = temp/10;
        }
        if(no==rev) {
            System.out.println(no+" is palindrom");
        }else{
            System.out.println(no+" is not palindrom");
        }
    }
}
