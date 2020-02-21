import java.util.Scanner;

public class GugudanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Gugudan gugudan = new Gugudan("스마트 구구단");
		Gugudan gugudan = new Gugudan();
		//출력을 최대한 메서드로 하는 것. 메인은 메서드를 불러오기만 하는 것.
		gugudan.info();
		
//		System.out.println(gugudan.title);
//		System.out.println();
		
		gugudan.service();
		
//		gugudan.inputMethod();
//		gugudan.outputMethod();
		
	}

}
