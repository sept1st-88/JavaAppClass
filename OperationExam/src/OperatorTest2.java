
public class OperatorTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 5, k = 10;
		
		System.out.println(n++);
//		n++ => n = n + 1 (++이 뒤에 올때는 미래에 하겠다는 뜻이다. 이 후에 불러 왔을때는 + 1이 이미 되어 있다.)
		System.out.println(n);
		
		System.out.println(++k);	//++이 앞에 올때는 + 1은 우선 실행한다.
		System.out.println("k: " + k);
		
	}

}
