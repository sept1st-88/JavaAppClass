/*
 * 주사위		1
 * 유저		2
 * 메인		유저 이름 입력
 * 		유저1
 * 		유저2
 * 			10번째 칸에 먼저 도착한 사람이 승리
 */
public class Dice {
	
	int diceNum = 0;
	
	int diceRoll() {
		diceNum = (int)(Math.random() * 6);
		
		return diceNum;
	}

}
