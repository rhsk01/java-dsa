package com.company;
import java.util.ArrayList;
import java.util.Collections;
public class CollectionDemo {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(123);
        al.add(345);
        al.add(567);
        System.out.println(al.add("aaa"));
        System.out.println(al.contains("aaa"));
        System.out.println(al.isEmpty());
        al.clear();

        System.out.println(al);
        ArrayList al1 = new ArrayList();
        al1.add("abc");
        al1.add("def");
        al1.add("ghi");
        System.out.println(al1);

        al.addAll(al1);
        System.out.println(al);
    }
}
