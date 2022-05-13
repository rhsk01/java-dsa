package com.company;

public class ResizeArray {

    public void printArray(int[]arr){
        int n = arr.length;
        for(int i = 0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
 //   public void resize(int[]arr,int capacity){   //we have seen in main methode that if it will be void typr then all will be garbage collector,make it type int
    public int[] resize(int[]arr,int capacity){
        int[] temp = new int [capacity];    // afyer creating temp arry we copy all the elements of our original array to temp array and we simply provide
                                            // for loop
        for(int i = 0;i<arr.length; i++){
            temp[i] = arr[i];             // now all elements of our original array will be prinetd in this temp
        }
        return temp;
    }


    public static void main(String[] args) {
        ResizeArray ra = new ResizeArray();
//        ra.printArray(new int[]{5,1,2,9,10});
        int [] original = new int[] {5,1,2,9,10};
        System.out.println("the original size pf array : " + original.length);
        original = ra.resize(original,10);
        System.out.println("the original size after resizing : " + original.length);
    }
}
