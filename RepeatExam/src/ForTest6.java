import java.util.Scanner;

/*
 * 아래 모양을 출력하라
 * =======================
   *
   **
   ***
   ****
   *****
 * 
*/
public class ForTest6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < 5; i++) {
			for (int n = 0; n <= i; n++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
//		System.out.print("*");
//		System.out.println();
//		
//		System.out.print("**");
//		System.out.println();
//		
//		System.out.print("***");
//		System.out.println();
//		
//		System.out.print("****");
//		System.out.println();
//		
//		System.out.print("*****");
//		System.out.println();
		
		//1
//		int star = 1;
//		
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < star; j++) {
//				System.out.print("*");
//			}
//			star++;
//			System.out.println();
//		}
		
		//2
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
