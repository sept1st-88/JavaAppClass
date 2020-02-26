package str.exam;

public class StringLv4_2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 절대 원본 데이터를 변경하지 않는다
		String originStr = "문자열은 재밌네요의 문짝입니다 안녕하세요 자바의 문자열 요~? 자바에서 문자열은 중요한가요 요!?";		//기준 
		String changeStr = "";          // 결과
		
		StringLv4_2_Class stringLv4_2_Class = new StringLv4_2_Class();
		StringLv4_2_Class stringLv4_2_Class2 = new StringLv4_2_Class();
		
		changeStr = stringLv4_2_Class.changeWord1(originStr);
		System.out.println(originStr);
		System.out.println(changeStr);
		
		changeStr = stringLv4_2_Class2.changeWord2(originStr);
		System.out.println(originStr);
		System.out.println(changeStr);
		
	}

}
