package cardgame;

import java.util.Random;

public class CardHandGenerator {

	/**
	 * 
	 * @param numOfCards
	 */
	public static  Card[] generateHand(int numOfCards) {
		// TODO - implement CardHandGenerator.generateHand
		 Card[] hand = new Card[7];
        Random random =new Random();
      
        for(int i=0;i<hand.length;i++){
            Card.Value value =Card.Value.values() [random.nextInt(13)];
            Card.Suit suit = Card.Suit.values()[random.nextInt(4)];
            
            Card card=new Card(value,suit);
            hand[i]=card;
            
        } 
        return hand;
	

}
}