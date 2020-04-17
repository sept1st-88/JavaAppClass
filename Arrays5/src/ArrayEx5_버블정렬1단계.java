
public class ArrayEx5_버블정렬1단계 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numArr = {15, 11, 1, 3, 8};
		int count = 0;
		
		System.out.println("초기값");
		for (int i = 0; i < numArr.length; i++) {
			System.out.print(numArr[i] + "  ");
		}
		
		int tempNum = 0;
		for (int i = 0; i < numArr.length; i++) {
			for (int n = 0; n < numArr.length - 1; n++) { //length - 1인 이유는 총 비교횟수가 배열의 크기가 아닌 각 값을 비교하는 횟수이기 때문이다.
				count++;								  //ex. 1. 0번째와 1번째 비교	2. 1번째와 2번째 비교	3. 2번째와 3번째 비교	4. 3번째와 4번째 비교
				if(numArr[n] > numArr[n + 1]) {
					tempNum = numArr[n];
					numArr[n] = numArr[n + 1];
					numArr[n + 1] = tempNum;
				} // if end
			} // n for end
		} // i for end
		
		System.out.println();
		System.out.println("정렬 후");
		for (int i = 0; i < numArr.length; i++) {
			System.out.print(numArr[i] + "  ");
		}
		System.out.println();
		System.out.println("비교 횟수: " + count + "번");
		
	} // main

}
