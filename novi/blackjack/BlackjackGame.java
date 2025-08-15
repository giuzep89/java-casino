package novi.blackjack;

import java.util.Scanner;

public class BlackjackGame {
    private Scanner inputScanner;

    public BlackjackGame(Scanner inputScanner) {
        this.inputScanner = inputScanner;
    }


    public void playGame() {
        System.out.println("Welcome to a new game.");
        Deck deck = new Deck();

        Player player = new Player();
        Dealer dealer = new Dealer();

        deck.shuffle();
        System.out.println("The deck has been shuffled.");

        while (!deck.isEmpty()) {
            Card[] twoCardsToPlayer = {deck.getNextCard(), deck.getNextCard()};
            player.addCardsToHand(twoCardsToPlayer);

            System.out.printf("Here's your first 2 cards: %s\n", player.renderHand());

            Card[] oneCardToDealer = {deck.getNextCard()};
            dealer.addCardsToHand(oneCardToDealer);

            System.out.printf("And one card for the dealer: %s\n", dealer.renderHand());

            System.out.println("Would you like to hit or stay? Please type your answer");

            boolean hasMadeAChoice = false;
            while (!hasMadeAChoice) {
                String askPlayerHitOrStay = this.inputScanner.nextLine().trim().toLowerCase();

                switch (askPlayerHitOrStay) {
                    case "hit":
                        Card[] oneMoreCard = {deck.getNextCard()};
                        player.addCardsToHand(oneMoreCard);
                        hasMadeAChoice = true;
                        break;
                    case "stay":
                        player.setStaying(true);
                        hasMadeAChoice = true;
                        break;
                    default:
                        System.out.println("Incorrect answer, please type 'hit' or 'stay'");
                }
            }


            if (player.isBust()) {
                System.out.println("Bust! You have lost this round.\n" +
                        "Would you like to play another round? Type yes or no");
                String continueOrNot = inputScanner.nextLine().trim().toLowerCase();

                if (continueOrNot.equals("yes")) {
                    player.clearPlayersHand();
                    dealer.clearDealersHand();
                    continue;
                } else if (continueOrNot.equals("no")) {
                    System.out.println("Thank you for playing");
                    break;
                }
            }


            System.out.println("Dealer's turn: hit or stay?");
            if(dealer.getHandValue() < 17){
                Card[] oneMoreCard = {deck.getNextCard()};
                dealer.addCardsToHand(oneMoreCard);
                System.out.println("The dealer hits and receives one more card.");
            } else {
                dealer.setStaying(true);
                System.out.println("The dealer stays.");
            }


            if(dealer.isBust()){
                System.out.println("The dealer is bust. Congratulations player, you have won this round!\n" +
                        "Would you like to play another round? Type yes or no");
                String continueOrNot = inputScanner.nextLine().trim().toLowerCase();
                if (continueOrNot.equals("yes")) {
                    player.clearPlayersHand();
                    dealer.clearDealersHand();
                    continue;
                } else if (continueOrNot.equals("no")) {
                    System.out.println("Thank you for playing");
                    break;
                }
            }

            int playersHand = player.getHandValue();
            int dealersHand = dealer.getHandValue();
            if(dealer.isStaying() && playersHand > dealersHand){
                System.out.println("The dealer loses. Congratulations player, you have won this round!");

            }


            // TODO Create method for continueOrNot








        }
    }
}
