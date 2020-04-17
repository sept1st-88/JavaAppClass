import java.util.Scanner;

/*
 * 사각형을 출력해라
 * =======================
   *****
   *****
   *****
   *****
 * 
*/
public class ForTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1
//		System.out.println("*****");
//		System.out.println("*****");
//		System.out.println("*****");
//		System.out.println("*****");
		
		//2
//		for (int i = 0; i < 4; i++) {
//			System.out.println("*****");
//		}
		
		//3 다중 for문
		for (int i = 0; i < 4; i++) {	//라인
			for (int j = 0; j < 5; j++) {	//표현
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
