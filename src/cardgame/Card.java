package cardgame;
//Author - Jaskaran Kaur
//Date - 19th February, 2024
public class Card {

//	private int value;
//	private String suit;
//    ENUM FOR SUIT AND VALUE
    public enum Suit{Hearts, Diamonds, Clubs, Spades}
    public enum Value{Ace, Two, three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King}
        
    
        private Value value;
	private Suit suit;
        
//        public static final String[] SUITS =
//        {"Hearts", "Diamonds", "Spades", "Clubs"};
//        
//	public int getValue() {
//		// TODO - implement Card.getValue
//		throw new UnsupportedOperationException();
//	}

    public Card(Value value, Suit suit) {
        this.value = value;
        this.suit = suit;
    }
        
	
	public void setValue(Value value) {
		// TODO - implement Card.setValue
		this.value = value;
	}

    public Value getValue() {
        return this.value;
    }
    
   

	public Suit getSuit() {
		return this.suit;
	}

	/**
	 * 
	 * @param suit
	 */
	public void setSuit(Suit suit) {
		this.suit = suit;
	}

}