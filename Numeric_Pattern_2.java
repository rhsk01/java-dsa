package com.company;

public class Numeric_Pattern_2 {
    public static void main(String[] args) {
        int count=0;
        for(int i =1;i<=4;i++){

            for(int j = 1;j<=i;j++){
                count = count+1;
                System.out.print(count+" ");
            }
            System.out.println();
        }
        //for masti
        int count1=0;
        for(int i =1;i<=4;i++){
            for(int j =4;j>=i;j--){
                count1= count1+1;
                System.out.print(count1+" ");
            }
            System.out.println();
        }
    }
}
