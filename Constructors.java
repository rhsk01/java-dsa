package com.company;

import java.util.concurrent.Callable;

public class Constructors {
   /* int i = 0;
    String s;
    public static void main(String[] args) {
        Constructors ct = new Constructors();
        System.out.println(ct.i+" "+ct.s);    // this was for default constructors where compiler itself creates constructors
    }*/

 /*   Constructors(){     //if we will provide here parameters and will call them in main method then it will be paramitric consytroctrs
        System.out.println("no arguments constructors");

    }
    public static void main(String[] args) {
       Constructors ct = new Constructors();

            }  //here we have created constructors so  object will call itself
        }*/

    Constructors(int a){
        System.out.println("parametrized constructors");
    }
    public static void main(String[] args) {
        Constructors ct = new Constructors(10);
    }
}




