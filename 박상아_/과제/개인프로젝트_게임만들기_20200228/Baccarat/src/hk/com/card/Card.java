package hk.com.card;

public class Card {

	public static final String[] 
			NUM = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
	public static final String[] 
			SHAPE = {"♠", "♥", "◆", "♣"};	
	
	private String card;
	
	int ranShape;
	int ranNum ;
	
	
	public Card() {
		ranNum= (int)(Math.random() * 13);
		ranShape= (int)(Math.random() * 4);
		makeCard();
	}
	
	private String makeCard(){				
			card = SHAPE[ranShape] + NUM[ranNum];
		return card;		
	}

	public String getCard() {
		return card;
	}

	@Override
	public String toString() {
		return "[" + card + "]";
	}

	@Override
	public int hashCode() {
		
		return card.hashCode() + 137;
	}

	@Override
	public boolean equals(Object obj) {
		
		boolean isc = false;
		Card c = (Card)obj;
		
		if( card.equals(c.getCard()) )
		{
			isc = true;
		}
		
		return isc;
	}
	
	
		
}
		
	
	
	
