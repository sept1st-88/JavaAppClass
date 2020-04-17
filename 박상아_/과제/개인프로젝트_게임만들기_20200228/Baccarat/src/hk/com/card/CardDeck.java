package hk.com.card;

import java.util.ArrayList;
import java.util.List;

public class CardDeck {

	List<String> cardDeck;
	
	public CardDeck() {
		makeDeck();
	}
	
	private void makeDeck()
	{
		List<String> deck = new ArrayList<String>();
		String card = "";
		
		while(true)
		{				
			Card c = new Card();
			card = c.getCard();
			
			if ( !deck.contains( card ))
			{				
				deck.add( card );	
			}
			
			if(deck.size() == 52)
			{
				break;
			}
		}
				
		cardDeck = deck;
	}
	
	public List<String> getCardDeck() {
		return cardDeck;
	}

}
