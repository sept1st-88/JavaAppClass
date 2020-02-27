import java.util.Scanner;

// 스마트 구구단

// 시작 값 ~ 끝 값
// 2, 4
// 2단 ~ 4단 까지 출력된다.


// 한 명 메인, 한 명 클래스
public class Gugudan {
	
	int firstNum = 0; // 첫번째 값
	int finalNum = 0; // 마지막 값
	int[] gugudanArr = new int[81];
	
	void intro() {
		System.out.println("===== 스마트 구구단 =====");
	}
	
	void input() {
		Scanner scan = new Scanner(System.in);
		System.out.print("첫번째 값을 입력하세요 >> ");
		firstNum = scan.nextInt();
		System.out.print("마지막 값을 입력하세요 >> ");
		finalNum = scan.nextInt();
	}
	
	void calculate() {
		int count = 0;
		
		for(int i = firstNum; i <= finalNum; i++) {
			for(int n = 0; n < 9; n++) {
				gugudanArr[count] = (i * (n+1));
				count++;
			}
		}
		
	}
	
	void output() {
		int count = 0;
		
		for(int i = firstNum; i <= finalNum; i++) {
			System.out.println();
			System.out.println("▶" + i + "단");
			for(int n = 0; n < 9; n++) {
				System.out.print(i + " * " + (n + 1) + " = " + gugudanArr[count] + "\t");
				count++;
				if((n + 1) % 3 == 0) {
					System.out.println();
				}
			}
			System.out.println();
			System.out.println("===========================================");
		}
	}
	
}