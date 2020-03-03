package game.player;

import java.util.Scanner;

public class PlayerVo {
	
	public String name = ""; //사용자 이름 초기화 
	
	//사용자 이름 출력 
	public String getName() {
		return name;
	}
	
	//사용자 이름 입력 
	public void setName() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("이름을 입력해주세요 ▷▷");
		name = scan.nextLine();
	}

}
