package com.company;

public class cwh_17_logical {
    public static void main(String[] args) {
        System.out.println("for logical AND...");
        boolean a = true;
        boolean b = false;
        if(a&&b){
            System.out.println("y");
        }
        else{
            System.out.println("n");
        }

        System.out.println("for logical or...");
        boolean a1 = true;
        boolean b1 = false;
        if(a||b){
            System.out.println("y");
        }
        else{
            System.out.println("n");
        }
        System.out.println("for logical not...");
        System.out.println(!a);//just opposite look at notes for more explaination
        System.out.println(!b);


        }
}
