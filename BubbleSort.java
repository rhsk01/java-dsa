package com.company;

public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {36,19,29,12,5};
//        String[] a= {"raja","amit","deepesh","rudrakshi"};
          int temp;                              // it will help in swapping the elements  and int temp for integer
//        String temp;                             // string temp for string
        for(int i = 0; i<a.length; i++){         // for the rounds
            int flag = 0;
            for(int j = 0; j<a.length-1-i; j++){ // for the adjacent elements and -i ,the largest element will go in end and it will not compare it again
                if(a[j]>a[j+1]){               // for integer list
//                if(a[j].compareTo(a[j+1])>0){    // for string when char is given
                    temp   = a[j];
                    a[j]   = a[j+1];
                    a[j+1] = temp;
                    flag   = 1;
                }
            }
            if(flag == 0) {
                break;
            }}
            for(int i = 0; i<a.length; i++){
                System.out.print(a[i]+" ");
        }
//            for(int i = 0; i<a.length; i++){
//                System.out.print(a[i]+" "); // will use this for loop to retrive when list is very long
        }
    }

