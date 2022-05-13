package com.company;

public class MoveZeros {

    public void printArray(int[]arr){
        int n = arr.length;
        for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void arrayDemo() {
        int[] arr = {8, 1, 0, 2, 1, 0, 3};
        printArray(arr);
        moveZeros(arr,arr.length);
        printArray(arr);
    }

    public void moveZeros(int[]arr,int n){
        int j = 0;                              // int j pointer will focus on zeroth elements
        for(int i = 0; i<n; i++){               // int i  pointer will focus on non zero elements
            if(arr[i] != 0 && arr[j] ==0){      // i!= 0 because i points to non zero and j points to zero
                int temp = arr[i];              // temp variable will help us on swapping the elements
                arr[i]   = arr[j];
                arr[j]   = temp;
            }
            if(arr[j] != 0){   // beacuse j will only focus on zeroth elements
                j++;
            }
        }
    }


    public static void main(String[] args) {

        MoveZeros mz = new MoveZeros();
        mz.arrayDemo();

    }
}
