package com.company;
import java.util.Scanner;
public class Reverse__the_number {
    public static void main(String[] args) {
        Scanner reverse = new Scanner(System.in);
        System.out.println("enter the number");
        int no = reverse.nextInt();
//        int no = 87632763;
        int rem;
        int rev=0;
        while(no!=0){
            rem = no % 10;
            rev = rev * 10 + rem;
            no = no/10;
        }
        System.out.println(rev);
    }
}
