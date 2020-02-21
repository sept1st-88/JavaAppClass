
public class Car3 {

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
	
	Car3(String color, String gearType, int door /*지역변수*/){
		//인스턴스 변수 초기화 작업
		this.color = color;	//this.는 지역변수를 불러오는거다 (나의 주소를 불러오는것)
		this.gearType = gearType;	//바로 초기화 시켜야 하는 생성자에서만 this를 사용.
		this.door = door;
		System.out.println("생성자의 주소: " + this);
	}
	
	void carInfo() {
		int door = 0;
		System.out.println("메서드 상의 주소값: " + this);
		System.out.println("마이카");
		System.out.println(this.color);	//이렇게도 실행이 되지만 위에처럼 굳이 안해줘도 된다.
		System.out.println(gearType);	//매개변수가 없는 메서드 안에 this없이 부른다면 클래스 영역으로 다시 나가서 변수를 불러온다.
		System.out.println(door);		//지역변수로 불러왔기 때문에 지역변수로 출력
//		return;	//void 메서드 안에서는 묵시적으로 알아서 return이 실행되기 때문에 굳이 적어주지 않는다
	}
	
}
