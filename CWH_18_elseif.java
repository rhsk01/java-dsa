package com.company;
import java.util.Scanner;
public class CWH_18_elseif {
    public static void main(String[] args) {
       // char var = 'r';
        String str = "LOVE";


        switch (str) {
            case "LOVE" -> System.out.println("adult");
            case "lovely" -> System.out.println("job");
            case "PYR" -> System.out.println("retired");
            default -> System.out.println("enjoy");
        }



//        Scanner sc = new Scanner(System.in);
//        int age;
//        System.out.println("enter the age");
//        age = sc.nextInt();
//        if(age>56){
//            System.out.println("old");
//        }else if(age>45){
//            System.out.println("half old");
//        }else if(age >30){
//            System.out.println("young");
//        }
    }
}

