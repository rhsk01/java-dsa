package com.company;

public class CWH_35_Practice_set_on_methods {
//    static void multiplication(int n){
//        for(int i=1;i<=10;i++){
//            System.out.format("%d X %d = %d \n", n,i,n*i);
//        }
//    }

//    static void pattern1(int n){
//        for(int i=0;i<n;i++){ //we need n lines
//            for(int j=0;j<i+1;j++){ //we want to print star i+1 times
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }


        // sum(n) = sum(n-1) + n
        //sum(3) = 3 +sum(2)
        //sum(3) = 3+ 2 +sum(1)
        //sum(3) = 3+2+1
//    static int sumrec(int n){ //int cause we want to return the value and n means jitni value return krni hai
//        //base condition it tell recursive function ,where to stop
//        if(n == 1){
//            return 1;
//        }
//        return n + sumrec(n-1);
//    }


        static void pattern1(int n){
            for(int i=0;i<n;i++){ //we need n lines
                for(int j=0;j<n-i;j++){ //we want to print star i+1 times
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        static int fib(int n){
           /* if(n==1){
                return 0;
            }
            else if(n==2){
                return 1;
            }*/     //we can minimize it like this
            if(n==1||n==2){
                return n-1;
            }
            else {
                return fib(n-1) + fib(n-2);
            }
        }

  /*      static int sum(int x ,int...arr){
            int result = x;
            for(int a:arr){
                result += a;
            }
            return result;
        }*/

/*    static float avg(int...arr){
        int sum = 0;
        for(int a:arr){
            sum = sum+a;
        }
        float avg = sum/arr.length;
        return avg;
    }*/

        static void pattern_rec(int n) {
           if(n>0){
               pattern_rec(n-1);
               for(int i=0; i<n; i++){
                   System.out.print("*");
               }
               System.out.println();
           }
        }
        //pattern_rec(3)
        //pattern_rec(2) = 3 times * and  a new line
        //pattern_rec(1) = 2 times * and new line + 3 times * and  a new line
        //pattern_rec(0) = 1 times * and new line +2 times * and new line + 3 times * and  a new line

    static void temperature(float c){
            if(c==0){
                System.out.println("32 f");
            }
            else{
                float f = (c*9/5)+32;
                System.out.println(f+"faherenit");
            }
    }


//    static void temp(float c){
//    float f = (c*9/5)+32;
//    System.out.println(f+"frnt");
//}

    public static void main(String[] args) {
    // problem 1

//        multiplication(8);

    //problem 2

//        pattern1(4);

    //problem 3

//          int c = sumrec(3);
//          System.out.println(c);

    //problem 4

//          pattern1(4);

    //problem 5

                 //fibonacci series - 0,1,1,2,3,5,8,13,21,34
//          int result = fib(7);
//         System.out.println(result);

     //problem 6

//         float avg = avg(1,2,3,4,5,6,7);
//             System.out.println(avg);

     //problem 8

   //  pattern_rec(4);

     //problem 9
       temperature(37);


         }
    }



