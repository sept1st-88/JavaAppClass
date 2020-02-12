
public class OperatorTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		올림 처리
		float pi = 3.141592f;
		
		// 소수점 2째자리까지 표현 3번째 자리에서 올림처리 (마지막 자릿 수가 0 이였을때를 감안해, 0 일시에는 올림이 될 수 없으므로 1이 아닌 0.9를 더한다. 반올림의 경우는 0.5를 더한다)
		float shortPi = (int)(pi * 100 + 0.9) / 100f;
//		
//		314.1592 + 0.9
//		315 / 100
		
		System.out.println(shortPi);
		
	}

}
