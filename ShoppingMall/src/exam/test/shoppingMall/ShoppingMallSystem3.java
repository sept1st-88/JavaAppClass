package exam.test.shoppingMall;

public class ShoppingMallSystem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 10명의 같은 반 동기들을 생성
		// 5명의 친구들은 모두 컴퓨터를 구입한다
		// 나머지 5명의 친구들은 전혀 다른 가게에서 물건을 하나 구입하시오.
		// 그리고 각 친구들의 정보를 출력
		// 각 가게의 정보를 출력하시오
		
		//구매자 정보
		Customer parkSangAh = new Customer("박상아", 33, 2000000);
		Customer wonAhreum = new Customer("원아름", 27, 2500000);
		Customer kimHong = new Customer("김홍", 27, 1000000);
		Customer ohHyunSuk = new Customer("오현석", 27, 1500000);
		Customer yangWooJin = new Customer("양우진", 26, 1100000);
		Customer leeJungJu = new Customer("이정주", 26, 8000000);
		Customer ryuJaeGun = new Customer("류제건", 25, 5500000);
		Customer leeHwanSang = new Customer("이환상", 29, 2000000);
		Customer leeYongHun = new Customer("이용훈", 26, 1000000);
		Customer chaJungKyung = new Customer("차정경", 24, 3000000);
		
		//가게
		ProductStore computerStore = new ProductStore("최고의 컴퓨터", 1000000);
		ProductStore appleStore = new ProductStore("거창 사과", 1000);
		ProductStore candyStore = new ProductStore("사탕", 900);
		ProductStore fruitStore = new ProductStore("과일", 2000);
		ProductStore gameStore = new ProductStore("게임", 105000);
		ProductStore makeupStore = new ProductStore("화장품", 9500);
		
		//물품 구매
		computerStore.buy(parkSangAh);
		computerStore.buy(wonAhreum);
		computerStore.buy(kimHong);
		computerStore.buy(ohHyunSuk);
		computerStore.buy(yangWooJin);
		
		appleStore.buy(leeJungJu);
		candyStore.buy(ryuJaeGun);
		fruitStore.buy(leeHwanSang);
		gameStore.buy(leeYongHun);
		makeupStore.buy(chaJungKyung);
		
		//가게정보출력
		System.out.println("===== toString()이용 가게 출력=====");
		System.out.println(computerStore);
		System.out.println(appleStore);
		System.out.println(candyStore);
		System.out.println(fruitStore);
		System.out.println(gameStore);
		System.out.println(makeupStore);
		
		//구매자 정보 출력
		System.out.println("===== 변수로 구매자 정보 출력=====");
		System.out.println(leeHwanSang.name);
		System.out.println(leeHwanSang.age);
		System.out.println(leeHwanSang.money);
		
		System.out.println("===== 메서드로 구매자 정보 출력=====");
		parkSangAh.info();
		wonAhreum.info();
		kimHong.info();
		ohHyunSuk.info();
		yangWooJin.info();
		
		System.out.println("===== toString()이용 구매자 정보 출력=====");
		System.out.println(leeJungJu);
		System.out.println(ryuJaeGun);
		System.out.println(leeHwanSang);
		System.out.println(leeYongHun);
		System.out.println(chaJungKyung);
		System.out.println("====================================");
		
	}

}
