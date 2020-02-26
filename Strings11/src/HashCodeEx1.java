
public class HashCodeEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		문자열 비교는 무조건 equals 사용을 규칙으로
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println("abc" == str1);
		System.out.println("abc" == "abc");
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));	//String 같은 경우에는 hashCode가 같고 equals에서는 hashCode가 같으므로 true
		System.out.println("abc".hashCode());
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(System.identityHashCode(str1)); //유일 주소
		System.out.println(System.identityHashCode(str2));
		
	}

}
