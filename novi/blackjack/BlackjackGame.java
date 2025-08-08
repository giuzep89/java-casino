package novi.blackjack;
import java.util.Scanner;

public class BlackjackGame {
    private Scanner inputScanner;


    public BlackjackGame(Scanner inputScanner) {
        this.inputScanner = inputScanner;
    }


    public void playGame(){
//        TODO 2 The game makes a deck with all the necessary cards;
        Deck deck = new Deck();

//        TODO 3 The game makes the player and dealer objects, both with an empty hand
        Player player = new Player();
        Hand playersHand = new Hand();

        Dealer dealer = new Dealer();
        Hand dealersHand = new Hand();

//        TODO 4 The game shuffles the deck
        deck.shuffle();

//        TODO 5 The game gives the player 2 cards

//        TODO 6 The game gives the dealer 1 card
    }
}
