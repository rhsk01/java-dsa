package com.company;

import java.util.Locale;

public class cwh_14_stringmethods {
    public static void main(String[] args) {
        String a = "Raja";
//        String name = new String("raja");//two types to write string
        int value = a.length();//length of string
        System.out.println(value);
        String b = a.toLowerCase();//b is variable name kuchh bhi lia ja skta hai //for lower case
        System.out.println(b);
        String c = a.toUpperCase();//for upper case
        System.out.println(c);

        String nonTrimmedString = "     Raja     ";
        System.out.println(nonTrimmedString);//we can directly print or we can make a new string
      /*  String trimmedString = nonTrimmedString.trim();
        System.out.println(trimmedString);*/ //will work same as below statement does
        System.out.println(nonTrimmedString.trim());//all spaces will be erased

        System.out.println(a.substring(2));//prefer notes of cwh
        System.out.println(a.substring(1,3));//prefer notes of cwh

        System.out.println(a.replace('j','M'));//prefer the notes

       System.out.println(a.startsWith("Ra"));
        System.out.println(a.endsWith("a"));

        System.out.println(a.charAt(3));

        System.out.println(a.indexOf("ja"));//search from starting
        System.out.println(a.indexOf("k",2));//na milne pr -1 return hota hai
        System.out.println(a.indexOf("j",2));

        System.out.println(a.lastIndexOf("a"));//searches from last
        System.out.println(a.lastIndexOf("j",2));

        System.out.println(a.equals("raja"));
        System.out.println(a.equals("Raja"));
        System.out.println(a.equalsIgnoreCase("raja"));//ye upper or lower case ko ignore kr deti hai

        System.out.println("i am an escape sequence char \n hye");// \n for new line
        System.out.println("i am an escape sequence char \t hye");// \t for tab place





    }
}
