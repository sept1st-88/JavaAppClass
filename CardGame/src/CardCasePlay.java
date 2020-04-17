
public class CardCasePlay {
	
	public static void main(String[] args) {
		
		CardCase cardCase = new CardCase();
		
//		cardCase.shuffle();
		cardCase.caseInside();
		
		Card card = null;
		
		card = cardCase.pick();
		
//		Card card = cardCase.pick(0);
//		
		System.out.println(card.getCard());
		
	}
	
}
