package com.company;
import java.util.Scanner;
public class CWH_19_ch4pr {
    public static void main(String[] args) {
        int a, b, c;
        //    Scanner sc = new Scanner(System.in);
    /*    System.out.println("enter your marks");
        System.out.println("Physics");
        a = sc.nextInt();
        System.out.println("chemistry");
        b =  sc.nextInt();
        System.out.println("math");
        c = sc.nextInt();
        float avg = (a+b+c)/3.0f;
        if(avg>=40 && a>33 && b>33 && c>33 ){
            System.out.println("passed");
        }else{
            System.out.println("try again");
        }*/
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter your income in lakhs");
//        float tax = 0;
//        float income = sc.nextFloat();
//        if(income<=2.5f){
//            tax = tax+0;
//        }else if(income>2.5f && income<=5.0f){
//            tax = tax+0.05f*(income-2.5f);
//        }else if(income>5.0f && income<=10.0f){
//            tax = tax+0.05f*(5.0f-2.5f);
//            tax = tax+0.02f*(income-5.0f);
//        }else if(income>10.0f){
//            tax = tax+0.05f*(5.0f-2.5f);
//            tax = tax+0.02f*(10.0f-5.0f);
//            tax = tax+0.03f*(income-10.0f);
//        }
//        System.out.println("tax paid by you" + tax);
//

        //calling day by number
        //  Scanner sc = new Scanner(System.in);
        //  int day = sc.nextInt();
//        switch (day) {
//            case 1 -> System.out.println("monday");
//            case 2 -> System.out.println("tuesday");
//            case 3 -> System.out.println("wednesday");
//            case 4 -> System.out.println("thursday");
//            case 5 -> System.out.println("friday");
//            case 6 -> System.out.println("saturday");
//            case 7 -> System.out.println("sunday");
//        }


//        Scanner sc = new Scanner(System.in);
//        System.out.println("enetr a year");
//        int year = sc.nextInt();
//        if (year % 100 == 0) {
//            if (year % 400 == 0) {
//                System.out.println("leap year");
//            } else {
//                System.out.println("normal year");
//            }
//        }
//        else if(year%4==0){
//            System.out.println("leap year");
//        }
//        else{
//            System.out.println("not leap");
//        }
        Scanner sc = new Scanner(System.in);
        String web = sc.next();
        if (web.endsWith(".org")){
            System.out.println("organisation");
        }else if(web.endsWith(".in")){
            System.out.println("indian");
        }else if(web.endsWith(".com")){
            System.out.println("commercial");
        }



    }
}