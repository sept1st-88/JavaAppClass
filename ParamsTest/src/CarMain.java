
public class CarMain {

	public static void main(String[] args) {
		
		Car car = new Car("black", "auto", 4);
		
		System.out.println(car.color);
		System.out.println(car.gearType);
		System.out.println(car.door);
		
		car.carInfo();
		
	}
	
}
