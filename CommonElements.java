package com.company;

import java.util.HashSet;

public class CommonElements {
    public static void main(String[] args) {
        int[] arr1 = {8, 6, 4, 3,2, 11, 8};
        int[] arr2 = {23, 32, 12, 11,6, 8, 3, 6};//we have to provide hash set otherwise array me elements 1 se jyada bar aane pr ye fir se  print kr dega
 /*       HashSet<Integer> hs = new HashSet<>();
        for(int i = 0;i<arr1.length; i++){
            for(int j = 0;j<arr2.length; j++){
                if(arr1[i]==arr2[j]){
                    hs.add(arr1[i]);
                    break;  // to save time
                }
            }
        }
        for(int no : hs){
            System.out.print(no+" , ");
        }*/

        // now using hashset
        HashSet<Integer> hs1 = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();//hs1,hs2 other wise in second array it will print the repeating elements again
        for (int no : arr1) {  // in this for loop we will assign arr1 in to no
            hs1.add(no);   //arr1 ke elements ko hs 1 me put kr dia
        }
        for (int no : arr2) {
            hs2.add(no);   // arr2 ke elements ko hs2 me put kr dia
        }
        for(int no:hs2){
          boolean b =  hs1.add(no);   // hs2 ke elements ko hs1 me put kr dia to so that common elements find kr ske
            if (b == false) {
                System.out.print(no+" ");

            }
        }
    }
}