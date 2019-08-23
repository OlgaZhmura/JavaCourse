/*
Пользователь задает длину массива (положительное число от 10 до 100).
Программа заполняет массив случайными числами. Выводит массив и все числа массива кратные 3-ем.

ThreadLocalRandom.current().nextInt(Integer.MAX_VALUE);
 */
package javacourse.homework;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class HW3Task3 {

    public static int getInput() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please, enter any value from 10 to 100: ");
        int length = scan.nextInt();

        while (length < 10 || length > 100)
        {
            System.out.println("This value is out of range, please try again:");
            length = scan.nextInt();
        }
        return length;
    }

    public static int[] fillArray(int length) {
        int[] array = new int[length];

        for (int i=0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(Integer.MAX_VALUE);
        }
        return array;
    }

    public static StringBuilder findNumbersMultiplesOf3(int[] array) {
        StringBuilder strNumbers = new StringBuilder();

        for (int i=0; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                strNumbers.append(array[i]).append(" ");
            }
        }
        return strNumbers;
    }

    public static void displayArray(int[] array) {
        for (int i = 0; i< array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
        int[] array = fillArray(getInput());

        displayArray(array);
        System.out.println("\nAll values which are multiples of 3:");
        System.out.println(findNumbersMultiplesOf3(array));
    }
}