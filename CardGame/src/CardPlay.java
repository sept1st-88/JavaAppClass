
public class CardPlay {
	
	public static void main(String[] args) {
		
		String str = "";
		Card card = new Card();
		
//		card.init();	//랜덤 뽑기
		card.init(0, 0);	//직접 뽑기
		
		str = card.getCard();
		
		System.out.println(str);
		
	}
	
}
