package com.company;

public class InsertElementInArray {
    public static void main(String[] args) {
        int[]a={10,20,30,40,50};

//        int position = 3;     //position 1,2,3,4,5
        int index_position = 3; //index 0,1,2,3,4,5
        int element  = 100;

        //       for(int i = a.length-1;i>position-1; i--){  //we will traverse the array from end so i = index must be > position-1
        for(int i = a.length-1;i>index_position;i--){
            a[i] = a[i-1];
        }
//        a[position-1] = element;
    a[index_position] = element;
        for(int i = 0;i<a.length; i++){
            System.out.print(a[i]+" ");
        }
    }
}
