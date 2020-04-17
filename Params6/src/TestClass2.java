// 클래스 (static) 메서드 vs 인스턴스 메서드
public class TestClass2 {
	int iv;	//인스턴스 변수 (new라는 키워드를 만든 순간부터만 생성가능 (클래스 메서드에서도 사용가능 해짐))
	static int cv;	//스태틱 변수
	
	void instanceMethod() {		//인스턴스 메서드
		System.out.println(iv);
		System.out.println(cv);
	}
	
	static void staticMethod() {	//static 메서드
//		System.out.println(iv);	//에러! 인스턴스 변수를 사용 할 수없다
		System.out.println(cv);
	}
	
}
