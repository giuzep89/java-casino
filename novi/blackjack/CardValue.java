package novi.blackjack;

public class CardValue {
    private String name;
    private int value;

    public CardValue(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }
}
