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
        long number = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Please, enter a positive number:");
        number = scan.nextLong();
        while(number < 0)
        {
            System.out.println("This value is not a positive number, please, try again.");
            number = scan.nextLong();
        }
        return number;
    }

    public static int findMin (long num){
        int min = 0;
        int temp = 0;

        temp = (int)(num % 10);
        min = temp;

        while (num > 0){
            if(min == 0){
                return min;
            }
            else {
                if(min > temp){
                    min = temp;
                }
                num /= 10;
                temp = (int)(num %10);
            }
        }
        return min;
    }

    public static int findMax (long num){
        int max = 0;
        int temp = 0;

        temp = (int)(num % 10);
        max = temp;

        while (num > 0){
            if(max == 9){
               return max;
            }
            else {
                if(max < temp){
                    max = temp;
                }
                num /= 10;
                temp = (int)(num %10);
            }
        }
        return max;
    }

    public static void displayResult(long input){
        System.out.printf("\nThe minimum digit of the number is %d", findMin(input));
        System.out.printf("\nThe maximum digit of the number is %d", findMax(input));
    }
}