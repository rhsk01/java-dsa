package com.company;

public class Printing_prime_numbers {
    public static void main(String[] args) {
        int temp = 0;
        for(int no = 1;no<=100;no++){
        for(int i = 2;i<=no-1;i++) {
            if ( no %  i == 0) {
                temp = temp + 1;
            }
        }
            if(temp==0){
                System.out.print(" "+no);
            }else{
                temp=0;
            }
        }
    }
}

