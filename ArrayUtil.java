package com.company;

public class ArrayUtil {

    public void printArray(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){         //i is the index of arr and n is the length so as we know index count=length-1,that's why i must be <n
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void arrayDemo(){
        int[]myArray = new int[5];
        printArray(myArray);
        myArray[0] = 5;
        myArray[1] = 1;
        myArray[2] = 8;
        myArray[3] = 2;
        myArray[4] = 10;
        myArray[2] = 9; //incase you want to update the value
        printArray(myArray);
        System.out.println(myArray.length);    //to get length
        System.out.println(myArray[myArray.length-1]);     //to get the last index of array

        int[]arr = {4,5,6,8};  //printing the array
        printArray(arr);
        System.out.println(arr.length);  //lenght of the printed arr
    }


    public static void main(String[] args) {
        ArrayUtil arrutil = new ArrayUtil(); //instance of arrayutil class
        arrutil.printArray(new int[] {5,1,2,9,10});  //we are passing this arr to printArray method
          arrutil.arrayDemo();
    }
}
