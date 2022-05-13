package com.company;

public class Star_Pattern_11 {
    public static void main(String[] args) {
        for(int i =1;i<=4;i++){ // i for row
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
