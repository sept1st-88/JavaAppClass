/*
 * 최대값, 최소값을 구하라
 * 
 * =====================
 * 최대값: 100
 * 최소값: 33
 *
 * >> 변외
 * 최대값의 위치는 5
 * 최소값의 위치는 4
 * 
*/
public class ArrayTest3_최대값최소값 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] scoreArr = {
				79, 88, 91, 33, 100, 55, 95
		};
		int maxNum = 0;
		int minNum = 0;
		int maxNumIdx = 0;
		int minNumIdx = 0;
			
//		for (int i = 0; i < 7; i++) {
//			if(maxNum < scoreArr[i]) {
//				maxNum = scoreArr[i];
//				maxNumIdx = i + 1;
//			}
//		}
//		
//		minNum = maxNum;	//begin comparison with max value and work right
////		or
////		minNum = scoreArr[0];	//begin comparison with first value and work right
//		
//		for (int i = 0; i < 7; i++) {	//가로(horizontal) 작업 >>
//			if(minNum > scoreArr[i]) {
//				minNum = scoreArr[i];
//				minNumIdx = i + 1;
//			}
//		}
		
//		System.out.println("최대값: " + maxNum + "\t 위치는 " + maxNumIdx + "입니다.");
//		System.out.println("최소값: " + minNum + "\t 위치는 " + minNumIdx + "입니다.");
		
		
		maxNum = scoreArr[0];
		minNum = scoreArr[0];
		
		for (int i = 1; i < 7; i++) {	//maxNum과 minNum은 첫번째 값인 79로 지정해줬기 때문에 79를 79랑 비교하는 것을 막기 위해 인덱스 1부터 비교를 한다
			if(maxNum < scoreArr[i]) {
				maxNum = scoreArr[i];
			}
			if(minNum > scoreArr[i]) {
				minNum = scoreArr[i];
			}
		}
		
		System.out.println("최대값: " + maxNum);
		System.out.println("최소값: " + minNum);

	}

}
