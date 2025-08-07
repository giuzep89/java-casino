package novi.higherlower;

import java.util.Scanner;

public class HigherLowerGame {
    private Scanner inputScanner;
    private boolean gameIsRunning;

    public HigherLowerGame(Scanner inputScanner) {
        this.inputScanner = inputScanner;
    }

    public void playGame() {
        gameIsRunning = true;
        int turns = 0;

        // Here you should generate the number to guess
        int numberToGuess = (int)Math.round(Math.random() * 100);

        while (gameIsRunning) {
            System.out.println("Make a guess");
            var input = inputScanner.nextLine();
            System.out.printf("You typed: %s\n", input);
            turns++;

            // Check if the guess is correct, if so end the game
            if (Integer.parseInt(input) > numberToGuess){
                System.out.println("That number is too high!");
            } else if (Integer.parseInt(input) < numberToGuess){
                System.out.println("That number is too low!");
            } else if (Integer.parseInt(input) == numberToGuess){
                System.out.printf("Correct! You guessed the number in %s turns", turns);
                gameIsRunning = false;
            }

        }
    }
}
