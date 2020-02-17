import java.util.Scanner;

public class FlowTest7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		switch 작성
//		숫자를 입력받아
//		봄여름가을겨울을 표시하시오
//		1
//		겨울
		
//		달을 입력해주세요 1
//		1월은 겨울입니다
		
		Scanner scan = new Scanner(System.in);
		
		int month = 0;
		
		System.out.println("달을 입력해주세요");
		month = scan.nextInt();
		
		switch (month) {
			case 12 :
			case 1 :
			case 2 :
				System.out.println("겨울입니다.");
				break;
			case 3 :
			case 4 :
			case 5 :
				System.out.println("봄입니다.");
				break;
			case 6 :
			case 7 :
			case 8 :
				System.out.println("여름입니다.");
				break;
			case 9 :
			case 10 :
			case 11 :
				System.out.println("가을입니다.");
				break;
		}

	}

}
