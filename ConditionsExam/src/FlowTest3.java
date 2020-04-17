import java.util.Scanner;

/*
 * 홀짝 판별 프로그램
 * if else사용
 * ========================
 * 입력하신 값은 ?
 * 홀입니다
 * or
 * 짝입니다 라고 출력
 */
public class FlowTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		if else
		
		int input = 0;
		int tempNum = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자를 입력해주세요");
		
		input = scan.nextInt();
		tempNum = input % 2;
		
		System.out.println("입력하신 값은 " + input);
		
		if(tempNum == 1) {
			System.out.println("홀입니다");
		}else {
			System.out.println("짝입니다");
		}

	}

}
