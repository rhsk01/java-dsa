package com.company;

public class RemoveEvenInteger {

    public static void printArray(int[]arr){
        int n = arr.length;
        for(int i = 0;i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //algo to remove even array
    public static int[] removeEven(int[] arr) {
        int oddCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                oddCount++;
            }
        }             //now after knowing the number of odd integers we need to return an array of integrs having only odd integers
        int[] result = new int[oddCount];  // we created an integer array of sixe oddcount
        int idx = 0;   //idx= index
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {       // this condition will tell us about the odd int so we need to put this int in to the result array
                // in order to put the elements in to the result arr we need to find an index for this we created index  variable
                result[idx] = arr[i];  // and after placing the odd integrs at a proper index we need to increement the index as well
                idx++;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        int[]arr = {3,2,4,7,10,6,5};
        printArray(arr);
        int[] result = removeEven(arr);   //this result array will have only odd intgers
        printArray(result);

    }
}
