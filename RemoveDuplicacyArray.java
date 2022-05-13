package com.company;

public class RemoveDuplicacyArray {
    public static void main(String[] args) {
        int []a = {1,2,2,3,4,5,5};
        int [] temp = new int[a.length];
        //we can do it without temp too
        int j = 0;                         // j variable will point to temp index position and i will point to a array index positions
        for(int i = 0;i<a.length-1; i++){
            if(a[i] != a[i+1]){    // here we know a[6]!=a[7] so to avoid out of bond exception will do a.length-1
                temp[j] = a[i];
//                a[j] = a[i];
                j++;
            }
        }
          temp[j] = a[a.length-1];   //will assign the last value of array to temp
//        a[j] = a[a.length-1];

         for(int  i = 0;i<a.length; i++){
//        for(int i = 0;i<j+1;i++){
              System.out.print(temp[i]+" ");
//            System.out.print(a[i] +" ");
        }

    }
}
