package com.playtika.javacourse;
import java.util.Random;

public class PasswordGenerator {
    static final String NUM_ALPHABET = "0123456789";
    static final String SYMBOL_ALPHABET = "!@#$%^&*";
    static final String LETTER_ALPHABET = "QAZXSWqazxsw";

    static final int NUM_TYPE = 0;
    static final int SYMBOL_TYPE = 1;
    static final int LETTER_TYPE = 2;

    static final Random RANDOM = new Random();

    public static String createPassword(int length) {
        StringBuilder password = new StringBuilder();
        boolean hasSymbol = false;

        int countNum = 0;

        while (password.length() < length) {
            int typeAlphabet = RANDOM.nextInt(3);
            char symbol = 0;
            switch (typeAlphabet) {
                case NUM_TYPE:
                    if (countNum >= 3){
                        continue;
                    }
                    symbol = getRandomSymbol(NUM_ALPHABET);
                    countNum ++;
                    break;
                case SYMBOL_TYPE:
                    if (hasSymbol) {
                        continue;
                    }
                    symbol = getRandomSymbol(SYMBOL_ALPHABET);
                    hasSymbol = true;
                    break;
                case LETTER_TYPE:
                    symbol = getRandomSymbol(LETTER_ALPHABET);
                    break;
            }
            password.append(symbol);
        }
        return password.toString();
    }

    public static char getRandomSymbol(String str) {
        int index = RANDOM.nextInt(str.length());
        return str.charAt(index);
    }

    public static void main(String[] args) {
        System.out.println(createPassword(10));
    }
}
