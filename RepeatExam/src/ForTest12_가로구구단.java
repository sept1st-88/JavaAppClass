
/*
 * while문을 이용한
 * 구구단(가로)
 * 
*/
public class ForTest12_가로구구단 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 0;
		int num2 = 0;
		int result = 0;
		
		num1 = 2;
		num2 = 1;
		
		while (num1 <= 9) {
			while (num2 <= 9) {
				result = num1 * num2;
				System.out.print(num1 + " * " + num2 + " = " + result + "\t");
				num2++;
			}
			System.out.println();
			num2 = 1;
			num1++;
		}

	}

}
