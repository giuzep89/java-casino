package novi.blackjack;

public class CardSuite {
    private String name;
    private char symbol;
    private String color;
    public static final CardSuite[] CARD_SUITES = new CardSuite[] {
            new CardSuite("Diamonds", '♦', "red"),
            new CardSuite("Spades", '♠', "black"),
            new CardSuite("Hearts", '♥', "red"),
            new CardSuite("Clubs", '♣', "black")
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
