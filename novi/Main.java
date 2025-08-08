package novi;

import java.util.Scanner;

import novi.blackjack.BlackjackGame;
import novi.blackjack.Deck;
import novi.higherlower.HigherLowerGame;

public class Main {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        BlackjackGame game = new BlackjackGame(inputScanner);

        Deck deck = new Deck();



//        game.playGame();
    }
}