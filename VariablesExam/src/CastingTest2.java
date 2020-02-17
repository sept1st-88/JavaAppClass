
public class CastingTest2 {

	public static void main(String[] args) {
		String name = "Ja" + "va";
		String str = name + 8.0;
		
//		변수에는 기본값이 있다.
//		숫자의 기본값: 0, 0.0,
		
		System.out.println(name);
		System.out.println(str);
		System.out.println(7 + " ");
		System.out.println(" " + 7);
		System.out.println(7 + "");
		System.out.println("" + 7);
		System.out.println("" + "" + 7);
		System.out.println(" " + " " + 7);
		System.out.println(7 + 7 + "");		//출력값은 왼쪽에서 오른쪽으로 숫자가 먼저 오면 숫자끼리 더해지며, 후에 문자열이 더해져서 출력값은 문자열이다.
		System.out.println("" + 7 + 7);
		
//		"" 빈따움표는 빈 문자열을 뜻한다.

	}

}
