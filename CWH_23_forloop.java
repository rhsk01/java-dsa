package com.company;

import java.util.Scanner;

public class CWH_23_forloop {
    public static void main(String[] args) {
//        for(int i = 1; i<=10; i++){//intialise,cond check,update.
//            System.out.println(i);
//        }
//        int n = 5;
//        for (int i = 0; i < n; i++) {//  < ke sath ++,> ke sath -- warna ye infinite chalta rhega
//            System.out.println(2 * i + 1);
//        }
        //decereementing for loop
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter a number " + "to find all the nu that are smaller than it" + "and to print them in reverse order");
        int n = sc.nextInt();
        for (int i =n; i>0; i--){
            System.out.println(i);
        }
    }
}



