package com.company;

public class Uses_of_this_keyword {
    //6 uses of this keyword
    //1.this keyword can be used to invoke current class instance variable
    int i ;
    void setvalues(int i){
        this.i = i;
    }void show(){
        System.out.println(i);
    }
    //2.this keyword can be used to invoke current class method (implicitly..compiler generates itself)
    void display(){
        System.out.println("hello");
        }
        void show1()
        {
        this.display();//here compile itself generated this keyword
    }

    //3.this keyword can be used to invoke current class constructor
    Uses_of_this_keyword (){
        System.out.println("no arg constructor");
    }
    Uses_of_this_keyword(int a ){
        this();//now it will call the cureent class constructor too
        System.out.println("parameterised constructor");
    }

    //4.this keyword can be used to pass an args int the method call
    void m1(Uses_of_this_keyword t){
        System.out.println("im in m1 method");
    }void m2(){
        m1(this);
    }

    //5.this keyword can be used to pass as an argument in the constructor call
    class test{
        test(Uses_of_this_keyword t ){
            System.out.println("test class constructor");
        }
    }
    void n1(){
        test t1 = new test(this);
    }

    //6.this keyword can be used to return the current class instance from the method
    Uses_of_this_keyword l1(){
        return this;
    }
        public static void main(String[] args) {
        Uses_of_this_keyword t = new Uses_of_this_keyword(10);//it will call the constructor itself//used for3rd method of this too
        t.setvalues(100);
        t.show();//1
        t.show1();//2
            t.m2();//4
            t.n1();//5
            t.l1();//6


    }
}
