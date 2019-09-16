/*
На основе калькулятора net.wolf.javacourse.calculator создать собственную программу - калькулятор. Реализовать методы:
сложение 			(X + Y)
вычитание 			(X - Y)
умножение 			(X * Y)
деление 			(X  / Y)
возведение в степень 	(X  ^ Y)
логарифм по основанию 	(X log Y)
корень 			(X sqrt Y)

Команда должна создаваться в отдельном классе.
Пользователь вводит выражение X Operator Y, где X и Y - числа,  и получает ответ.
Парсинг выражения пользователя должен происходить также в отдельном классе.

Примичание:
1. логарифм по основанию можно преобразовать:
logB ( N ) = log (N) / log (B)
то есть, логарифм с основанием 2 от 256 = Math.log(256) / Math.log(2)

2. корень N-степени из числа A можно преобразовать в A в степени 1/N
Math.pow(A, 1.0/N)
 */
package javacourse.homework.homework5;

import java.util.Scanner;

public class Calculator {

    private double calculate(double val1, double val2, String operator) {
        Operator oprtr = Operator.getOperatorFromString(operator);
        BinaryOperationFactory bof = new BinaryOperationFactory();
        BinaryOperation operation = bof.getOperationFor(oprtr);

        if (operation == null) {
            System.out.println("Unknown operator " + operator);
            return Double.NaN;
        }
        return operation.resultFor(val1, val2);
    }

    private String getInput() {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        while (input.isEmpty() || input.length() < 5) {
            System.out.println("Incorrect expression, please try again:");
            input = scan.nextLine();
        }
        return input;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("Please, write an expression with spaces between operands and operator.\nFor ex.: 3 + 4\n");

        String input = calculator.getInput();
        Parser parser = new Parser();

        double val1 = Double.valueOf(parser.parse(input)[0]);
        double val2 = Double.valueOf(parser.parse(input)[2]);
        String operator = parser.parse(input)[1];

        double res = calculator.calculate(val1, val2, operator);

        System.out.println(Math.round(res * 100) / 100.d);
    }
}