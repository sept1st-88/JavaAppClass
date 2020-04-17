
public class HumanMain {
	
	public static void main(String[] args) {
		
		Human hong = new Human();
		
		hong.gender = "male";		//그동안 했던 방식은 이렇게 변수를 메인에서 할당해주어, 기본 생성자가 알아서 생성되게 했다면
		hong.hairColor = "black";	//매개변수를 포함한 생성자를 만들면 기본 생성자가 생성되지 않기 때문에 기본 생성자를 직접 만들어 주어야한다.
		hong.age = 27;
		
		System.out.println("성별: " + hong.gender);
		System.out.println("머리 색상: " + hong.hairColor);
		System.out.println("나이: " + hong.age);
		
		System.out.println();
		
		Human park = new Human("female", "brown", 29);	//매개변수를 포함한 생성자를 사용
		
		System.out.println("성별: " + park.gender);
		System.out.println("머리 색상: " + park.hairColor);
		System.out.println("나이: " + park.age);
		
	}
	
}
