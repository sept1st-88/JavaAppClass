
public class Home {
	
	//외부 색
	String outerColor = "";
	//문 색
	String doorColor = "";
	//창문 수
	int numOfWindows = 0;
	
//	Home(String a, String b, int c){
//		outerColor = a;
//		doorColor = b;
//		numOfWindows = c;
//	}
	
	void Home() {
		outerColor = "grey";
		doorColor = "black";
		numOfWindows = 20;
		
		System.out.println("My home2: ");
		System.out.println("바깥 색상: " + outerColor);
		System.out.println("문 색상: " + doorColor);
		System.out.println("창문 수: " + numOfWindows);
	}

}
