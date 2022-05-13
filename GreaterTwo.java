package com.company;

public class GreaterTwo {
    public static void main(String[] args) {
        int a = 10,b = 20;
        if(a>b){
            System.out.println("a is greater ");
        }else{
            System.out.println("b is greater");
        }
        //for three integers
        int a1 = 30,b1 = 40,c = 50;
        if(a1>b1&&a1>c){
            System.out.println("a1 is greater");
        }else if(b1>a1&&b1>c){
            System.out.println("b1 is greater");
        }else{
            System.out.println("c is greater");
        }

        // second method for three numbers
        if(a1>b1){
            if(a1>c){
                System.out.println("a1 is greater ");
            }else{
                System.out.println("c is greater");
            }
        }
        else if(b1>c){
            System.out.println("b1 is greater ");
        }
        else{
            System.out.println("c is greater");
        }

    }
}
