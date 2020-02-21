import java.util.Scanner;

/*
 * 1. 구구단이 존재한다 -> 클래스: Gugudan (이것을 설계해야하는구나~)
 * 
 * 2. 속성
 * 단을 입력 받을 수 있다
 * 
 * 3. 단을 학생들이 입력할 수 있습니다.
 * 스스로 배우는 거죠. -> 메서드
 * 주제는 스마트 구구단이라고 한다 -> 생성자
 * 
 * 4. 입력된 단을 출력한다 -> 메서드
 * 
 * =================
 * 스마트 구구단
 * 
 * 단을 입력하세요 >> ?
 * 
 * 
*/
public class Gugudan {	//1

	int dan = 0;	//2
	String title = "";	//2
	
//	Gugudan(String title) {
//		this.title = title;
//	}
	
	void info() {
		title = "스마트 구구단";
		System.out.println(title);
	}
	
	void inputMethod() {	//3
		Scanner scan = new Scanner(System.in);
		
		System.out.println("단을 입력하세요 >> ");
		dan = scan.nextInt();
	}
	
	void outputMethod() {	//4
		int result = 0;
		
		for (int i = 1; i < 10; i++) {
			result = dan * i;
			System.out.print(dan + " * " + i + " = " + result + "\t");
		}
		System.out.println();
	}
	
	void service() {
		String str = "";
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			inputMethod();
			outputMethod();
			
			System.out.println("종료할래요? y/n");
			str = scan.nextLine();
			
			if(str.equals("y")) {
				break;
			}
		}
	}
	
}
