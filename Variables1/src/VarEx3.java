
public class VarEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		형변환 기술 type casting
		// byte < short < int < long
		// 1		2		4	 8
		
//		int score = 85.4;  //error: int can only hold whole numbers
		int score = (int)185.4;		//형변환 추가시 오른쪽에서 왼쪽으로 읽혀짐. 형변환 바로 이후의 것들을 수행 후 변환한다. int로 읽히기 위해 .이후의 숫자는 잘라낸다 (억지로 컴퓨터에게 이 값이 맞다 지정해줌)
		byte b = (byte)score;
		
		System.out.println(score);
		System.out.println(b);

	}

}
