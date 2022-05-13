package com.company;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner facto = new Scanner(System.in);
        System.out.println("enter the number");
        int a = facto.nextInt();
        int fact = 1;
//        for(int i = 1; i <=a; i++){
        for(int i = a; i >=1; i--){
            fact = fact*i;
        }
        System.out.println("factorail value is "+fact);
    }
}
