
public class User {
	
	String user = "";
	int diceNum = 0;
	
	int userInfo() {
		diceNum = (int)(Math.random() * 6);
		
		return diceNum;
	}

}
