package com.company;

public class CWH_32_METHOD_OVERLOADING {
    static void foo(){
        System.out.println("hello good morning bro!!!");
    }


    static void foo(int a){//int a is an argument it means koi bhi argument apka method le  rha hai, use aage use kr payega
        System.out.println("hello " + a + " bro good morning");
    }

    static void foo(int a,int b){ //Function parameters are the names listed in the function's definition.
                                  // Function arguments are the real values passed to the function.
        System.out.println("hello " + a + " bro good morning");
        System.out.println("hello " + b + " bro good morning");
    }

    static void change (int a ){
        a =87;
    }

    static void change2 (int []arr){
        arr[0] = 98;
    }

    static void telljoke(){         // we use void jb hme methode se kuchh bhi return nai krana hota
        System.out.println("i invented a joke ");
    }


    public static void main(String[] args) {
       // telljoke();
        //case 1 changing the integer
//        int[]marks = {87,88,89,78,76};
//        int x = 45;//no change as method change krne se main method me koi change nai hoga
//        change (a);
//        System.out.println(a);

        //case 2 changing the array
//        int[]marks = {87,88,89,78,76};//yha array ki value change ho gyi,marks is a reference in this array ka address store hai
//        change2(marks);//when we write change 2 then address ka pta memory ko pass ho jata hai and method me change2 ke andar isi object ka reference gya hai
//                       //esiliye ye change ho jayega
//        System.out.println("the value of array after chnaging "+ marks[0]);

        //method overloading
        //methode over loading parameters ko chnage krke krte hai na ki return type ko
        foo();
        foo(300);//arguments real value
        foo(350,450);//arguments are actual

    }
}
