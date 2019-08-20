/*
Есть целое положительное число (long). Программа должна определить наименьшую и наибольшую цифры, которые входят в состав данного числа.

У числа 15875:
	Наименьшее число: 1
	Наибольшее число: 8
 */
package javacourse.homework;
import java.util.Scanner;

public class HW2Task2 {

    public static void main(String[] args) {
        long number = getInput();

        displayResult(number);
    }

    public static long getInput (){
        Scanner scan = new Scanner(System.in);

        System.out.println("Please, enter a positive number:");
        long number = scan.nextLong();
        while(number < 0)
        {
            System.out.println("This value is not a positive number, please, try again.");
            number = scan.nextLong();
        }
        return number;
    }

    public static int[] findMinMax (long num){
        int temp = (int)(num % 10);
        int min;
        int max = min = temp;

        while (num > 0){
            if(min > temp){
                min = temp;
            }
            if(max < temp){
                max = temp;
            }
            num /= 10;
            temp = (int)(num %10);
        }
        return new int[] {min, max};
    }

    public static void displayResult(long input){
        int[] numMinMax = findMinMax(input);

        System.out.printf("\nThe minimum digit of the number is %d and the maximum is %d", numMinMax[0], numMinMax[1]);
    }
}