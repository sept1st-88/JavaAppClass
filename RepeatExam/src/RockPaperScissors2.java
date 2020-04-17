import java.util.Scanner;

public class RockPaperScissors2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int user = 0;
		int com = 0;
		
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < 3; i++) {
			System.out.println("가위(1), 바위(2), 보(3) 중에 고르세요.");
			
			user = scan.nextInt();
			String userChoice = "";
			
			if(user == 1) {
				userChoice = "가위";
			}else if (user == 2) {
				userChoice = "바위";
			}else if (user == 3) {
				userChoice = "보";
			}else {
				userChoice = "invalid";
			}
			
			com = (int)(Math.random() * 3) + 1;
			String comChoice = "";
			
			if(com == 1) {
				comChoice = "가위";
			}else if (com == 2) {
				comChoice = "바위";
			}else if(com == 3) {
				comChoice = "보";
			}
			
			System.out.println("입력하신 값은 " + user + " " + userChoice + "입니다.");
			System.out.println("컴퓨터가 입력한 값은 " + com + " " + comChoice + "입니다.");
			
			String msg = "";
			
			int result = user - com;
			
			if (userChoice == "invalid") {
				msg = "invalid";
			}else if(result == 2 || result == -1) {
				msg = "당신이 졌습니다";
			}else if (result == 1 || result == -2) {
				msg = "당신이 이겼습니다";
			}else if (result == 0) {
				msg = "비겼습니다";
			}
			
			System.out.println(msg);
		}

	}

}
