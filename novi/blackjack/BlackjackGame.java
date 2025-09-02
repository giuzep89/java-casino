package novi.blackjack;

import java.util.Scanner;

public class BlackjackGame {
    private Scanner inputScanner;

    public BlackjackGame(Scanner inputScanner) {
        this.inputScanner = inputScanner;
    }

    public boolean continueOrNot() {
        boolean wantsToContinue = false;
        System.out.println("Would you like to play another round? Type yes or no");
        String continueOrNot = inputScanner.nextLine().trim().toLowerCase();
        if (continueOrNot.equals("yes")) {
            wantsToContinue = true;
        }
        return wantsToContinue;
    }

    public boolean hitOrStay(Player player, Deck deck){
        boolean hasMadeAChoice = false;
        String askPlayerHitOrStay = this.inputScanner.nextLine().trim().toLowerCase();
        switch (askPlayerHitOrStay) {
            case "hit":
                Card[] oneMoreCard = {deck.getNextCard()};
                player.addCardsToHand(oneMoreCard);
                System.out.printf("You chose to hit, here's another card. You current hand is: %s\n", player.renderHand());
                hasMadeAChoice = true;
                break;
            case "stay":
                player.setStaying(true);
                System.out.printf("You chose to stay. Your current hand is: %s\n", player.renderHand());
                hasMadeAChoice = true;
                break;
            default:
                System.out.println("Incorrect answer, please type 'hit' or 'stay'");
        }
        return hasMadeAChoice;
    }
    
    public void clearPlayersHand(Player player){
        player.getHand().clearHand();
    }
    
    public void clearDealersHand(Dealer dealer){
        dealer.getHand().clearHand();
    }

    public void resetRound(Player player, Dealer dealer){
        clearPlayersHand(player);
        clearDealersHand(dealer);
        player.setStaying(false);
        dealer.setStaying(false);
        System.out.println("Very well, another round begins.");
    }

    public void playGame() {
        System.out.println("Welcome to a new game.");
        Deck deck = new Deck();

        Player player = new Player();
        Dealer dealer = new Dealer();

        deck.shuffle();
        System.out.println("The deck has been shuffled.");



        Card[] twoCardsToPlayer = {deck.getNextCard(), deck.getNextCard()};
        player.addCardsToHand(twoCardsToPlayer);

        System.out.printf("Here's your first 2 cards: %s\n", player.renderHand());

        Card[] oneCardToDealer = {deck.getNextCard()};
        dealer.addCardsToHand(oneCardToDealer);

        System.out.printf("And one card for the dealer: %s\n", dealer.renderHand());



        while (true) {
            System.out.println("Would you like to hit or stay? Please type your answer:");

            boolean hasMadeAChoice = false;
            while (!hasMadeAChoice) {
                hasMadeAChoice = hitOrStay(player, deck);
            }


            if (player.isBust()) {
                System.out.println("Bust! You have lost this round.");
                if (continueOrNot()) {
                    continue;
                } else {
                    System.out.println("Thank you for playing");
                    break;
                }
            }


            System.out.println("Dealer's turn: hit or stay?");
            if (dealer.getHandValue() < 17) {
                Card[] oneMoreCard = {deck.getNextCard()};
                dealer.addCardsToHand(oneMoreCard);
                System.out.printf("The dealer hits and receives one more card. The dealer's hand is: %s\n", dealer.renderHand());
            } else {
                dealer.setStaying(true);
                System.out.printf("The dealer stays. The dealer's hand is: %s\n", dealer.renderHand());
            }


            if (dealer.isBust()) {
                System.out.println("The dealer is bust. Congratulations player, you have won this round!");
                if (continueOrNot()) {
                    resetRound(player, dealer);
                    continue;
                } else {
                    System.out.println("Thank you for playing");
                    break;
                }
            }


            int playersHand = player.getHandValue();
            int dealersHand = dealer.getHandValue();
            if (dealer.isStaying() && playersHand > dealersHand) {
                System.out.println("The dealer loses. Congratulations player, you have won this round!");
                if (continueOrNot()) {
                    resetRound(player, dealer);
                } else {
                    System.out.println("Thank you for playing");
                    break;
                }
            } else if (player.isStaying() && playersHand <= dealersHand) {
                System.out.println("The dealer wins. Player, you have lost this round.");
                if (continueOrNot()) {
                    resetRound(player, dealer);
                } else {
                    System.out.println("Thank you for playing");
                    break;
                }
            }
        }
    }
}
