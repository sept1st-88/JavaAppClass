
public class Card {
	
	static String[] shapeArr = {"♥", "◆", "♠", "♣"};
	static String[] numberArr = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
	
	String card = "";
	
	Card(){
		
	}
	
	public Card(int shapeIndex, int numberIndex){
		init(shapeIndex, numberIndex);
	}
	
//	**오버로딩**
	//랜덤
	void init() {	//매개변수가 없는 경우 메서드에 변화가 일어나지 않을거라는거다
		//모양 랜덤
		int shapeIndex = (int)(Math.random() * shapeArr.length);
		//숫자 랜덤
		int numberIndex = (int)(Math.random() * numberArr.length);
		
		card = shapeArr[shapeIndex] + numberArr[numberIndex];
	}
	
	//직접 뽑기
	void init(int shapeIndex, int numberIndex) {	//매개변수가 있는건 내가 직접입력 하겠다(값을 직접 주겠다)
		card = shapeArr[shapeIndex] + numberArr[numberIndex];
	}
	
	String getCard() {
		return card;
	}
	
}
