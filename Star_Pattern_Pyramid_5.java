package com.company;

public class Star_Pattern_Pyramid_5 {
    public static void main(String[] args) {
        //first way
        for(int i=1;i<=4;i++){
            for(int j =4;j>=i;j--){
                System.out.print(" ");
            }
            for(int k =1;k<=i;k++){
                System.out.print(" *");
            }
            System.out.println();
        }
        //second way
        for(int i = 1;i<=4;i++){
            for(int j = 5;j>=1;j--){ //j=5,4,6 any number we can write it depends at how much space we want to print
                if(j>i){
                    System.out.print(" ");
                }
                else{
                    System.out.print(" *");
                }
            }
            System.out.println();
        }

    }
}
