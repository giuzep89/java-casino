package novi.blackjack;

public class Dealer {
    private Hand hand = new Hand();

    public Dealer() {
    }

    public void addCardsToHand(Card[] cards){
        for (int i = 0; i < cards.length ; i++) {
            hand.addCard(cards[i]);
        }
    }

}
