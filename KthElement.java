package com.company;

public class KthElement {
    public static void main(String[]args){
        int []a ={5,8,12,7,6,2,4};
        int k = 5; //kth element
        for(int i =0; i<a.length-1;i++) {
            for (int j = i + 1; j < a.length; j++) {  // if i =0 then ot will start j's value from 1 and so on
 //               if (a[i] < a[j]) { //for descending order
               if(a[i]>a[j]){    //for ascending order
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            if (i == k - 1) {
                System.out.println(k + " largest element " + a[i]);
                break; //it will save our time and will sort the list till where it's required
            }
        }
            System.out.println(".............");
            for(int i = 0; i<a.length;i++){
                System.out.print(a[i]+" ");
        }
        }
    }

