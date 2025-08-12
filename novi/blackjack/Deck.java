package novi.blackjack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static novi.blackjack.CardSuite.CARD_SUITES;
import static novi.blackjack.CardValue.CARD_VALUES;


public class Deck {
    private final int numberOfCards = 48;
    private List<Card> remainingCards = new ArrayList<>();
    private boolean isEmpty = false;

    public Deck() {
        for (int j = 0; j < CARD_SUITES.length; j++) {
            for (int i = 0; i < CARD_VALUES.length; i++) {
                Card card = new Card(CARD_SUITES[j], CARD_VALUES[i]);
                remainingCards.add(card);
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(remainingCards);
    }

    public boolean isEmpty() {
        return remainingCards.isEmpty();
    }

    public Card getNextCard() {
        Card nextCard = remainingCards.get(0);
        remainingCards.remove(0);
        return nextCard;
    }
}

