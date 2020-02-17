
public class FlowEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		표현식
//		switch (key/값) {
//			case value:
//			
//					break;
//		}
//		if문보다 빠르다
//		1~10
//		int score = (int)(Math.random() * 10) + 1;		//Math.random() calls any random number between 0 & 1.
//		ex:
//			0.099999
//			0.199999
//			0.299999
//			0.899999
//			0.999999
//		* 10는 경우의 수를 나타낸다.
//		The reason why 1 is added, is because we do not want 0 to come out.
//		For example if a number like 0.00899 is called, the resulting number would be 0, but we do not want this to happen.
//		Therefore we add 1 to every number called to make sure 0 is not called.
//		
//		score = score * 100;
		
//		switch (score) {		//key값 가 아래 case 값과 동일(==)하다면 (예: score == 100이다) 그럼 첫번째 case가 실행된다
//			case 100:
//				System.out.println("당신의 점수는 100이고, 상품은 자전거입니다");
//				break;
//			case 200:
//				System.out.println("당신의 점수는 200이고, 상품은 노트북입니다");
//				break;
//			case 300:
//				System.out.println("당신의 점수는 300이고, 상품은 자동차입니다");
//				break;
//			default:
//				System.out.println("죄송하지만 당신의 점수에 해당상품이 없습니다.");
//				break;
//		}
		
		switch (100) {		//key값 가 아래 case 값과 동일(==)하다면 (예: score == 100이다) 그럼 첫번째 case가 실행된다
			case 100:
				System.out.println("당신의 점수는 100이고, 상품은 자전거입니다");
//				break;		//break가 있어야 위에서 충족이 됬으면 여기서 멈춰준다. 안그러면 아래 것도 그냥 실행이 된다. 있고 없고에 속도 차이가 크다.
			case 200:
				System.out.println("당신의 점수는 200이고, 상품은 노트북입니다");
				break;
			case 300:
				System.out.println("당신의 점수는 300이고, 상품은 자동차입니다");
				break;
			default:
				System.out.println("죄송하지만 당신의 점수에 해당상품이 없습니다.");
				break;
		}

	}

}
