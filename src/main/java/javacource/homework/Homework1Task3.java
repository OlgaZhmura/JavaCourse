package javacource.homework;/*
Напишите программу, которая для 3-х координат вектора x, y, и z, с основанием у начала координат вычисляет единичный вектор и выводит его на консоль.
Для нахождения единичного вектора, нужно посчитать длину исходного вектора и разделить каждую из координат на его длину.
Длина вектора - Math.sqrt(X * X + Y * Y + Z * Z)

Пример:
Единичный вектор для вектора (5, 0, 0) => (1, 0, 0)
 */

public class Homework1Task3 {
    public static void main (String[] args){
        double x = 26, y = -3, z = 10;
        double x1, y1, z1, vecLen;

        vecLen = Math.sqrt(x * x + y * y + z * z);
        System.out.println(vecLen);
        x1 = x / vecLen;
        y1 = y / vecLen;
        z1 = z / vecLen;

        System.out.printf("The unit vector for (%f, %f, %f) is (%f, %f, %f)", x, y, z, x1, y1, z1);
    }
}
