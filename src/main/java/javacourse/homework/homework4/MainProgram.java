/*
Создать класс Point, который задает координаты в двумерном пространстве. Определить метод для расчета расстояния от текущей точки до указанной.
Point {
   float x;
   float y;

   float distance(Point pointTo)*;
}
*Для расчета дистанции нужно вычесть из одной точки другую и посчитать длину полученного вектора: (x1 - x2; y1 - y2) => sqrt(x’ ^ 2 + y’ ^ 2)

Создать класс Triangle, точки которого заданы классом Point. Определить методы для расчета периметра и площади треугольника.
А также метод классификации треугольника (равнобедренный, равносторонний, прямоугольный, произвольный).
Triangle {
   Point a;
   Point b;
   Point c;

   float perimeter();
   float square();
   String type();
}

Сгенерировать массив случайных треугольников. (100 000)
Найти первый попавшийся в массиве треугольник, заданного пользователем класса, вывести в консоль информацию о треугольнике, его периметр и площадь.
Если треугольник не найден, сообщить об этом пользователю.

Генерация 100000 треугольников…

Выберите класс треугольника для поиска:
1. Равнобедренный
2. Равносторонний
3. Прямоугольный
4. Произвольный

2

Найден равносторонний треугольник.
Индекс: 10
Треугольник[a(1;3) b(4;8) c(7;3)]
Периметр: 18
Площадь: 15

Дополнительно по желанию.
Подсчитать количество каждого из классов треугольников и вывести в консоль.
 */

package javacourse.homework.homework4;

import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        MainProgram function = new MainProgram();

        function.displayResult();
    }

    private void displayResult() {
        TriangleGenerator tg = new TriangleGenerator();
        Triangle[] trngls = tg.generateTriangles();
        int inputType = getInput();

        defineType(inputType, trngls);

        System.out.printf("\nAmong 100,000 triangles there are %d isosceles triangle(s), %d equilateral triangle(s), %d right triangle(s) and %d arbitrary triangle(s)",
                          countAllTypesTriangles(trngls)[0], countAllTypesTriangles(trngls)[1], countAllTypesTriangles(trngls)[2], countAllTypesTriangles(trngls)[3]);
    }

    private int getInput() {
        printMenu();

        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();

        while (input <= 0 || input > 4) {
            System.out.println("Incorrect number, please try again:");
            input = scan.nextInt();
        }
        return input;
    }

    private void printMenu() {
        System.out.println("Please, choose a type of triangles for founding:");
        System.out.println("1. Isosceles triangle\n" + "2. Equilateral triangle\n" + "3. Right triangle\n" + "4. Arbitrary triangle");
    }

    private void defineType(int typeTrngl, Triangle[] trngls) {
        int count = 0;

        for (int i = 0; i < trngls.length; i++) {
            if (trngls[i].getTypeTriangle() == typeTrngl) {
                printTemplateResult(trngls[i], i);
                count++;
            }
        }
        if(count == 0) {
            System.out.println("There are no necessary triangles in this array");
        }
    }

    private void printTemplateResult(Triangle trngls, int index) {
        System.out.println("Index = " + index);
        System.out.println(trngls.toString());
        System.out.println("Perimeter = " + trngls.getPerimeter());
        System.out.println("Square = " + trngls.getSquare() + "\n");
    }

    private int[] countAllTypesTriangles(Triangle[] trngls) {
        int[] amount = new int[4];

        for (int i = 0; i < trngls.length; i++) {
            int trnglType = trngls[i].getTypeTriangle();

            switch (trnglType) {
                case Triangle.TYPE_ISOSCELES:
                    amount[0] += 1;
                    break;
                case Triangle.TYPE_EQUILATERAL:
                    amount[1] += 1;
                    break;
                case Triangle.TYPE_RIGHT:
                    amount[2] += 1;
                    break;
                case Triangle.TYPE_ARBITRARY:
                    amount[3] += 1;
                    break;
            }
        }
        return amount;
    }
}