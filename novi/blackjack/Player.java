package novi.blackjack;

public class Player {
    private Hand hand = new Hand();
    private boolean isStaying = false;
    private boolean isBust = false;

    public Player() {
    }

    public void addCardsToHand(Card[] cards){
        for (int i = 0; i < cards.length ; i++) {
            hand.addCard(cards[i]);
        }
    }

    public String renderHand(){
        return hand.toString();
    }

    public int getHandValue(){
        return this.hand.getTotalValue();
    }

    public boolean isBust(){
        return this.getHandValue() > 21;
    }

    public void setStaying(boolean staying) {
        this.isStaying = staying;
    }

    public boolean isStaying() {
        return this.isStaying;
    }

    public void clearPlayersHand(){
        this.hand.clearHand();
    }

}
