/*
Сначала единственным программистом в компании был ее основатель, а каждый следующий программист, которого нанимали на работу, проходил по одному собеседованию с каждым из программистов, которые уже работали в компании на тот момент.
Зная текущее количество программистов (вводится пользователем), определите, сколько всего собеседований было проведено в стенах компании.
Задачу решить с помощью рекурсии.
 */
package javacourse.homework;
import java.util.Scanner;

public class HW2Task3 {

    public static void main(String[] args) {
        int input = getInput();

        displayResult(input);
    }

    public static int getInput(){
        Scanner scan = new Scanner(System.in);
        int number = 0;

        System.out.println("Please, enter the number of developers: ");
        number = scan.nextInt();
        while(number < 0)
        {
            System.out.println("This value is not a positive number, please, try again.");
            number = scan.nextInt();
        }
        return number;
    }

    public static int countInterviews(int num){
        int result = 0;


        if (num == 1){
            return 0;
        }
        result = countInterviews(num - 1) + num - 1;
        return result;
    }

    public static void displayResult(int input){
        switch (input){
            case 0:
                System.out.println("There are no programmers in this company.");
                break;
            case 1:
                System.out.println("There was no interview, because there is only one developer who owns the company.");
                break;
            default:
                System.out.printf("%d developer(s) passed %d interview(s)", input, countInterviews(input));
                break;
        }
    }
}
