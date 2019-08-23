package game;

import java.util.Scanner;

public class GuessingGame {
    private final WordSource wordSource;
    private final LetterMixer letterMixer;
    private final Scanner scan;

    public GuessingGame(Scanner scanner) {
        wordSource = new WordSource();
        letterMixer = new LetterMixer();
        scan = scanner;
    }

    public void playGame() {
        String word = wordSource.getWord();
        String mixedWord = letterMixer.mix(word);

        System.out.printf("Guess word: %s\n", mixedWord);
        String inputWord = scan.nextLine();
        while(!word.equals(inputWord)) {
            System.out.println("You are wrong, please try again:");
            inputWord = scan.nextLine();
        }
        System.out.println("You are right, good job!");
    }

    public static void main(String[] args) {
        GuessingGame startGame = new GuessingGame(new Scanner(System.in));
        startGame.playGame();
    }
}
