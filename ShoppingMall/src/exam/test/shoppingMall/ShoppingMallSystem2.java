package exam.test.shoppingMall;

public class ShoppingMallSystem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 10명의 같은 반 동기들을 생성
		// 5명의 친구들은 모두 컴퓨터를 구입한다
		// 나머지 5명의 친구들은 전혀 다른 가게에서 물건을 하나 구입하시오.
		// 그리고 각 친구들의 정보를 출력
		// 각 가게의 정보를 출력하시오
		
		String[] classmates = {"박상아", "원아름", "김홍", "오현석", "양우진", 
				"이정주", "박지훈", "이환상", "이용훈", "차정경"};
		
		for (int i = 0; i < 5; i++) {
			System.out.println(classmates[i] + " 컴퓨터 구입");
		}
		
//		System.out.println(classmates[0] + " 컴퓨터 구입");
//		System.out.println(classmates[1] + " 컴퓨터 구입");
//		System.out.println(classmates[2] + " 컴퓨터 구입");
//		System.out.println(classmates[3] + " 컴퓨터 구입");
//		System.out.println(classmates[4] + " 컴퓨터 구입");
		
		System.out.println(classmates[5] + " 핸드폰 구입");
		System.out.println(classmates[6] + " 티비 구입");
		System.out.println(classmates[7] + " 플레이스테이션 구입");
		System.out.println(classmates[8] + " 태블릿 구입");
		System.out.println(classmates[9] + " 이어폰 구입");
		
		System.out.println();
		System.out.println("컴퓨터 가게에서 5개의 컴퓨터를 팔았습니다.");
		System.out.println("다있소 가게에서 5개의 물건을 팔았습니다.");
		
	}

}
