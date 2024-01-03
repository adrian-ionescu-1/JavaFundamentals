package ExercisesTest;

import java.util.Random;
import java.util.Scanner;

public class HangmanGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize a new game
        boolean playAgain = true;

        // List of secret words
        while (playAgain) {
            String[] wordList = {"blockchain", "java", "computer", "hangman", "programming",
                    "technology", "software", "developer", "challenges", "knowledge", "learning",
                    "creativity", "algorithms", "encryption", "universe", "adventure", "discovery"};

            // Choose a random secret word
            Random random = new Random();
            String secretWord = wordList[random.nextInt(wordList.length)];

            int maxAttempts;
            System.out.print("Choose the difficulty (easy/medium/hard): ");
            String difficulty = scanner.next().toLowerCase();

            switch (difficulty) {
                case "easy":
                    maxAttempts = 7;
                    break;
                case "medium":
                    maxAttempts = 5;
                    break;
                case "hard":
                    maxAttempts = 3;
                    break;
                default:
                    maxAttempts = 5; // Default to medium difficulty
                    break;
            }

            int attemptsLeft = maxAttempts;
            StringBuilder guessedLetters = new StringBuilder();
            boolean gameOver = false;

            System.out.println("Welcome to the Hangman game!");
            System.out.println("Find the hidden word. Each mistake reduces your chances.");

            char[] displayWord = new char[secretWord.length()];
            for (int i = 0; i < displayWord.length; i++) {
                displayWord[i] = '_';
            }

            while (attemptsLeft > 0 && !gameOver) {
                System.out.println("\nWord: " + new String(displayWord));
                System.out.println("Attempts left: " + attemptsLeft);
                System.out.println("Guessed letters: " + guessedLetters.toString());
                System.out.print("Enter a letter: ");
                String input = scanner.next();

                if (input.length() != 1) {
                    System.out.println("Enter a single letter.");
                    continue;
                }

                char guess = Character.toLowerCase(input.charAt(0)); // We convert the letter to lower case

                if (!Character.isLetter(guess)) {
                    System.out.println("Please enter a valid letter.");
                    continue;
                }

                if (guessedLetters.indexOf(String.valueOf(guess)) != -1) {
                    System.out.println("You've already tried this letter.");
                    continue;
                }

                guessedLetters.append(guess);

                boolean found = false;
                for (int i = 0; i < secretWord.length(); i++) {
                    if (Character.toLowerCase(secretWord.charAt(i)) == guess) { // We convert the letter to lower case
                        displayWord[i] = secretWord.charAt(i);
                        found = true;
                    }
                }

                if (!found) {
                    attemptsLeft--;
                    drawHangman(maxAttempts, attemptsLeft); // Shows the hanged man based on past mistakes
                    System.out.println("The letter is not in the word.");
                }

                if (secretWord.equalsIgnoreCase(new String(displayWord))) { // Using equalsIgnoreCase
                    System.out.println("Congratulations, you guessed the word: " + secretWord + " " + "\uD83C\uDF89" + "\uD83D\uDE04");
                    gameOver = true;
                }
            }

            if (!gameOver) {
                drawCompleteHangman();
                System.out.println("You lost! The word was: " + secretWord + " " + "\uD83D\uDC7B" + " " + "\uD83D\uDE02");
            }
            // Ask the player if they want to play again
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainInput = scanner.next().toLowerCase();
            playAgain = playAgainInput.equals("yes") || playAgainInput.equals("y");
        }
        System.out.println("Goodbye! Thanks for playing.");
        scanner.close();
    }

    public static void drawHangman(int maxAttempts, int incorrectGuesses) {
        // Shows the hanged man based on the number of wrong guesses
        String[] hangmanDrawing = {
                " _________     ",
                "|         |    ",
                "|         O    ",
                "|        /|\\  ",
                "|        / \\  ",
                "|              ",
                "|              "
        };

        System.out.println("\nHangman Stage:");

        int drawLimit = Math.min(maxAttempts - incorrectGuesses, hangmanDrawing.length);

        for (int i = 0; i < drawLimit; i++) {
            System.out.println(hangmanDrawing[i]);
        }
    }
    public static void drawCompleteHangman() {
        // Draw the current hangman stage
        String[] hangmanDrawing = {
                " _________     ",
                "|         |    ",
                "|         O    ",
                "|        /|\\  ",
                "|        / \\  ",
                "|              ",
                "|              "
        };

        System.out.println("\nHangman Stage:");

        for (String line : hangmanDrawing) {
            System.out.println(line);
        }
    }
}