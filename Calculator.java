package com.company;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num1");
        int num1 = sc.nextInt();
        System.out.println("enter num2");
        int num2 = sc.nextInt();
        System.out.println("select symbol(+,-,/,*)");
        String sym = sc.next();
        int res;
        switch(sym){
            case"+":res = num1+num2;
                System.out.println("addition is "+res);
                break;
            case"-":res = num1-num2;
                System.out.println("substraction is"+res);
                break;
            case"*":res = num1*num2;
                System.out.println("multiplication is"+res);
                break;
            case"/":res = num1/num2;
                System.out.println("division is "+res);
                break;
            default:
                System.out.println("invalid symbol");
                break;
            }
        }
    }

