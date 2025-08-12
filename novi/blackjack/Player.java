package novi.blackjack;

public class Player {
    private Hand hand = new Hand();

    public Player() {
    }

    public void performMove(Deck deck, String move){

    }

    public void addCardsToHand(Card[] cards){
        for (int i = 0; i < cards.length ; i++) {
            hand.addCard(cards[i]);
        }
    }
}
