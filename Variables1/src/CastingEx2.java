
public class CastingEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		자동형변환
//		묵시적, 명시적
		
//		1. boolean을 제외한 나머지 7개의 기본형은 서로 형변환이 가능하다.
//		2. 기본형과 참조형은 서로 형변환할 수 없다.
//		3. 서로 다른 타입의 변수간의 연산은 형변환을 하는 것이 원칙이지만,
//		값의 범위가 작은 타입에서 큰 타입으로의 형변환은 생략할 수 있다.

		int num = 0;
		long bigNum = 1234567890123L;	//long에는 int가 들어갈 수 없다. 자동적/묵시적으로 int 앞에 (long)이 붙여진다. 우리 눈에는 안보이게. 사실상 long bigNum = (long)0 이다.
		
//		작은 값(byte)에서 큰 값으로 넘어갈때는 자동적/묵시적으로 형변환이 분여지지만, 큰 값에서 작은 값으로 넘어갈때는 명시적/억지로 입력해줘야한다.
		
		float tinyNum = (float)0.0;		//float의 경우는 자동적/묵시적으로 안되므로 명시적/억지로 입력해 줘야 한다.
		double d = 0.0;
		
//		float같은 경우에는 크기와 상관 없이 자동적/묵시적으로 형변환이 안된다.
		
//		num = bigNum;
//		bigNum = num;
		
//		tinyNum = (float)0.12345678901234567890;
//		d = 0.12345678901234567890;		//출력을 했을 때 double이 더 근사치의 값을 나타낸다.
//		
//		System.out.println(tinyNum);
//		System.out.println(d);
		
//		정수 / 실수
//		bigNum = (long)d;
		d = bigNum;
		
		System.out.println(d);

	}

}
