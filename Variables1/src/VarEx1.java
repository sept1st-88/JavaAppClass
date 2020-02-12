
public class VarEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 	변수 (Variables)
			변수란? 단 하나의 값을 저장할 수 있는 메모리 공간.
			하나의 변수에 단 하나의 값만 저장 가능.
		 *
		 * */
		
//		변수의 명명규칙
//		1. 대소문자가 구분되며 길이에 제한이 없다.
//			- true와 True는 서로 다른 것으로 간주한다.
//		2. 예약어를 사용해서는 안 된다.
//			- true는 예약어라서 사용 할 수 없지만, True는 가능하다.
//		3. 숫자로 시작해서는 안 된다.
//			- top10은 허용되지만, 7up는 허용 되지 않는다.
//		4. 특수문자는 '_'와 '$'만을 허용한다.
//			- $harp은 허용되지만, $#arp는 허용 되지 않는다.
		
//		클래스 명명규칙
//		1. 클래스 이름의 첫 글자는 항상 대문자로 한다.
//			- 변수와 메서드의 이름의 첫 글자는 항상 소문자로 한다.
//		2. 여러 단어로 이루어진 이름은 단어의 첫 글자를 대문자로 한다.
//			- lastIndexOf, StringBuffer		낙타표기법(CamelCase)
//		3. 상수의 이름은 모두 대문자로 한다.
//		여러 단어로 이루어진 경우 '_'로 구분한다.
//			- PI, MAX_NUMBER
//			last_index_of		파스칼 표기법(안드로이드에서 많이 볼 것)
		
//		변수의 타입
//		값의 종류
//		1. 문자
//		2. 숫자
//			- 정수
//			- 실수
		
		
		
//		보라색/오렌지색은 예약어(여기서는 int)
//		변수타입(int) 변수명(year,age) 
		int year = 0;
		int age = 14;
		
		System.out.print(year);
		System.out.println(age);
		
		year = age + 2000;
		age = age + 1;
		
		System.out.println(year);
		System.out.println(age);

	}

}
