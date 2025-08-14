package novi.blackjack;

public class Player {
    private Hand hand = new Hand();

    public Player() {
    }

//    public void performMove(Deck deck, String move){
//
//    }

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

    public boolean isStaying(){
        return true;
    }

    public void clearPlayersHand(){
        this.hand.clearHand();
    }

}
