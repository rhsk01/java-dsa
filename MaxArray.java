package com.company;

public class MaxArray {

    public int findMax(int[]arr){
        if(arr == null || arr.length==0){
            throw new IllegalArgumentException();
        }
        int max = arr[0];
        for(int i = 1; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[]arr = {2,3,4,5,6,89,67};
        MaxArray Ma = new MaxArray();
        System.out.println(Ma.findMax(arr));


    }
}
