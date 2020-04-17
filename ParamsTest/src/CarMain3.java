
public class CarMain3 {

	public static void main(String[] args) {
		
		Car3 car = new Car3("실버", "인공지능", 4);
		Car3 myCar = new Car3("레드", "수동", 10);	//위에와 다른 주소값
		
		System.out.println(car);
		System.out.println(myCar);
		
		car.carInfo();
		myCar.carInfo();
		
	}
	
}
