package str.exam;

public class StringLv4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 절대 원본 데이터를 변경하지 않는다
		String originStr = "문자열은 재밌네요의 문짝입니다 안녕하세요 자바의 문자열 요~? 자바에서 문자열은 중요한가요 요!?";		//기준 
		String changeStr = "";          // 결과
		
		// 어떤 글자든 원하는 키워드를 원하는 갯수 만큼만 변경해준다
		// ex:
//		문자열은 재밌네요의 문짝입니다 안녕하세요 자바의 문자열 요~? 자바에서 문자열은 중요한가요 요!?
//		위의 문장에서 문자열 2개를 객체로 바꾼다면  
//		객체은 재밌네요의 문짝입니다 안녕하세요 자바의 객체 요~? 자바에서 문자열은 중요한가요 요!?
		
		//"자바"를 "객체"로 변경
		
		//문자열 배열로 변경
		String[] strArr1 = originStr.split("자바");
		
		changeStr = strArr1[0] + "객체" + strArr1[1] + "객체" + strArr1[2];
		
		System.out.println(originStr);
		System.out.println(changeStr);
		
		//시도...실패
//		for (int i = 0; i < strArr1.length; i++) {
//			System.out.print(strArr1[i]);
//			if(i < strArr1.length - 1) {
//				System.out.print("클래스");
//			}
//			
//		}
		System.out.println("==============================================================");
		
//		위의 문장에서 문자열 3개를 인스턴스로 바꾼다면  
//		인스턴스은 재밌네요의 문짝입니다 안녕하세요 자바의 인스턴스 요~? 자바에서 인스턴스은 중요한가요 요!?
		
		//문자열 배열로 변경
		String[] strArr2 = originStr.split("문자열");
		
		changeStr = strArr2[0] + "인스턴스" + strArr2[1] + "인스턴스" + strArr2[2] + "인스턴스" + strArr2[3];
		
		System.out.println(originStr);
		System.out.println(changeStr);
		
		
	}

}
