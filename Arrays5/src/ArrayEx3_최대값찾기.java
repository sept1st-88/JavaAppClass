
public class ArrayEx3_최대값찾기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		최대값 찾기
		
		int[] scoreArr = {
				79, 88, 91, 33, 100, 55, 95
		};
		int maxNum = 0;
		
		for (int i = 0; i < 7; i++) {
			if(maxNum < scoreArr[i]) {
				maxNum = scoreArr[i];
			}
		}
		
		System.out.println("최대값: " + maxNum);
		
	}

}
