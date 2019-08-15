package com.playtika.javacourse;/*
Поменять значение двух переменных, не используя третью
 */

//import java.util.Scanner;

public class Replacement {
    public static void main (String[] args) {
        int num1 = 14;
        int num2 = 26;
        int length = String.valueOf(num1).length();
        System.out.println("The 1st number = " + num1 + " and the 2nd number = " + num2);

        num1 = Integer.valueOf(String.valueOf(num1) + String.valueOf(num2));
        num2 = Integer.valueOf(String.valueOf(num1).substring(0,length));
        num1 = Integer.valueOf(String.valueOf(num1).substring(length));
        System.out.printf("After replacing we have the 1st number = %d and the 2nd = %d", num1, num2);

/*
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the 1st number:");
        int num1 = scan.nextInt();
        System.out.println("Enter the 2nd number:");
        int num2 = scan.nextInt();

        num1 += num2;
        num2 = num1 - num2;
        num1 -= num2;
        */
    }
}
