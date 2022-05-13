package com.company;

public class CWH_25_pr5 {
    public static void main(String[] args) {
        //preactice problem 1
//        int n = 4;
//        for(int i = n; i>0; i-- ){
//            for(int j = 0;j<i; j++){
//
//            System.out.print("*");
//        }
//        System.out.print("\n");
//    }
        //pr 2
//        int sum = 0;
//        int n = 4;
//        for(int i =0;i<n;i++){
//            sum = sum+(2*i);
//
//        }
//        System.out.println("sum of even numbers is");
//        System.out.println(sum);

        //pr 3
//        int n = 5;
//        for(int i = 0;i<=10; i++){
//            System.out.printf("%d X %d = %d \n" ,n,i,n*i);//important
//        }

        //pr 4
//        int n = 10;
//        for(int i=10;i>=1;i--){
//            System.out.printf("%d X %d = %d \n",n,i,n*i);
//        }

        //pr 6
//        int n = 3;
//        int i = 1;
//        int factorial = 1;//when we do sum then we take initial sum 0,and in product case we take initial value 1
//        while(i<=n){
//            factorial *= i;//means factorial ko i se multiply krke update kr do
//            i++;
//        }
//        System.out.println(factorial);

        //pr 9
//        int n = 8;
//        int sum =0;
//        for(int i = 0;i<=10; i++){
//            sum += n*i;
//        }
//        System.out.println(sum);
//
        int sum = 0;
        int n = 2;
        int i = 0;
        while (i<n){
        i++;
            sum = sum+(2*i);
        }
        System.out.println(sum);

   }
}
