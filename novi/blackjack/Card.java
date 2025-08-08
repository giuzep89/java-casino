package novi.blackjack;

public class Card {
    private CardSuite suite;
    private CardValue value;


    public Card(CardSuite suite, CardValue value) {
        this.suite = suite;
        this.value = value;
    }

    public String render(){
        return String.format("| %s %s |", this.value, this.suite);
    }



}
