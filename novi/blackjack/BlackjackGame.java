package novi.blackjack;
import java.util.Scanner;

public class BlackjackGame {
    private Scanner inputScanner;

    public BlackjackGame(Scanner inputScanner) {
        this.inputScanner = inputScanner;
    }

    public void playGame(){
        System.out.println("Welcome to a new game.");
        Deck deck = new Deck();

        Player player = new Player();
        Dealer dealer = new Dealer();

        deck.shuffle();
        System.out.println("The deck has been shuffled.");

        while(!deck.isEmpty()){
            Card[] twoCardsToPlayer = {deck.getNextCard(), deck.getNextCard()};
            player.addCardsToHand(twoCardsToPlayer);

//            System.out.printf("Here's two cards:".........);
//            TODO Make renderHand method in player, print the hand in this step

            Card[] oneCardToDealer = {deck.getNextCard()};
            dealer.addCardsToHand(oneCardToDealer);












        }









//        TODO 6 The game gives the dealer 1 card
    }
}
