/*
Написать программу решающую следующие уравнения. Переменные x,y,z,n инициализируется перед решением уравнения.
Каждое решение оформить в отдельном статическом методе.
x - (y + 123) / z * n  		=> считаем в long
(x + (50 - y * z) / n) - x 	=> считаем в int
x / (y * (z - 1) - 564) + n 	=> считаем в float
-x / -y + z / (n + 15) 		=> считаем в double
*/

public class Homework1Task1 {
    public static void main (String[] args){
        long x1 = 2033, y1 = 5956, z1 = -4566, n1 = 12005;
        float x3 = 456.54f, y3 = 0.954f, z3 = -1.0325f, n3 = 4510f;
        double x4 = 65164.68, y4 = 4568.6312, z4 = 45.0214, n4 = -3.14101;

        System.out.println("Results:");
        System.out.println("1. Long: x1 - (y1 + 123) / z1 * n1 = " + example1(x1, y1, z1, n1) + ", where x1 = 2033, y1 = 5956, z1 = -4566, n1 = 12005 \n");
        System.out.println("2. Int: (x2 + (50 - y2 * z2) / n2) - x2 = " + example2() + ", where x2 = 68, y2 = 954, z2 = -325, n2 = 10");
        System.out.printf("\n3. Float: %f / (%f * (%f - 1) - 564) + %f = %f", x3, y3, z3, n3, example3(x3, y3, z3, n3));
        System.out.printf("\n\n4. Double: -%f / -%f + %f / (%f + 15) = %f", x4, y4, z4, n4, example4(x4, y4, z4, n4));
    }

    public static long example1(long x1, long y1, long z1, long n1) {
        return (x1 - (y1 + 123) / z1 * n1);
    }

    public static int example2() {
        int x2 = 68, y2 = 954, z2 = -325, n2 = 10;

        return ((x2 + (50 - y2 * z2) / n2) - x2);
    }

    public static float example3(float x3, float y3, float z3, float n3) {
        float res3 = x3 / (y3 * (z3 - 1) - 564) + n3;
        return res3;
    }

    public static double example4(double x4, double y4, double z4, double n4) {
        double res4 = -x4 / -y4 + z4 / (n4 + 15);
        return res4;
    }
}