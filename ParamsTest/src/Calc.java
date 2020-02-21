/*
 * 계산기를 만드시오
 * +
 * / 정도만 만들면 됨
 * 사용자가 숫자를 입력한다
*/
public class Calc {
	
	void add(int[] numArr) {
		int sum = 0;
		for (int i = 0; i < numArr.length; i++) {
			sum = sum + numArr[i];
		}
		System.out.println("void add(int[] numArr) 결과");
		System.out.println(sum);
	}
	
}
