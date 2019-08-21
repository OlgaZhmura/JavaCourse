package com.playtika.javacourse;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Patterns {
    static void passportSeries() {
        Pattern pattern = Pattern.compile("^[A-Z]{2}[0-9]{4}$]");
        Scanner scan = new Scanner(System.in);

        System.out.println("Please, enter a series of passport:");
        while (scan.hasNextLine()) {
            String line = scan.nextLine();

            if (pattern.matcher(line).matches()) {
                System.out.println("The series of passport is correct!");
                return;
            }
            else {
                System.out.println("The series of passport isn't correct! Please try again:");
            }
        }
    }

    public static void main(String[] args) {
        passportSeries();
    }
}
