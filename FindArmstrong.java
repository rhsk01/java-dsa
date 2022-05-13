package com.company;
import java.util.Scanner;
public class FindArmstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num 1");
        int a = sc.nextInt();
        System.out.println("enter num 2");
        int b = sc.nextInt();
        Armstrong(a,b);
    }
    static void Armstrong( int a,int b){
        for(int i=a; i <=b;i++){
             int num = i;
            int rev = 0;
            while(num>0){
                 int rem = num%10;
                rev= rev+(rem*rem*rem);
                num =num/10;
            }
            if(rev==i){
                System.out.println(rev);
            }
        }
    }
}
