package com.company;

public class SecondMax {

    public int findSecondMax(int[]arr){
        if(arr==null || arr.length == 0){
            throw new IllegalArgumentException();
        }

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>max){
                secondMax = max;
                max = arr[i];
            }
            else if(arr[i] > secondMax  && arr[i] != max){
                secondMax = arr[i];
            }
        }
        return secondMax;
    }

    public static void main(String[] args) {
        int[]arr = {12,34,2,34,33,1};
        SecondMax sm = new SecondMax();
        System.out.println(sm.findSecondMax(arr));

    }
}
