package javacourse.homework;/*
Составить программу, которая будет разлаживать 5-ти значное число на отдельные цифры данного числа, слева-направо.
Число задается в параметре статического метода.
Каждую цифру вывести в отдельной строке.
45685
4
5
6
8
5
 */

public class Homework1Task2 {
    public static void main (String[] args){
        int num = 50643;

        System.out.printf("The number %d can be parsed into \n", num);
        System.out.println(num / 10000);
        System.out.println(num %10000 / 1000);
        System.out.println(num % 1000 / 100);
        System.out.println(num %100 / 10);
        System.out.println(num % 10);
    }
}
