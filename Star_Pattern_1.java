package com.company;

public class Star_Pattern_1{
    public static void main(String[] args) {
        for(int i =1;i<=4;i++){ // for rows ye to hmesha rhega hi
            for(int j = 1;j<=i;j++){ //for column
                System.out.print("*");
            }
            System.out.println();
        }
        // for reverse order of stars
        for(int i = 1;i<=4;i++){
            for(int j=4;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
