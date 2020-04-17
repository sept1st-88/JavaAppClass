import java.util.Scanner;

public class OperatorEx12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 사용자가 입력할 변수
		int userInput = 0;
		
		// 임시 결과
		int tempNum = 0;
		
		// 사용자가 입력한 값에 대한 홀짝 결과
		String result = "";
		String userName = "";
		
		// 키보드 입력(외부입력)을 가능케 한다. 콘솔에 직접 입력 가능하게 해줌.
		Scanner scan = new Scanner(System.in);		//자동 완성 해야 위에 import ...가 생긴다
		
		System.out.println("홀짝 판별 프로그램 시작");
		
		System.out.println("고객님, 성함을 알려주세요.");
		userName = scan.nextLine();		// 사용자의 입력을 기다린다. nextLine(); = 문자열을 입력하라 (아무 입력이 없으면 현재 줄의 코드까지만 실행된다. 아래거는 출력 안됨)
		System.out.println(userName + "님 원하는 숫자를 입력해주세요.");
		
		userInput = scan.nextInt();		// nextInt(); 의 경우는 숫자만 입력 가능 (아무 입력이 없으면 현재 줄의 코드까지만 실행된다. 아래거는 출력 안됨)
		
		tempNum = userInput % 2;
//		1 % 2;	1 / 2 = 0 1
//		2 % 2;	2 / 2 = 1 0
//		3 % 2;	3 / 2 = 1 1
//		4 % 2;	4 / 2 = 2 0
		
//		1 0 치자
//		홀 짝
		// 사용자가 입력한 값에 대한 홀짝 판별 결과
		// 홀짝 판별 결과 false 이면 짝, true면 홀
		result = (tempNum == 0) ? "짝" : "홀";
		
		System.out.println(result);
		System.out.println(userName + "님이 입력하신 값은 " + userInput);
		
	}

}