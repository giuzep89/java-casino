package novi.blackjack;

import java.util.HashMap;

public class CardValue {
    private String name;
    private int value;
    public static final CardValue[] CARD_VALUES = new CardValue[]{
            new CardValue(2, "2"),
            new CardValue(3, "3"),
            new CardValue(4, "4"),
            new CardValue(5, "5"),
            new CardValue(6, "6"),
            new CardValue(7, "7"),
            new CardValue(8, "8"),
            new CardValue(9, "9"),
            new CardValue(10, "10"),
            new CardValue(10, "Jack"),
            new CardValue(10, "King"),
            new CardValue(10, "Queen"),
    };


//    private int[] values = {2, 3, 4, 5, 6, 7, 8, 9, 10};
//    private String[] names = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "King", "Queen"};


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
