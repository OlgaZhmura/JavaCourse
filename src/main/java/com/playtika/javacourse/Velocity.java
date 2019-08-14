/*
Пользователь вводит время в минутах и расстояние в километрах. Найдите скорость в м/c.
 */
package com.playtika.javacourse;

import java.util.Scanner;

public class Velocity {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter distance in km:");
        int distance = scanner.nextInt() * 1000;
        System.out.println("Enter time in minutes:");
        int time = scanner.nextInt() * 60;

        int velocity = distance / time;
        System.out.printf("Velocity is %d m/sec if distance = %d km and time = %d min", velocity, distance/1000, time/60);
    }
}
