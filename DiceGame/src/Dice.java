
public class Dice {
	
	int roll() {
		int diceNum = 0;
		diceNum = (int)(Math.random() * 6) + 1;
		
		return diceNum;
	}

}
