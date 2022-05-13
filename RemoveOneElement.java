package com.company;

public class RemoveOneElement {
    public static void main(String[] args) {
        int [] a = {10,20,30,40,50,60};
        int delete = 50;
//        int delete = 100;     //we'll check if element isn't in array then
//        int count = 0;
        for(int i = 0;i<a.length;i++){
            if(delete == a[i]){
                for(int j = i;j<a.length-1;j++){  //a.length-1 otherwise it will throw an execption out of bond
                    a[j] = a[j+1];
                }
              //  count = count++;  //for condition when element is not in array
                break;
            }
        }
//        if(count==0){
//            System.out.println("element is not found ");
//        }
//        else{
//            System.out.println("element found ");

          for(int i = 0;i<a.length-1;i++){   // we'll traverse the array till the one element before
//        for(int i = 0;i<a.length;i++){       //when elemnt is not in array for that
            System.out.print(a[i]+" ");
        }
    }
}
