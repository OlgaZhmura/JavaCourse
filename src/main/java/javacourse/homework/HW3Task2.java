/*
Пользователь вводит строку.
Программа разбивает строку на слова, и “переворачивает” каждое слово, формирует из новых слов предложение и выводит его на экран.

String[] words = “Sadfsdfs sdfsdf sdfsdf”.split(“ ”);
 */
package javacourse.homework;
import java.util.Scanner;

public class HW3Task2 {

    public static void main(String[] args) {
        String str = getInput();
        displayResult(writeBackwards(str));
    }

    public static String getInput() {
        String inputStr;
        Scanner scan = new Scanner(System.in);

        System.out.println("Please, enter any text:");
        inputStr = scan.nextLine();
        while (inputStr.length() == 0) {
            System.out.println("You haven’t written anything, please try again.");
            inputStr = scan.nextLine();
        }
        return inputStr;
    }

    public static String writeBackwards(String str) {
        String[] words = str.split(" ");
        StringBuilder newString = new StringBuilder();

        for (int i=0; i < words.length; i++) {
            StringBuilder reverseWord = new StringBuilder(words[i]);
            reverseWord = reverseWord.reverse();
            if (i == (words.length - 1)) {
                newString.append(reverseWord);
            }
            else {
                newString.append(reverseWord).append(" ");
            }
        }
        return newString.toString();
    }

    public static void displayResult(String str) {
        System.out.println(str);
    }
}