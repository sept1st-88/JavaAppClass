
public class TestClassMain {
	
	public static void main(String[] args) {
//		TestClass.staticMethod();
//		TestClass.staticMethod2();
		
//		TestClass.instanceMethod();	//인스턴스 메서드의 경우 new를 지정해주어야지만 작동 가능하다
		
		TestClass testClass = new TestClass();
		testClass.instanceMethod2();
		
//		static 키워드가 먼저 전부 생성된다
//		new 키워드로 만든 것만 생성된다
	}
	
}
