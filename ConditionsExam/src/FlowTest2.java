
/*
 *1인지 0인지 판단하는 프로그램
 *삼항연산자를 이용해서
 *입력하신 값은 1
 *"전원을 켰습니다"
 *입력하신 값은 0
 *"전원을 종료합니다"
 */
public class FlowTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input = 0;
		
		input = 1;
		
		if(input != 0) {
			System.out.println("입력하신 값은 " + input);
			System.out.println("전원을 켰습니다");
		}else {
			System.out.println("입력하신 값은 " + input);
			System.out.println("전원을 종료합니다");
		}
		
		//if문을 두번 사용하는 것과 차이점: if문 두번 사용시 첫번째 if문이 충족됐음에도 불구하고 다음 if문도 실행한다. if else는 if가 충족되면 else는 실행하지 않는다(거기서 멈춤). 그러므로 실행 속도에서 차이가 난다.

	}

}
