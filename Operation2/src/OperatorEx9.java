
public class OperatorEx9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		삼항 연산자
		
		int x = 10;
		int y = -10;
		
		int absX = 0;
		int absY = 0;
		
//				 true  false
//		(조건식) ? 식1 : 식2		//true이면 식1이 출력되고, false면 식2가 출력된다.
		absX = (x >= 0) ? x : -x;
//		absX = x;
		absY = (x >= 0) ? y : -y;
//		absY = -y;
		
		System.out.println("x의 절대값은 " + absX);
		System.out.println("y의 절대값은 " + absY);
		
		String str = "";
		
		str = "아하 문자열 좋네";
		System.out.println(str);
		
	}

}