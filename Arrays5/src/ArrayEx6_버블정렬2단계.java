
public class ArrayEx6_버블정렬2단계 {

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
			for (int n = 0; n < numArr.length - 1 - i; n++) {	//-i는 횟수가 진행될때 마다 마지막에서부터의 자릿수들은 더이상 계산하지 않는것이다
				count++;										//ie) 첫번째 수행에서는 4번 비교를 했다면, 그 다음에는 3번, 그 다음은 2번 등등...
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
