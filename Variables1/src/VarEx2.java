
public class VarEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		기본형과 참조형
//		기본형(primitive type)
//			- 논리형(boolean) : true 와 false 중 하나를 값으로 갖으며, 조건식과 논리적 계산에 사용된다.
//			- 문자형(char) : 문자를 저장하는데 사용되며, 변수 당 하나의 문자만 저장할 수 있다.
//			- 정수형(byte, short, int, long) : 정수 값을 저장하는 데 사용된다. 주로 사용되는 것은 int와 long이다.
//			- 실수형(float, double) : 실수를 저장하는데 사용되며, 주로 double이 사용된다.
//			=> 기본형은 계산을 위한 실제 값을 저장한다.
//		참조형(reference type)
//			- 객체의 주소를 저장한다. 8개의 기본형을 제외한 나머지 타입
//		표현범위
		
//크기(byte)	1         2       4       8
//			boolean - char 	- int 	- long
//			byte	- short - float - double
		
		boolean check = false;
		char ch = 66;		// ""문자열(more than one letter)	''문자(one letter) char에서는 문자만 사용 가능(x문자열). 아스키코드(ASCII)가 숫자를 알파벳과 정의.
		byte bNum = (byte)128;	// -127 부터 128까지가 byte의 256의 범위이다. 그러므러 그 밖에 숫자들은 byte로 출력이 불가능한다. 앞에 (byte)를 붙일시 억지로 출력을 시킨다.
		int num = -10000;	// -22억 부터 22억까지의 범위.
		long lNum = 2200000000L;	// L은 개발자들의 long의 대한 표기법(꼭 안 써줘도 됨)
		float f = 0.0f;
		double dNum = 0.0;
		
		System.out.println(bNum);
		
		System.out.println(check);
		System.out.println(ch);
		System.out.println(num);
		System.out.println(lNum);
		System.out.println(f);
		System.out.println(dNum);
		
	}

}
