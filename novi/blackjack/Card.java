package novi.blackjack;

public class Card {
    private CardSuite suite;
    private CardValue value;


    public Card(CardSuite suite, CardValue value) {
        this.suite = suite;
        this.value = value;
    }

    public CardSuite getCardSuite() {
        return suite;
    }

    public CardValue getCardValue() {
        return value;
    }

    @Override
    public String toString() {
        return "|~~~> " + this.value.getValue() + " of " + this.suite.getName() + " <~~~|";
    }
}
