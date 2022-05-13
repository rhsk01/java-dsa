package com.company;

public class Masti {
    public static void main(String[] args) {
        for(int i = 1;i<=4;i++){
            for(int k = 1;k<=i;k++){  // for spaces
                System.out.print(" ");
            }
            for (int j = 4; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= 4; i++) {
            for (int j = 3; j >= i; j--) {  //for spaces
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= 4; i++) {
            for (int l = 1; l <= i; l++) {  //for spaces
                System.out.print(" ");
            }
            for (int m = 3; m >= i; m--) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i =1;i<=4;i++){
            for(int j=5;j>=i;j--){
                System.out.print(" ");
            }
            for(int k =1;k<(i*2);k++){
                if(k>1 && k<((i*2)-1)){
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        //reverse type
        System.out.println("..............................");
        for(int i =5;i>=1;i--){
            for(int j = 5;j>=i;j--){
                System.out.print(" ");
            }for(int k =1;k<(i*2);k++){
                if(k>1 && k<((i*2)-1)){
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        for(int i =0;i<=5;i++){
            for(int j =0;j<5;j++){
                if(i==j || i+j==(5-1)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }   for(int i =1;i<=4;i++){ // i for row
            for(int j =1;j<=4; j++){ // j for column
                System.out.print("*");
            }
            System.out.println();
        }
        //next type
        for(int i = 1;i<=4;i++){
            for(int j =1;j<=4;j++){
                if(i>=2 && j>=2 && i<=3 && j<=3){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    }

