package com.company;

import java.util.HashSet;

public class RemoveDuplicacy3 {
    public static void main(String[] args) {
//        int [] a = {1,2,2,3,4,5,5};   // sorted
        int[] a = {1,3,3,2,6,6,5,4,4,4,4,4};  // unsorted
        HashSet<Integer> hs = new HashSet<>();
        for(int i = 0; i<a.length;i++){
            hs.add(a[i]);    // now inside hashset original elements will store and duplicate elements will be removed
        }
        for(int no:hs){      // for each loop
            System.out.print(no+" ");
        }
    }
    }
