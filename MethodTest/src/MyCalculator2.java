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
public class MyCalculator2 {
	
	void add(int a, int b) {
		int addResult = 0;
		addResult = a + b;
		
		System.out.println("더하기: " + addResult);
	}
	void subtract(int a, int b) {
		int subResult = 0;
		subResult = a - b;
		
		System.out.println("빼기: " + subResult);
	}
	void multiply(int a, int b) {
		int mulResult = 0;
		mulResult = a * b;
		
		System.out.println("곱하기: " + mulResult);
	}
	void divide(double a, double b) {
		double divResult = 0;
		divResult = a / b;
		
		System.out.println("나누기: " + divResult);
	}
	void divisionOf(int a, int b) {
		int divOfResult = 0;
		divOfResult = a % b;
		
		System.out.println("나머지: " + divOfResult);
	}
	
}
