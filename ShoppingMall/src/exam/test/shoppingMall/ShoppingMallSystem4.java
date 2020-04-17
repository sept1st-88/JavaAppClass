package exam.test.shoppingMall;

public class ShoppingMallSystem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 10명의 같은 반 동기들을 생성
		// 5명의 친구들은 모두 컴퓨터를 구입한다
		// 나머지 5명의 친구들은 전혀 다른 가게에서 물건을 하나 구입하시오.
		// 그리고 각 친구들의 정보를 출력
		// 각 가게의 정보를 출력하시오
		
		//구매자 정보
		Customer[] customerArr = new Customer[10];
		
		customerArr[0] = new Customer("박상아", 33, 2000000);
		customerArr[1] = new Customer("원아름", 27, 2000000);
		customerArr[2] = new Customer("김홍", 27, 2500000);
		customerArr[3] = new Customer("오현석", 27, 1000000);
		customerArr[4] = new Customer("양우진", 26, 1500000);
		customerArr[5] = new Customer("이정주", 26, 1100000);
		customerArr[6] = new Customer("류제건", 25, 8000000);
		customerArr[7] = new Customer("이환상", 29, 5500000);
		customerArr[8] = new Customer("이용훈", 26, 2000000);
		customerArr[9] = new Customer("차정경", 24, 1000000);
		
		//가게
		ProductStore computerStore = new ProductStore("최고의 컴퓨터", 1000000);
		ProductStore appleStore = new ProductStore("거창 사과", 1000);
		ProductStore candyStore = new ProductStore("사탕", 900);
		ProductStore fruitStore = new ProductStore("과일", 2000);
		ProductStore gameStore = new ProductStore("게임", 105000);
		ProductStore makeupStore = new ProductStore("화장품", 9500);
		
		//물품 구매 출력
		System.out.println("===== 물품 구매 =====");
		for (int i = 0; i < 5; i++) {
			computerStore.buy(customerArr[i]);
		}
		appleStore.buy(customerArr[5]);
		candyStore.buy(customerArr[6]);
		fruitStore.buy(customerArr[7]);
		gameStore.buy(customerArr[8]);
		makeupStore.buy(customerArr[9]);
		
		//가게정보출력
		System.out.println("===== toString()이용 가게 출력 =====");
		System.out.println(computerStore);
		System.out.println(appleStore);
		System.out.println(candyStore);
		System.out.println(fruitStore);
		System.out.println(gameStore);
		System.out.println(makeupStore);
		
		//구매자 정보 출력
		System.out.println("===== toString()이용 구매자 정보 출력 =====");
		for (int i = 0; i < customerArr.length; i++) {
			System.out.println(customerArr[i]);
		}
		System.out.println("====================================");
		
	}

}
