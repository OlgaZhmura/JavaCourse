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

    public static void main(String[] args) {
        String courseName = "Курс: Java core";
        String student = "Студент";
        String fio = getInput();

        if(fio.length() >= courseName.length()){
            drawStars(fio.length());
            writeText(fio.length(), courseName);
            writeText(fio.length(), student);
            writeText(fio.length(), fio);
            drawStars(fio.length());
        }
        else{
            drawStars(courseName.length());
            writeText(courseName.length(), courseName);
            writeText(courseName.length(), student);
            writeText(courseName.length(), fio);
            drawStars(courseName.length());
        }
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
        for(int i=0; i<lenth+4; i++){
            System.out.printf("*");
        }
    }

    public static void writeText(int lenth, String str){
        lenth += 4;
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
}
