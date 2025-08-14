package novi;

import java.util.Scanner;

import novi.blackjack.*;
import novi.higherlower.HigherLowerGame;

public class Main {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        BlackjackGame game = new BlackjackGame(inputScanner);

        Deck deck = new Deck();

        Card card = new Card(CardSuite.CARD_SUITES[0], CardValue.CARD_VALUES[0]);

        System.out.println(card.toString());



//        game.playGame();
    }
}