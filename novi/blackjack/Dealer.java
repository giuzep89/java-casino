package novi.blackjack;

public class Dealer {
    private Hand hand = new Hand();
    private boolean isStaying = false;
    private boolean isBust = false;

    public Dealer() {
    }

    public void addCardsToHand(Card[] cards){
        for (int i = 0; i < cards.length ; i++) {
            hand.addCard(cards[i]);
        }
    }

    public Hand getHand() {
        return hand;
    }

    public int getHandValue(){
        return this.hand.getTotalValue();
    }

    public boolean isBust(){
        return this.getHandValue() > 21;
    }

    public boolean isStaying() {
        return this.isStaying;
    }

    public void setStaying(boolean staying) {
        this.isStaying = staying;
    }

    public String renderHand(){
        return hand.toString();
    }

}
