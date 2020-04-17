/*
 * 점수: 100, 81, 100, 100, 93, 17
 * 81.833333...
 * 총점과 평균을 구하시오
 * 평균은 소수점 3번째 자리에서 반올림 하시오**
 * 무조건 배열을 사용하자
 * ===============================
 * 총점 : 평균
 * ??? : ???
*/
public class ArrayTest2_평균_반올림 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] scoreArr = {100, 81, 100, 100, 93, 17};
		
		int sum = 0;
		double cnt = 0.0;
		double avg = 0.0;
		
		for (int i = 0; i < 6; i++) {
			sum = sum + scoreArr[i];
			cnt++;
		}
		
		avg = sum / cnt;
//		실수 = (double)정수 / 실수; double이란 실수가 int라는 정수보다 크기 때문에 여기서 정수는 자동적으로 double로 형변환이된다
//		avg = (int)(avg * 100 + 0.5) / 100d; //여기서는 정수로 형변환후 다시 정수(100)로 나누면 결과값은 정수가 된다. 
											  //그러므로 실수인 100.0으로 적어주거나 뒤에 d를 추가해줌으로 변환시켜준다.
		
		//위에 방식을 가독성 좋게 분할 할시 (강점: 증명 및 결과의 원리를 나타냄)
		avg = sum / cnt;		//평균
		System.out.println(avg);
		avg = avg * 100;		//두자리 수까지 구할 로직
		System.out.println(avg);
		avg = avg + 0.5;		//반올림 처리
		System.out.println(avg);
		avg = (int)avg;			//실수부 버리기
		System.out.println(avg);
		avg = avg / 100.0;		//자릿수 되돌리기 => 소숫점 셋째 자리에선 반올림 결과
		System.out.println(avg);
		
		System.out.println("총점 : 평균");
		System.out.println(sum + " : " + avg);

	}

}
