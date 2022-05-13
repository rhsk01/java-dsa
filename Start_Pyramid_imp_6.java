package com.company;

public class Start_Pyramid_imp_6 {
    public static void main(String[] args) {
        for(int i =1 ; i<=4;i++){
            for(int j = 4;j>=i;j--){
                System.out.print(" ");
            }
            for(int k = 1;k<=i;k++){
                System.out.print("*");
            }
            for(int l = 2;l<=i;l++){ //because second star pattern will start from 2nd column
                System.out.print("*");
            }
            System.out.println();
        }
        //second pattern
        for(int i = 1;i<=4;i++){
            for(int j =4;j>=i;j--){
                System.out.print(" ");
            }
            for(int k = 1;k<(i*2);k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
