import java.util.Scanner;

public class DiceMain {

	public static void main(String[] args) {
		
		Dice dice = new Dice();
		
		String name1 = "";
		String name2 = "";
		int result1 = 0;
		int result2 = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("유저1 이름을 입력해주세요");
		name1 = scan.nextLine();
		
		System.out.println("유저2 이름을 입력해주세요");
		name2 = scan.nextLine();
		
		result1 = dice.diceRoll();
		result2 = dice.diceRoll();
		
		while(true) {
			System.out.println(name1 + "님, 주사위 값입니다: " + result1);
			System.out.println(name1 + "님, 주사위 값입니다: " + result2);
		}
		
	}
	
}
