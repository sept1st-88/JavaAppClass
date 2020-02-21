
public class Car4 {

//	색상
	String color = "";
//	변속기 종류
	String gearType = "";
//	문의 개수
	int door = 0;
	
//	this에 대해 배우자
//	this? 
//			인스턴스 자신을 가르키는 참조변수
//			인스턴스의 주소가 저장되어 있다
//			모든 인스턴스메서드에 지역변수로 숨겨진 채로 존재한다
	
	Car4(String color, String gearType, int door /*지역변수*/){
		//인스턴스 변수 초기화 작업
		this.color = color;	//this.는 지역변수를 불러오는거다 (나의 주소를 불러오는것)
		this.gearType = gearType;	//바로 초기화 시켜야 하는 생성자에서만 this를 사용.
		this.door = door;
		System.out.println("생성자의 주소: " + this);
	}
	
	void carInfo(String color, int door) {
		this.color = color;
		this.gearType = gearType;	//매개변수에서 지역변수로 지정 되 있지 않다(경고 줄)
		this.door = door;
		
		System.out.println("홍이 천재: " + this);
		System.out.println("바보다");
		System.out.println("나는: " + this.color);
		System.out.println("나이: " + this.gearType);
		System.out.println("아이큐: " + door);
	}
	
}
