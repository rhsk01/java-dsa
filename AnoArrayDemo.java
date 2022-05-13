package com.company;

public class AnoArrayDemo {
    public static void main(String[] args) {
//        AnoArrayDemo.sum(new int[]{10,20,30});  // instantly maid an anonymous array and single line me hi create and intialise
        AnoArrayDemo.sum(new int[][]{{10,20,30},{40,50,60}}); // 2d ano arr
    }
//      static void sum(int[] no){ // 1d
        static void sum(int[][] no){  //2d
        int total = 0;
//        for(int i : no){ //1d
            for(int ii[]:no) {
                for (int i : ii) {
                    total = total + i;
                }
            }
            System.out.println("sum is: "+ total);}
        }



