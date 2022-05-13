package com.company;


public class CWH_29_practice_set_ARRAY {
    public static void main(String[] args) {
        //question 1
        //        practice problem 1
//        float[]marks ={45.7f,67.8f,63.4f,99.2f,65.4f};
//        float sum = 0;
//        for(float element:marks){
//            sum = sum + element;
//        }
//        System.out.println("the value of sum of 5 array is:");
//        System.out.println(sum);

//        System.out.println(sum);

        //problem  2
//        float[]marks ={45.7f,67.8f,63.4f,99.2f,65.4f};
//        float num = 67.8f;
//            boolean isInArray = false;
//            for(float element:marks){
//                if(num==element){
//                    isInArray = true;
//                    break;
//            }
//        }
//            if(isInArray){
//                System.out.println("the value is present in array");
//            }
//            else{
//                System.out.println("the value is not present in array");
//            }

        //practice problem 3
//        float[]marks ={45.7f,67.8f,63.4f,99.2f,65.4f};
//        float sum = 0;
//        for(float element:marks){
//            sum = sum + element;
//        }
//        System.out.println("the value of avg 5 array is" + sum/marks.length);

        //practice problem 4
//        int [][]mat1 = {{1,2,3},
//                        {4,5,6}};//2X3 matrix
//        int [][]mat2 = {{7,8,9},
//                        {10,11,12}};
//        int [][] result = {{0,0,0},
//                           {0,0,0}};
//        for(int i = 0; i<mat1.length; i++){//row number of times
//            for(int j = 0; j<mat1[i].length; j++){//column number of times
//                System.out.format("setting value for i=%d and j=%d \n",i,j);
//                result[i][j] = mat1[i][j] + mat2[i][j];
//            }
//        }
//        //printing thr elements of 2 d array
//        for(int i = 0; i<mat1.length; i++){//row number of times
//            for(int j = 0; j<mat1[i].length; j++){//column number of times
//                System.out.print(result[i][j] + " ");
//                result[i][j] = mat1[i][j] + mat2[i][j];
//            }
//            System.out.println();
//        }
//
        //Practice problem 5
        //reversing the array
//        int ([]arr = {1,2,3,4,5,6};
//        int l = arr.length;
//        int n = Math.floorDiv(l,2);
//        int temp;
//
//        for(int i = 0; i<n; i++){//swap a[i] and a[l-i-1]
//                                 //a  b temp
//                                 //|4| |3| ||
//            temp = arr[i];
//            arr[i]  = arr[l-i-1];
//            arr[l-i-1] = temp;
//        }
//        for(int element:arr){
//            System.out.print(element+" ");
//        }

        //practice problem 6
//        int []arr = {1,2,3,4,5,6,466,555,666,999999 };
//        int max   = 0;
//        for (int e:arr){
//         (   if(e>max){
//                max=e;
//            }
//        }
//        System.out.println("the value of max array is"+ max);

        //problem 7
        //how to find min array
//        int []arr = {1,2,3,4,5,6,466,555,666,999999 };
//        int min   = Integer.MAX_VALUE;
//        for (int e:arr){
//            if(e<min){
//                min=e;
//            }
//        }
//        System.out.println(" the value of min array is " + min);

        //problem 8
        int []arr = {1,2,3,4,5,6,466,555,666,999999 };
        boolean isShorted = true;
        for(int i = 0; i<arr.length-1;i++){
            if(arr[i] > arr[i+1]){
                isShorted = false;
                break;
            }
            }
        if(isShorted){
            System.out.println("the array is shorted");
        }else{
            System.out.println("the array is not shorted");
        }
        }

   }
