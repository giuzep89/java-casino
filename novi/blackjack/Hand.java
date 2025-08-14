package novi.blackjack;

import java.util.ArrayList;
import java.util.List;

public class Hand {
    private Card card;
    private List<Card> cards = new ArrayList<>();

    public Hand() {
    }

    public void addCard(Card card){
        this.cards.add(card);
    }

    public int getTotalValue(){
        int totalValue = 0;
        for (int i = 0; i < cards.size(); i++) {
            Card oneCard = cards.get(i);
            int valueOfOneCard = oneCard.getCardValue().getValue();
            totalValue += valueOfOneCard;
        }
        return totalValue;
    }

    public void clearHand(){
        cards.clear();
    }

    @Override
    public String toString(){
        List<String> cardsInHand = new ArrayList<>();

        for(Card card : this.cards){
            cardsInHand.add(card.toString());
        }

        return cardsInHand.toString();
    }


}
