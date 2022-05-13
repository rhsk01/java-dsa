package com.company;
import java.util.Scanner;
public class VowelAndConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Alphabet");
        char ch = sc.next().charAt(0);
        if( ch =='a' || ch =='e' ||ch =='i' || ch =='o' ||ch =='u' || ch =='A' ||ch =='E' || ch =='I' || ch=='O'||ch=='U')
        {
            System.out.println("Entered char is " +ch+" vowel");
        }else{
            System.out.println("Entered char is " +ch+" consonant");
        }
    }

}
