
public class ForEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		while문
//		표현식
//		while() {
//			조건식의 연산결과가 참(true)인 동안, 반복될 문장들을 적는다
//		}
		
		int count = 0;
//		무한루프 (자동적으론 멈추지 않는다. for문과는 다르게 조건식이 주어지지 않기 때문에 무한을 막기 위해서 조건식과 안에 문장들을 잘 조작해주어야 한다.)
		while(count <= 10) {
			System.out.println(count);
			count++;
		}
		
		System.out.println("프로그램 종료");
		
	}

}
