package com.company;

public class ReverseArray {

    public static void reverse(int[]numbers, int start, int end){
        while(start<end){                  //in this while loop we'll simply swap the values at the start index and end index
            int temp       = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            start++;
            end--;
        }
    }
    public static void printArray(int[]arr){
        for(int i = 0; i < arr.length; i++ ){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
    //algo to reverse array

    public static void main(String[] args) {
        int[] numbers = {2,11,5,10,7,8};
        printArray(numbers);
        reverse(numbers,0,numbers.length-1);
        printArray(numbers);
    }
}
