package com.company;
import java.util.Scanner;
public class Check_prime_number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num :");
        int num = sc.nextInt();
        int temp = 0;
        for(int i = 2;i<=num-1;i++){
            if(num % i ==0){
                temp = temp+1;
            }
        }
        if(temp==0){
            System.out.println("\n "+num+"  is  prime");
        }else{
            System.out.println("\n "+num+" is not prime");
        }
    }
}
