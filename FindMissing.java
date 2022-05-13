package com.company;

public class FindMissing {


    public static int findMissingNumber(int[] arr){
        int n = arr.length+1;  // +1 to get the last number of array
        int sum = n*(n+1)/2;
        for(int num :arr){
            sum = sum-num;
        }
        return sum;
    }

    public void arrayDemo(){
        int[]arr ={2,4,1,8,6,3,7};
        System.out.println(findMissingNumber(arr));
    }
    public static void main(String[] args) {
        FindMissing fm = new FindMissing();
        fm.arrayDemo();
    }
}
