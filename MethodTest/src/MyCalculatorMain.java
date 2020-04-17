
public class MyCalculatorMain {
	
	public static void main(String[] args) {
		
		MyCalculator calc = new MyCalculator();
		
		int calculation = 0;
//		double dCalculation = 0.0;
		int a = 0;
		int b = 0;
		
		a = 3;
		b = 5;
		
		System.out.println(a + ", " + b);
		System.out.println();
		
		calculation = calc.add(a, b);
		System.out.println("더하기: " + calculation);
		
//		calculation = calc.subtract(a, b);
		System.out.println("빼기: " + calc.subtract(a, b));
		
//		calculation = calc.multiply(a, b);
		System.out.println("곱하기: " + calc.multiply(a, b));
		
//		dCalculation = calc.divide(a, b);
		System.out.println("나누기: " + calc.divide(a, b));
		
	}
	
}
