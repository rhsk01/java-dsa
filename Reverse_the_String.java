package com.company;
import java.util.Scanner;
public class Reverse_the_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the name");
        String name = sc.nextLine();
        int leng = name.length();
        String rev  = "";
        for(int i = leng-1; i>=0; i--){
            rev = rev+name.charAt(i);
        }
        System.out.println(rev);
    }
}

