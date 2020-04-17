package exam.test.shoppingMall;

// 물건을 구입할 수 있는 고객
public class Customer {

	String name = "";
	int age = 0;
	int money = 0;
	String myBuyProduct = ""; // 내가 구입한 단 하나의 물건

	Customer(String name, int age, int money) {
		this.name = name;
		this.age = age;
		this.money = money;
	}

	void info() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(money);
	}
	//위에 처럼 info 같은건 작성하지 않는다 주로 확인용이고, 아래 방법으로 한다
	//개발자용으로 절대 안에 내용을 수정하지 않는다 (사용자는 보지 않는 부분)
	//Source > Generate toSring() > Generate
	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + ", "
				+ "money=" + money + ", myBuyProduct=" + 
				myBuyProduct + "]";
	}

}
