
public class MyCalculatorMain2 {
	
	public static void main(String[] args) {
		
		MyCalculator2 calc = new MyCalculator2();
		
		int a = 0;
		int b = 0;
		
		a = 3;
		b = 5;
		
		System.out.println(a + ", " + b);
		System.out.println();
		
		calc.add(a, b);
		calc.subtract(a, b);
		calc.multiply(a, b);
		calc.divide(a, b);
		calc.divisionOf(a, b);
		
	}
	
}
