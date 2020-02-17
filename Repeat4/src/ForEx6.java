import java.util.Scanner;

public class ForEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 0;
		int sum = 0;
		boolean flag = false;
		
		Scanner scan = new Scanner(System.in);		
		
		System.out.println("합계를 구할 숫자를 입력하세요(끝내려면 0을 입력)");
		
		flag = true;
		//무한루프
		while(flag) {
			System.out.println(">>");
			num = scan.nextInt();	//1. 숫자 입력을 요구한다.
			
			if(num != 0) {	//2. 입력한 숫자가 0이 아니다. 그럼 아래 것을 실행. flag은 아직 true이기 때문에 while문을 다시 실행.
				sum = sum + num;
			}else {
				flag = false;
			}
		}
		
		System.out.println("합계 : " + sum);
		
	}

}
