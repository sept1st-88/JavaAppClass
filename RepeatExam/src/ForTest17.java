import java.util.Scanner;

/*
 * 숫자 맞추기 
 * 맞춘후에 계속 진행하고 싶을때 Y를 눌러 재진행
 * 종료하고 싶을때 N을 눌러 종료
*/
public class ForTest17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int userSelectNum = 0;
		int answer = 0;
		boolean start = false;
		boolean check = false;
		String userChoice = "";
		
		Scanner scan = new Scanner(System.in);
		
		start = true;
		
		while(start) {
			answer = (int)(Math.random() * 100) + 1;
			System.out.println(answer);
			
			System.out.println("상대방이 숫자를 선택했습니다.");
			System.out.println("1~100사이니 맞춰보세요.");
			
			check = true;
			while(check) {
				System.out.println("1과 100 사이의 정수를 입력하세요. >\t");
				userSelectNum = scan.nextInt();
				
				if(userSelectNum > answer) {
					System.out.println("더 작은 수로 다시 시도해주세요.");
				}else if(userSelectNum < answer) {
					System.out.println("더 큰 수로 다시 시도해주세요.");
				}else if(userSelectNum == answer){
					System.out.println("정답입니다. 다시 시작해보겠습니까? >> (y는 예 / n은 아니오)");
					
					scan.nextLine();
					userChoice = scan.nextLine();
					
					if(userChoice.equals("y")) {	//String일때 == 대신 사용하는 것
						System.out.println("다시 실행합니다.");
						check = false;
					} else if (userChoice.equals("n")) {
						System.out.println("종료합니다.");
						start = false;
						break;
					}
				}
			}
		}

	}

}
