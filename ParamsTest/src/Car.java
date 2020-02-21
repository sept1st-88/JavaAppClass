
public class Car {

//	색상
	String color = "";
//	변속기 종류
	String gearType = "";
//	문의 개수
	int door = 0;
	
	Car(String a, String b, int c){
		//인스턴스 변수 초기화 작업
		color = a;		//기존에 메인에서 변수를 할당했던 것을 이곳에서 생선자를 통해 할당하는것
		gearType = b;
		door = c;
	}
	
	void carInfo() {
		System.out.println(color);
		System.out.println(gearType);
		System.out.println(door);
	}
	
}
