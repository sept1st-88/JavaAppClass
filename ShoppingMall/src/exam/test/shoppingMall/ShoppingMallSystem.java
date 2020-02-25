package exam.test.shoppingMall;

public class ShoppingMallSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 10명의 같은 반 동기들을 생성
		// 5명의 친구들은 모두 컴퓨터를 구입한다
		// 나머지 5명의 친구들은 전혀 다른 가게에서 물건을 하나 구입하시오.
		// 그리고 각 친구들의 정보를 출력
		// 각 가게의 정보를 출력하시오
		
		Customer gangsucwon = new Customer("강석원", 22, 100000);
		Customer songkmdong = new Customer("송금동", 24, 1000000);
		
		ProductStore computerStore = new ProductStore("최고의 컴퓨터", 1000000);
		ProductStore appleStore = new ProductStore("거창 사과", 1000);
		
		computerStore.buy(gangsucwon);
		
		System.out.println(gangsucwon.name);
		System.out.println(gangsucwon.age);
		System.out.println(gangsucwon.money);
		
		appleStore.buy(gangsucwon);
		System.out.println(gangsucwon.name);
		System.out.println(gangsucwon.age);
		System.out.println(gangsucwon.money);
		
		
	}

}
