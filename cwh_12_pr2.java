package com.company;

public class cwh_12_pr2 {
    public static void main(String[] args) {
        float a = 7/4.0f *9/2.0f ;
        System.out.println(a);

        char grade = 'b';
        grade = (char)(grade+8);//char likha otherwise cahr+int = int ho jata,while i want char
        System.out.println(grade);
        //decript
        grade = (char)(grade-8);
        System.out.println(grade);

    }
}
