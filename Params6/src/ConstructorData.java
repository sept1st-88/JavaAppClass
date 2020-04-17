
public class ConstructorData {
	
	int value = 0;
	
//	매개변수가 없으면 기본 생성자라 한다 (new를 만들었을때
//	묵시적으로 아래 생성자가 만들어진다)
//	매개변수가 있는 생성자를 하나라도 만들면, 기본 생성자는 만들어지지 않는다.
	ConstructorData() {
		System.out.println("ConstructorData() 생성됨");
	}
	
}
