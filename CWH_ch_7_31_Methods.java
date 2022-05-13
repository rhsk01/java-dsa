package com.company;

public class CWH_ch_7_31_Methods {
    static int logic(int x,int y){  //ye method sbhi ke liye kam krega like a fridge in a hostel
        int z;                      // if we modify x ,y value inside method then the values in main method will not change
        if (x > y) {                //static method class se assosiate ho jata hai na ki class ke obect se
            z = x+y;
        }else {
            z = (x+y)*5;
        }
        return z;//it means laut chalo z ki value ke sath jha se aaye the
    }
    public static void main(String[] args) {
        int a = 2;
        int b = 4;
        int c;
       // method invocation using object creation ,we will use this method when we hadn't created static method
       // CWH_ch_7_31_Methods obj = new CWH_ch_7_31_Methods();
       // c = obj.logic(a,b);
        c = logic(a,b);
        System.out.println(c);

    }
}
