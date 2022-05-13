package com.company;

public class CWH_33_vararguments {
    //var args me aap ek function ko ek se jyada argument de skte hai
//    static int sum(int a,int b){
//        return a+b;
//    }
//    static int sum(int a,int b,int c){
//        return a+b+c;
//    }

 //   static int sum(int...arr){ //...says mujhe jitne bhi argumnts mile unhe ek array me pack krke mujhe de do yhi var args hote hai
                             //available as int []arr
        static int sum(int x,int...arr){
        int result = x;
        for(int a:arr){
            result += a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("welcome dear");
      //  System.out.println("the value of nothing is" +sum());//but when i'll write an (int a) as complusory parametr in method then it will produce the error
                                                               //in this case i have to write atleast 1 argumensts
        System.out.println("the valuve of a+b is " + sum(6));
        System.out.println("the value of a+b is: " + sum(4,5));
        System.out.println("the value of a+b is: " + sum(4,5,6));

    }
}
