
/*
 * 
 * 
*/
public class ForTest9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "";
		int mulNum = 0;
		
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				mulNum = j * i;
				str = j + " * " + i + " = " + mulNum + "\t";
				System.out.print(str);
			}
			System.out.println();
		}

	}

}
