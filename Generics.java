package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Generics {
    public static void main(String[] args) {
        ArrayList<Integer>  arrayList = new ArrayList();
       // arrayList.add("str1");
        arrayList.add(376);
        arrayList.add(67);
        //arrayList.add(new Scanner(System.in));
        int a  =  arrayList.get(2);
        System.out.println(a);
    }
}
