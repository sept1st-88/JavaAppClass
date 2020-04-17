import java.util.Scanner;

/*
 * 
 * 음수 양수 구분 프로그램
 * 사용자가 입력한 숫자에 대해 판단해둔다
 * 4번 시도할 수 있다
 * ===================================
 * 사용자가 입력한 숫자 ?
 * 음수
 * or
 * 양수
 * or
 * 0
 * 
*/
public class ForTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input = 0;
		
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < 4; i++) {
			System.out.println("숫자 입력");
			input = scan.nextInt();
			
			if(input < 0) {
				System.out.println("음수");
			}else if(input > 0) {
				System.out.println("양수");
			}else {
				System.out.println("0");
			}
		}

	}

}
