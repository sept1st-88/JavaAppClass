
public class TvMain {

	public static void main(String[] args) {	//main 문장이 먼저 실행된다 (before class)
		// TODO Auto-generated method stub
		
//		선언
//		타입 변수명;
		Tv tv;	//Tv 타입의 변수 tv
		tv = new Tv();	//Tv 클래스에 선언된 변수들을 담는다.
		
		tv.channel = 7;
//		tv.channelDown();
		System.out.println("현재 채널은 " + tv.channel + "입니다.");

	}

}

//Ex:
//public class MyClass {
//  int x = 5;
//
//  public static void main(String[] args) {
//    MyClass myObj = new MyClass();
//    System.out.println(myObj.x);
//  }
//}