
public class CardMain_변수타입 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//변수와 메서드
		
		System.out.println("Card.width = " + Card_변수타입.width);
		System.out.println("Card.height = " + Card_변수타입.height);
		
		//객체 or 인스턴스
		Card_변수타입 card1 = new Card_변수타입();	//인스턴스 변수들은 new를 생성해야지만 불러올 수 있다
		card1.kind = "Heart";
		card1.num = 7;
		
		Card_변수타입 card2 = new Card_변수타입();
		card2.kind = "Spade";
		card2.num = 4;
		
		System.out.println("card1은 " + card1.kind + ", " + card1.num + "이며, 크기는 " + card1.width + ", " + card1.height);
		System.out.println("card2는 " + card2.kind + ", " + card2.num + "이며, 크기는 " + card2.width + ", " + card2.height);
		
		System.out.println("card1의 width와 height를 50, 80으로 변경해본다");
		card1.width = 50;		//클래스 변수로 지정되었기 때문에 모든 인스턴스가 공통된다.
		card1.height = 80;		//클래스 변수는 위에 new를 생성하지 않아도 불러올 수 있다.
		
		System.out.println("card1은 " + card1.kind + ", " + card1.num + "이며, 크기는 " + card1.width + ", " + card1.height);
		System.out.println("card2는 " + card2.kind + ", " + card2.num + "이며, 크기는 " + card2.width + ", " + card2.height);

	}

}
