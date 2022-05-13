package com.company;

public class Keyword_super {
    //uses of super keyword
    //1.Super keyword can be used to refer immediate parent class instance variable.
    //   int a =10;

    //2.super can be used to invoke immediate parent class method
//    void m1() { //for 2
//        System.out.println("i m in parent class");

    //3.super class can be used to invoke immediate parent class
    Keyword_super () { //for 3
        System.out.println("i m in parent class");
    }
}
    class B extends Keyword_super {
//        int a = 20;
//        void show(int a)
//        {
//            System.out.println(a);      //30
//            System.out.println(this.a); //20
//            System.out.println(super.a);//10
//        }

//        void m1(){ // for 2
//            System.out.println("i m in child class");}
//        void  show(){
//            m1();
//            super.m1();
//        }

        B (){ // for 2
            super();//if we'll not write super then compiler will itself call it
            System.out.println("i m in child class");}

        public static    void main(String[] args) {
            B ob1 = new B(); // is used for 3 too.
//            ob1.show(30);//for 1
//            ob1.show(); //for 2
        }
    }



