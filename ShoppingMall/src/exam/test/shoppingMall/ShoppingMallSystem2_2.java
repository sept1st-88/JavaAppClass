package exam.test.shoppingMall;

public class ShoppingMallSystem2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 10명의 같은 반 동기들을 생성
		// 5명의 친구들은 모두 컴퓨터를 구입한다
		// 나머지 5명의 친구들은 전혀 다른 가게에서 물건을 하나 구입하시오.
		// 그리고 각 친구들의 정보를 출력
		// 각 가게의 정보를 출력하시오
		
		String[] comBuyNameArr = new String[5];
		comBuyNameArr[0] = "박상아";
		comBuyNameArr[1] = "원아름";
		comBuyNameArr[2] = "김홍";
		comBuyNameArr[3] = "오현석";
		comBuyNameArr[4] = "양우진";
		
		String[] anyBuyNameArr = new String[5];
		anyBuyNameArr[0] = "이정주";
		anyBuyNameArr[1] = "박지훈";
		anyBuyNameArr[2] = "이환상";
		anyBuyNameArr[3] = "이용훈";
		anyBuyNameArr[4] = "차정경";
		
		for (int i = 0; i < comBuyNameArr.length; i++) {
			System.out.println(comBuyNameArr[i] + " 컴퓨터 구입");
		}
		
//		System.out.println(classmates[0] + " 컴퓨터 구입");
//		System.out.println(classmates[1] + " 컴퓨터 구입");
//		System.out.println(classmates[2] + " 컴퓨터 구입");
//		System.out.println(classmates[3] + " 컴퓨터 구입");
//		System.out.println(classmates[4] + " 컴퓨터 구입");
		
		System.out.println(anyBuyNameArr[0] + " 핸드폰 구입");
		System.out.println(anyBuyNameArr[1] + " 티비 구입");
		System.out.println(anyBuyNameArr[2] + " 플레이스테이션 구입");
		System.out.println(anyBuyNameArr[3] + " 태블릿 구입");
		System.out.println(anyBuyNameArr[4] + " 이어폰 구입");
		
		System.out.println();
		System.out.println("컴퓨터 가게에서 1개의 컴퓨터를 팔았습니다.");
		System.out.println("컴퓨터 가게에서 1개의 컴퓨터를 팔았습니다.");
		System.out.println("컴퓨터 가게에서 1개의 컴퓨터를 팔았습니다.");
		System.out.println("컴퓨터 가게에서 1개의 컴퓨터를 팔았습니다.");
		System.out.println("컴퓨터 가게에서 1개의 컴퓨터를 팔았습니다.");
		
		System.out.println("홈플러스에서 5개의 물건을 팔았습니다.");
		
	}

}
