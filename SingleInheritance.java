package com.company;

public class SingleInheritance {
    void showA() {
        System.out.println("a class method");
    }

static class B extends SingleInheritance{
        void showB(){
            System.out.println("b class method");
        }
}
static class C extends B{
        void shoeC(){
            System.out.println("c class method");
        }
}
    public static void main(String[] args) {
        SingleInheritance si = new SingleInheritance();
        si.showA();
        System.out.println("____________________");
        B ob2 = new B();
        ob2.showA();
        ob2.showB();
        System.out.println("--------------------");
        C ob3 = new C();
        ob3.showA();
        ob3.showB();
        ob3.shoeC(); // here i am calling a,b,c all method from c it is multilevel inheritance

    }
}
