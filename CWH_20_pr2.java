package com.company;
import java.util.Random;
import java.util.Scanner;
public class CWH_20_pr2 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int j = 0;
        int k = 0;
        while(i<5) {
            System.out.println("write your number with in (0,1,2).");
            int input = sc.nextInt();
            switch (input) {
                case 0 -> System.out.println("rock");
                case 1 -> System.out.println("paper");
                case 2 -> System.out.println("scissor");
            }
            int rand1 = rand.nextInt(0, 3);
            switch (rand1) {
                case 0 -> System.out.println("rock");
                case 1 -> System.out.println("paper");
                case 2 -> System.out.println("scissor");
            }
            if (input == 1 && rand1 == 0 || input == 2 && rand1 == 1 || input == 0 && rand1 == 2) {
                System.out.println("you win");
                ++j;}
            else if (input == 0 && rand1 == 0 || input == 1 && rand1 == 1 || input == 2 && rand1 == 2) {
                System.out.println("draw");}
            else {System.out.println("computer win");
                ++k;}
            i++;
        }
        System.out.print("The final Result is:");
        if(j>k){System.out.println("you win.");}
        else if(k>j){System.out.println("computer win.");}
        else{System.out.println("it's a draw.");}

    }
}