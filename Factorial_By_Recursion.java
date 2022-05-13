package com.company;
import java.util.Scanner;
public class Factorial_By_Recursion {
    int fact = 1;
    public static void main(String[] args) {
        Scanner fac = new Scanner(System.in);
        System.out.println("entre the num");
        int no = fac.nextInt();
        int res;
        Factorial_By_Recursion ob = new Factorial_By_Recursion();
        res = ob.calfact(no);
        System.out.println("factorial of  "+no+" is "+res);
    }
    int calfact(int no) {
        if (no > 1) {
            fact = fact * no;
            calfact(no - 1);
        }
        return fact;
    }
}
