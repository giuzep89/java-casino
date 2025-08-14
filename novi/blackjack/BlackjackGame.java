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

            System.out.printf("Here's your first 2 cards: %s\n", player.renderHand());

            Card[] oneCardToDealer = {deck.getNextCard()};
            dealer.addCardsToHand(oneCardToDealer);

            System.out.printf("And one card for the dealer: %s\n", dealer.renderHand());

            System.out.println("Would you like to hit or stay? Please type your answer");
            String hitOrStay = this.inputScanner.nextLine().trim().toLowerCase();


            //TODO write this step again!!!
            switch (hitOrStay){
                case "hit":
                    Card[] oneMoreCard = {deck.getNextCard()};
                    player.addCardsToHand(oneMoreCard);
                    break;
                case "stay":
                    player.isStaying();
                    break;
                default:
                    System.out.println("Incorrect answer, please type 'hit' or 'stay'");
            }


            if(player.isBust()){
                System.out.println("Bust! You have lost this round.");
                System.out.println("Would you like to play another round? Type yes or no");
                String continueOrNot = inputScanner.nextLine().trim().toLowerCase();

                if(continueOrNot.equals("yes")){
                    player.clearPlayersHand();
                } else if (continueOrNot.equals("no")){
                    System.out.println("Thank you for playing");
                    break;
                }
            } else if(player.isStaying()){
                // TODO Go on with step 10!!
            }









        }
    }
}
