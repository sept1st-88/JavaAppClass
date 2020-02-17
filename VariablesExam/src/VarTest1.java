/*
 * VariablesExam 프로젝트명
 * 2020년을 기준으로 자신의 나이를 출력하시오
 * 
 */
public class VarTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int currentYear = 2020;
		int yearOfBirth = 1988;
		int age = 0;
		
		age = currentYear - yearOfBirth + 1;
		
//		1
		System.out.print("저의 나이는 ");
		System.out.print(age);
		System.out.println("살 입니다.");
		
//		2 concatenation		연결(연쇄)
		System.out.println("저의 나이는 " + age + "살 입니다.");
				
//		숫자 + 숫자 = 숫자
//		숫자 + 글자 = 글자
//		글자 + 글자 = 글자
//		글자 + 숫자 = 글자
		
		System.out.println("나의 " + age + 1 + "은 글자란다");
		System.out.println(age + 1 + "는 숫자");
		System.out.println(age + "1" + "에서 1은 글자가 된다");

	}

}
