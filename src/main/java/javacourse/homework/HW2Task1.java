/*
Напишите программу, в которой задаются данные(строки): имя, фамилия и отчество и  выводящую эти  данные в следующем виде:
********************************
*        Курс: Java core       *
*            Студент           *
*              ФИО             *
********************************
Необходимо, чтобы программа сама определяла нужную длину рамки.
Сама же длина рамки зависит от длины наибольшей строки внутри рамки.
Используя циклы for легко можно выровнять стороны рамки.
"Строка".length()
 */
package javacourse.homework;
import java.util.Scanner;

public class HW2Task1 {

    static final String COURSE_NAME = "Курс: Java core";
    static final String STUDENT = "Студент";
    static final int BORDER = 4;

    public static void main (String[] args) {

        String fio = getInput();

        printResult(fio);
    }

    public static String getInput (){
        String fio;
        Scanner scan = new Scanner(System.in);

        System.out.println("Please, enter your full name:");
        fio = scan.nextLine();

        return fio;
    }

    public static void drawStars (int lenth){
        System.out.println();
        for(int i=0; i<lenth+BORDER; i++){
            System.out.printf("*");
        }
    }

    public static void writeText(int lenth, String str){
        lenth += BORDER;
        int leftSide = (lenth - str.length()) / 2;
        int rightSide = lenth - str.length() - leftSide;

        System.out.printf("\n* ");
        for(int i=2; i<leftSide; i++){
            System.out.printf(" ");
        }
        System.out.printf("%s", str);
        for(int i=2; i<rightSide; i++){
            System.out.printf(" ");
        }
        System.out.printf(" *");
    }

    public static void printResult(String fio){
        int maxLenth = COURSE_NAME.length();

        if(fio.length() >= maxLenth){
           maxLenth = fio.length();
        }

        drawStars(maxLenth);
        writeText(maxLenth, COURSE_NAME);
        writeText(maxLenth, STUDENT);
        writeText(maxLenth, fio);
        drawStars(maxLenth);
    }
}