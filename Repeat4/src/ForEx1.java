
public class ForEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		for문
//		표현식
//		for(초기화; 조건식(true일때 바로 아래 문장들이 실행된다); 증감식) {
//			조건식이 참일 때 수행 될 문장들을 적는다
//		}
		
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
		
//		System.out.println(i);		//i는 for문 안에서 출력이 되고 밑으로 내려오기전에 for문이 끝나면 소멸이 된다.

	}

}
