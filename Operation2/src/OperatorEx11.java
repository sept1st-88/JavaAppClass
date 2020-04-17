
public class OperatorEx11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 5;
		int n = 150;
		
		System.out.println("5는 0보다 크고, 9보다는 작다.");
		System.out.println(num > 0 && num < 9);
//		System.out.println(0 < num < 9);	//이렇게는 안됨.
		
		System.out.println("0보다 작거나 100보다 큰 가?");
		System.out.println(n < 0 || n > 100);
		
	}

}