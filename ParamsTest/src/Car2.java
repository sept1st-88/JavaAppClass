
public class Car2 {

//	색상
	String color = "";
//	변속기 종류
	String gearType = "";
//	문의 개수
	int door = 0;
	
	Car2() {	//기본생성자 (보통 비어있는 채로 만든다)
//		color = "노란색";
//		gearType = "수동";
	}
	
	Car2(String color, String gearType) {	//기본생성자
		color = "black";
		gearType = "auto";
	}
	
	void carInfo() {
		System.out.println("마이 카");
		System.out.println("색상: " + color);
		System.out.println("변속: " + gearType);
	}
	
}
