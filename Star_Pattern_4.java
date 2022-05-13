package com.company;

public class Star_Pattern_4 {
    public static void main(String[] args) {
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
    }
}

