/*
Пользователь вводит последовательность символов.
Программа должна определить, является ли последовательность палиндромом.
Вывести ДА, если последовательность символов палиндром и НЕТ в противном случае.
 */
package javacourse.homework;

import java.util.Scanner;

public class HW3Task1 {

    public static String getInput() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please, enter any value:");
        String input = scan.nextLine();

        while (input.length() <= 1) {
            System.out.println("The value must contain more than one character, please try again:");
            input = scan.nextLine();
        }
        return input;
    }

    public static boolean isPolindrom(String string) {
        int length = string.length();

        for(int i = 0; i < length / 2; i++) {
            if(string.charAt(i) != string.charAt(length-i-1)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPolindroAnotherWay(String str) {
        int midIndex = str.length() / 2;

        if(str.length() % 2 != 0) {
            midIndex += 1;
        }
        StringBuilder substring = new StringBuilder(str.substring(midIndex, str.length()));
        substring = substring.reverse();
        if(str.substring(0, str.length()/2).equals(substring.toString())) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void displayResult(boolean numIsPolindrom) {
        System.out.println(numIsPolindrom);
    }

    public static void main(String[] args) {
        String string = getInput();
        displayResult(isPolindrom(string));
        displayResult(isPolindroAnotherWay(string));
    }
}