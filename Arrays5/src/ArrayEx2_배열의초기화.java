
public class ArrayEx2_배열의초기화 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		명명규칙
//		(회에서는 s, List 형태로 주로 작성.)
//		우리는 배열은 무조건 변수명Arr로 작성 할것.
		
//		배열의 초기화
		//1
//		int[] numArr = null; //특별한 경우가 아닌한 null 초기화를 쓰지 않는다. (아래처럼 배열을 지정해주어야지만 에러가 안난다.)
//		numArr = new int[3];

		//2				 [0], [1], [2]	- index
		int[] scoreArr = {100, 90, 80};	//값들을 정확히 알고 있을때, 주로 테스트 할때 이 방식을 사용.
		//3
		String[] nameArr = new String[3];	//일방적으로 쓰는 방식
											//
		nameArr[0] = "철수";					//
		nameArr[1] = "상정";					//
		nameArr[2] = "준표";					//
		
		System.out.println(scoreArr[1]);
		System.out.println(nameArr[0]);
		
		
//		score의 총합을 구한다
		int sum = 0;
		
//		sum = scoreArr[0] + scoreArr[1] + scoreArr[2];
		
		for (int i = 0; i < 3; i++) {
			sum = sum + scoreArr[i];
		}
		
		System.out.println("점수의 총합: " + sum);
		
	}

}
