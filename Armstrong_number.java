package com.company;
import java.util.Scanner;

public class Armstrong_number{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num");
        int num = sc.nextInt() ;
        int temp = num;
        int length = 0 ;
        while(temp!=0){
            temp = temp/10;
            length = length+1;

        }
        int temp1= num;
        int rem;
        int arm =0;
        while(temp1!=0){
            rem = temp1%10;
            int mul =1;

            for(int i = 1; i<=length;i++){
                mul = mul*rem;
            }
            arm = arm+mul;
            temp1 = temp1/10;
        }
        if(num==arm){
            System.out.println(num+"  is an armstrong number");
        }else{
            System.out.println(num+"  is not an armstrong number");
        }
    }

}
