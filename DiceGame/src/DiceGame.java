
public class DiceGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		User user1 = new User("박상아");
		User user2 = new User("원아름");
		Dice dice = new Dice();
		
		int num1 = 0;
		int num2 = 0;
		int sum1 = 0;
		int sum2 = 0;
		
		System.out.println("===== 주사위 게임을 =====");
		System.out.println("첫번쨰 선수: " + user1.name + ", 두번째 선수: " + user2.name);
		
		while(true) {
			System.out.println(user1.name + "님 차례 ");
			user1.dice = dice;
			num1 = user1.dice.roll();
			System.out.println("주사위 숫자: " + num1);
			sum1 += num1;
			System.out.println(user1.name + "님의 총값: " + sum1);
			
			System.out.println(user2.name + "님 차례 ");
			user2.dice = dice;
			num2 = user2.dice.roll();
			System.out.println("주사위 숫자: " + num2);
			sum2 += num2;
			System.out.println(user2.name + "님의 총값: " + sum2);
			
			if(sum1 >= 10 || sum2 >= 10) {
				if(sum1 >= 10 && sum2 >= 10) {
					System.out.println("비겼습니다.");
				}else if(sum1 >= 10) {
					System.out.print("축하합니다! " + user1.name + "님이 이겼습니다 ");
				}else if(sum2 >= 10) {
					System.out.print("축하합니다! " + user2.name + "님이 이겼습니다 ");
				}
				break;
			}
		}

	}

}
