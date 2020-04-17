
public class OperatorEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		논리 연산자
		
		int n = 10;
		
//		System.out.println(10 >= 20 && 10 <= 20);
//		System.out.println(10 >= 20 & 10 <= 20);
		System.out.println(n++ >= 20 && n++ <= 20);
		System.out.println(n);
		System.out.println(n++ >= 20 & n++ <= 20);
		System.out.println(n);
		
		
		System.out.println(n >= 20 || n <= 20);		//앞에것이 true일 경우 어쨌든 무조건 true이기 때문에 뒤에거는 계산을 안한다.
		System.out.println(n >= 20 | n <= 20);		//앞에것이 true여도 뒤에거 까지 끝까지 계산을 실행한다.
		
	}

}