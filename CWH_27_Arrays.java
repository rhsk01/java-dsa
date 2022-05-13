package com.company;

public class CWH_27_Arrays {
    public static void main(String[] args) {
//        float[] marks = {78.5f,87.8f,98.4f,86,89};
//        String [] students = {"raja" ,"rani"};
        int []  marks = {78,87,98,86,89};
//        System.out.println(marks.length);//kisi bhi data type ka array bn skta hai

        //naive method of displaying the array
//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//        System.out.println(marks[2]);
//        System.out.println(marks[3]);
//        System.out.println(marks[4]);

        //displaying the array using for loop
        for(int i = 0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
        System.out.println("printing marks in reverse order");
        for(int i = marks.length-1; i>=0;i--){
            System.out.println(marks[i]);
        }

        //displaying the arrays
        System.out.println("printing using for-each loop");
        for(int element:marks){
            System.out.println(element);
        }


    }
}
