/*
 * 
 * 더하기, 빼기, 곱하기, 나누기
 * 기능을 구현하시오
 * 나누었을 때 소수점은 전부 표현한다
 * =========================
 * 3, 5
 * 더하기
 * 8
 * 빼기
 * -2
 * 곱하기
 * 15
 * 나누기
 * ??
 * 
*/
public class MyCalculator {
	
	int add(int a, int b) {
		int addResult = 0;
		addResult = a + b;
		
		return addResult;
	}
	int subtract(int a, int b) {
		int subResult = 0;
		subResult = a - b;
		
		return subResult;
	}
	int multiply(int a, int b) {
		int mulResult = 0;
		mulResult = a * b;
		
		return mulResult;
	}
	double divide(double a, double b) {
		double divResult = 0.0;
		divResult = a / b;
		
		return divResult;
	}
	
}
