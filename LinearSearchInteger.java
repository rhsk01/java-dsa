package com.company;

public class LinearSearchInteger {
    public static void main(String[] args) {
        int[] arr = {9,7,32,12,76,2,1};
        int item = 1;
        int temp =0 ; // we are taking this var in case if item is not found
        for(int i = 0 ;i<arr.length; i++){
            if(arr[i]==item){
                System.out.println(" item is found: "+i+ " index position ");
                temp = temp+1;
            }
        }
        if(temp == 0){
            System.out.println("item not found");
        }
    }
}
