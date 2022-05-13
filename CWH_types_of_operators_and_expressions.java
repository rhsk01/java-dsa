package com.company;

public class CWH_types_of_operators_and_expressions {
    public static void main(String[] args) {
        int a = 4;
        int b = 6%a;// = is assignment operator means we are assigning 6*4 to b
                    //% modulo opertor
        System.out.println(b);
        int b1 = 9;
        b1*=3;//means b= b*3;
        System.out.println(b1);
        System.out.println(89==98);//comparison operator
        System.out.println(67>68&&78<98);
        System.out.println(67<68&&78<98);//and operator jb tak sari conditions true nai hogi will not print true or false
        System.out.println(89>98 || 78<87);// || or operator agr 2 me se koi ek bhi true hoga to true print kr dega
        System.out.println(2&3);//bitwise operator

    }
}
