/*
Программа запрашивает у пользователя ФИО, мобильный телефон и email, и проверяет данные на валидность с помощью регулярных выражений.
ФИО - только буквы английского  алфавита, дефис и пробел
Мобильный телефон - +380 далее 2 цифры кода (украина) и 7 любых цифр
email - любые латинские символы, цифры, дефис и нижний прочерк, обязательный символ @ и .
Проверить все вводимые данные и вывести неверно введенные.
 */
package javacourse.homework;
import java.util.Scanner;
import java.util.regex.Pattern;

public class HW3Task4 {
    static final int FIO_TYPE = 0;
    static final int PHONE_TYPE = 1;
    static final int EMAIL_TYPE = 2;

    private static String getInput() {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        while(input.isEmpty())
        {
            System.out.println("No data, please try again:");
            input = scan.nextLine();
        }
        return input;
    }
    private static boolean controlFIO(String string) {
        Pattern patternFIO = Pattern.compile("^[A-Z][a-z]+([\\-]?[A-Za-z]+)*\\s[A-Z][a-z]+([\\-]?[A-Za-z]+)*\\s[A-Z][a-z]+$");

        return patternFIO.matcher(string).matches();
    }

    private static boolean controlPhoneNumber(String string) {
        Pattern patternPhone = Pattern.compile("^\\+380(50|66|99|63|93|67|97|98)\\d{7}$");

        return patternPhone.matcher(string).matches();
    }

    private static boolean controlEmail(String string) {
        Pattern patternEmail = Pattern.compile("^\\w+[-]?\\w*@[a-z]+\\.[a-z]{2,3}$");

        return patternEmail.matcher(string).matches();
    }

    private static void displayChecking(int dataType, String input) {
        switch (dataType) {
            case FIO_TYPE:
                if (controlFIO(input)) {
                    return;
                } else {
                    System.out.println("The full name '" + input + "' isn't valid");
                }
                break;
            case PHONE_TYPE:
                if (controlPhoneNumber(input)) {
                    return;
                } else {
                    System.out.println("The phone number '" + input + "' isn't valid");
                }
                break;
            case EMAIL_TYPE:
                if (controlEmail(input)) {
                    return;
                } else {
                    System.out.println("The email '" + input + "' isn't valid");
                }
                break;
        }
    }

    public static void main(String[] args) {
        System.out.println("Please, enter your full name: ");
        String fio = getInput();

        System.out.println("Please, enter your phone number: ");
        String phone = getInput();

        System.out.println("Please, enter your email: ");
        String email = getInput();

        displayChecking(FIO_TYPE, fio);
        displayChecking(PHONE_TYPE, phone);
        displayChecking(EMAIL_TYPE, email);
    }
}