/*
Пользователь вводит цены 1 кг конфет и 1 кг печенья. Найдите стоимость:
а) одной покупки из 300 г конфет и 400 г печенья;
б) трех покупок, каждая из 2 кг печенья и 1 кг 800 г конфет.
 */
package com.playtika.javacourse;

import java.util.Scanner;

public class Purchase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the price for 1kg of candies:");
        double priceCandies = scan.nextDouble();
        System.out.println("Enter the price for 1kg of cookies:");
        double priceCookie = scan.nextDouble();

        double price300gCandies = 300 * priceCandies / 1000;
        System.out.printf("\nYou should pay $%f for 300g Candies", price300gCandies);

        double price400gCookie = 400 * priceCookie / 1000;
        System.out.printf("\nYou should pay $%f for 400g Cookie", price400gCookie);

        double price3purchase = 3 * (1.8 * priceCandies + 2.0 * priceCookie);
        System.out.printf("\n\nYou should pay $%f for 3 purchases of 1.8kg Candies and 2kg Cookie", price3purchase);
    }
}
