package com.company;

public class CWH_24_break_and_continue {
    public static void main(String[] args) {
        //break and continue statements using loops;
//        for(int i = 0; i<50;i++){
//            System.out.println(i);
//            System.out.println("java is good");
//            if (i==3){
//                System.out.println("end");
//                break;
//            }
 //       }


//        int i = 0;
//        while(i<5){
//            System.out.println(i);
//            System.out.println("java is good");
//            if (i==3) {
//                System.out.println("end");
//                break;
//            }
//            i++;
//               }

//        for(int i = 0; i<50;i++){
//            if (i==3){
//                System.out.println("end");
//                continue;//3 ko skip kr dega //niche ki lines ko skip kr dega
//            }
//            System.out.println(i);
//            System.out.println("java is good");
//                   }
//
                int i = 0;
        while(i<5){
            i++;

            if (i==3) {
                System.out.println("end");
                continue;
            }
            System.out.println(i);
            System.out.println("java is good");

               }

    }
}