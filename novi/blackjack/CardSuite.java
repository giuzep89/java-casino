package novi.blackjack;

public class CardSuite {
    private String name;
    private char symbol;
    private String color;
    public static final CardSuite[] CARD_SUITES = new CardSuite[] {
            new CardSuite("diamonds", '\u2666', "red"),
            new CardSuite("spades", '\u2660', "black"),
            new CardSuite("hearts", '\u2665', "red"),
            new CardSuite("clubs", '\u2663', "black")
    };

    public CardSuite(String name, char symbol, String color) {
        this.name = name;
        this.symbol = symbol;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public char getSymbol() {
        return symbol;
    }

    public String getColor() {
        return color;
    }
}
