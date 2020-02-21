
// 메서드 명명규칙
// 변수랑 동일
public class ParameterTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		참조 변수
		Data2 data2 = new Data2();
		
		int x = 0;	//지역변수
		
		x = 10;
		data2.x = x;	//인스턴스 변수
		
		System.out.println("main data2.x = " + data2.x);
		
		data2.change(data2);	//data2라는 주소를 보낸다
		
		System.out.println("After change");
		System.out.println("main data2.x = " + data2.x);

	}

}
