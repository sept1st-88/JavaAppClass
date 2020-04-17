
public class TvMain2 {

	public static void main(String[] args) {	//main 문장이 먼저 실행된다 (before class)
		// TODO Auto-generated method stub
		
//		선언
//		타입 변수명;
		Tv tv1 = new Tv();	//new는 새롭게 할당한다는 것이다.
		Tv tv2 = new Tv();	//같은 속성을 가진 객체 두개를 만든거다.
		System.out.println("tv1의 channel값은: " + tv1.channel);
		System.out.println("tv2의 channel값은: " + tv2.channel);
		
		tv1.channel = 7;
		System.out.println("tv1의 channel값을 7로 변경하였습니다.");
		
		System.out.println("tv1의 channel값은: " + tv1.channel);
		System.out.println("tv2의 channel값은: " + tv2.channel);

	}

}
