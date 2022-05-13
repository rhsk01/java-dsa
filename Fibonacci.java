package com.company;

public class Fibonacci {

    // bottom up Approach
//    public static int fib(int n){
//        int[] table = new int[n+1]; // 0-->n
//        table[0] =0;
//        table[1] =1;
//
//        for(int i = 2; i <= n; i++){
//            table[i] = table[i-1]+table[i-2];
//        }
//        return table[n];
//    }

    // Top-down approach
    public static int fib(int[] memo, int n){  // 0 to 6
        if(memo[n] == 0){
            if(n < 2){
                memo[n] = n;  // 0 and 1
            }
            else{
                           // the current number is the sum  of its preceding two numbers
                int left = fib(memo, n-1);
                int right = fib(memo, n-2);
                memo [n] = left+right;
            }
        }
        return memo[n];
    }

    public static void main(String[] args) {
         Fibonacci fb  = new Fibonacci();
//         System.out.println("the 6th fibonacci number is"+Fibonacci.fib(6));
        System.out.println("thr 6 th fibonacci numbr is "+Fibonacci.fib(new int[6+1],6));
    }
}
