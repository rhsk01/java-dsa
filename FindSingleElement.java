package com.company;

public class FindSingleElement {
    public static void main(String[] args){
        int[] a = {5,4,2,3,4,5,3};
        int result = a[0];
        for(int i = 1; i<a.length; i++){ // 1 because 0 already in the result
            result = result^a[i];  //5^4^2^3^4^5
        }
        System.out.println("single element is: "+result);
    }
}
