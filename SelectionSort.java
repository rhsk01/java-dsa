package com.company;

public class SelectionSort {
    public static void main(String[] args) {
//        int[] a = {38, 52, 9, 18, 6, 62, 13};
        //for string array
        String[]a = {"raja","dipika","anshu","pratap"};
        int min;
//        int temp = 0;
        String temp = "";
        for (int i = 0; i < a.length; i++) {
            min = i;
            for (int j = i + 1; j < a.length; j++) {
//                if (a[j] < a[min]) {
                if(a[j].compareTo(a[min])<0){          // for string
                    min = j;
                }
            }
            temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }
        for(int i = 0;i<a.length;i++) {
            System.out.print(a[i]+" ");
        }
    }
}
