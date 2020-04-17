
/*
 * 아래 모양을 출력하라
 * =======================
   *****
   ****
   ***
   **
   *
 * 
*/
public class ForTest7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < 5; i++) {
			for (int n = 5; n > i; n--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
