import java.util.Scanner;

/*
 * 계산기를 만드시오
 * +
 * / 정도만 만들면 됨
 * 사용자가 숫자를 입력한다
*/
public class CalcMain_Overloading {
	
	public static void main(String[] args) {
		
		Calc calc = new Calc();
		
		int[] numArr = new int[10];
		numArr[0] = 1;
		numArr[1] = 2;
		numArr[2] = 3;
		numArr[3] = 13;
		
		calc.add(numArr);
		
	}
}
