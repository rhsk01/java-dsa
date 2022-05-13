package com.company;

public class Star_Pyramid_reverse_7 {
    public static void main(String[] args) {
        //way 1
        for(int i =1;i <=4;i++){
            for(int j = 1;j<=i;j++){ //for spaces
                System.out.print(" ");
            }
            for(int k =4;k>=i;k--){
                System.out.print("*");
            }
            for(int l =3;l>=i;l--){
                System.out.print("*");
            }
            System.out.println();
        }
        //way 2
        for(int i =1;i<=4;i++){
            for(int j =1;j<=i;j++){
                System.out.print(" ");
            }
            for(int k =9;k>(i*2);k--){ //k=9 because two spaces and 7 star = 9 column
                System.out.print("*");
            }
            System.out.println();
        }
        //way 3
        for(int i=5;i>=1;i--){
            for(int j =5;j>i;j--){
                System.out.print(" ");
            }
            for(int k = 1;k<(i*2);k++){
                System.out.print("*");
            }
            System.out.println();
        }
        //for masti
        for(int i =1;i<=5;i++){
            for(int j =4;j>=i;j--){
                System.out.print(" ");
            }
            for(int k =1;k<(i*2);k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
