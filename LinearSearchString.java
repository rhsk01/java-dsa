package com.company;

public class LinearSearchString {
    public static void main(String[]args){
        String[] arr = {"sahaj","vikash","saurabh","chatterji","rakesh","subhali","sukhmani"};
        String item = "rakesh";
        int temp = 0;
        for(int i = 0;i<arr.length; i++){
            if(arr[i].equals(item) ){   //equal is a method of string class it compares  two strings
                System.out.println("item present: "+i+" index position");
                temp  = temp+1;
            }
        }
        if(temp == 0){
            System.out.println("item not found");
        }
        }
    }

