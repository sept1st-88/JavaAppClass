package str.exam;

public class StringLv3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 절대 원본 데이터를 변경하지 않는다
		String originStr = "자바를 자바라"; // 기준
		String changeStr = ""; // 결과
		
		changeStr = originStr.substring(0, 3) + " 잡아" + originStr.substring(6);
		
		// 자바를 자바라를 자바를 잡아라로 변경하여 출력하시오

		System.out.println(originStr);
		System.out.println(changeStr);

	}

}
