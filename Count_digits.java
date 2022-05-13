package com.company;
import java.util.Scanner;
public class Count_digits {
    public static void main(String[] args)
{
  //  int number = 12345;
    System.out.println("Enter the number");
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    //declare a variable to count number of digits
    int count = 0;
    while(number != 0)
    {
        //pick last digit of the number and count one by one
        number = number / 10;
        count = count+1;

    }
    //display number of digits
    System.out.print("Number of Digits = "+count);
    }
}
