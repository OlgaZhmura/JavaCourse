/*
Реализовать программу, которая заполняет массив размерности NxN по заданному правилу:
   1   3   4   10  11
   2   5   9   12  19
   6   8   13  18  20
   7   14  17  21  24
   15  16  22  23  25
То есть, заполнение массива должно быть по диагонали, сверху-вниз, слева-направо. Причем заполнение еще и зигзагообразное.
 */
package javacourse.homework;

public class HW3Task5 {
    private int[][] fillMatrix() {
        int[][] matr = new int [5][5];
        int counter = 1;

        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j <= i; j++) {
                matr[i-j][j] = counter++;
            }
        }

        return matr;
    }

    private void display(int[][] matr) {
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr.length; j++) {
                System.out.printf("%d ", matr[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        HW3Task5 obj = new HW3Task5();
        obj.display(obj.fillMatrix());
    }
}
