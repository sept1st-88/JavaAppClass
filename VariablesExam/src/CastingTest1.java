
public class CastingTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("" + "");
		System.out.println(true + "");
		System.out.println('A' + 'B');
		System.out.println('1' + 2);
		System.out.println('1' + '2');
		System.out.println('J' + "ava");
		
//		System.out.println(true + null);		//컴파일러
		System.out.println("true" + null);		//문자열을 더 하면 결과는 무조건 문자열로 나온다.

	}

}
