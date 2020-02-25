
public class StringEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String은 실제로는 클래스이다,
		//하지만 자주 사용하기 때문에 기본형으로 사용할 수 있게 만들어졌다
//		String str = "";
//		
//		String s = new String();
//		
//		String test = new String("생성자까지?");
//		
//		s.equals("??");
		
		
		
		//String클래스의 생성자와 메서드
		
		//String (String s)
		//주어진 문자열s를 갖는 String 인스턴스 생성
//		String s = new String("Hello");
//		System.out.println(s);
		
		//char charAt(int index)
		//index 위치에 있는 문자를 알려준다
//		String s = "Hello";
//		String n = "0123456";
//		char c = s.charAt(0);
//		char c2 = n.charAt(5);
//		System.out.println(c);
//		System.out.println(c2);
		
		//String concat(Sring str)
		//문자열str를 뒤에 덧붙인다
//		String s = "Hello";
//		String s2 = s.concat(" World");
//		System.out.println(s2);
		
		//boolean endsWith(String suffix)
		//지정된 문자열suffix로 끝나는지 검사한다
//		String file = "Hello.txt";
//		boolean b = file.endsWith("txt");
//		System.out.println(b);
		
		//boolean equals(Object obj)
		//매개변수로 받은 문자열obj와 String인스턴스의 문자열을 비교한다.
		//obj가 String이 아니거나, 문자열이 다르면 false를 반환한다.(대소분자를 구분한다)
//		String s = "Hello";
//		boolean b = s.equals("Hello");
//		boolean b2 = s.equals("hello");
//		System.out.println(b2);
		
		//boolean equalsIgnoreCase(String str)
		//문자열과 String인스턴스의 문자열을 대소문자 구분없이 비교한다
//		String s = "Hello";
//		boolean b = s.equalsIgnoreCase("HELLO");
//		boolean b2 = s.equalsIgnoreCase("heLLo");
//		System.out.println(b);
//		System.out.println(b2);
		
		//int indexOf(int ch)
		//주어진 문자ch 또는 문자코드값의 문자가 문자열에 존재하는지 확인하여
		//위리index를 알려준다. 없으면 -1값을 반환한다
//		String s = "Hello";
//		int idx1 = s.indexOf('o');
//		int idx2 = s.indexOf(111);
//		int idx3 = s.indexOf('k');
//		System.out.println(idx1);
//		System.out.println(idx2);
//		System.out.println(idx3);
		
		//int indexOf(String str)
		//주어진 문자열이 존재하는지 확인하여 위치index를 알려준다
		//없으면 -1 값을 반환한다
//		String s = "ABCDEFG";
//		int idx1 = s.indexOf("CD");
//		System.out.println(idx1);
		
		//int lastIndexOf(int ch)
		//지정된 문자 또는 문자코드를 문자열의 끝에서부터 찾아서
		//위치index를 알려준다. 없으면 -1을 반환한다
//		String s = "java.lang.Object";
//		int idx1 = s.lastIndexOf('.');
//		int idx2 = s.indexOf('.');
//		System.out.println(idx1);
//		System.out.println(idx2);
		
		//int lastIndexOf(String str)
		//지정된 문자열을 인스턴스의 문자열 끝에서부터 찾아서
		//위치index를 알려준다. 없으면  -1을 반환한다
		String s = "java.java.java";
		int idx1 = s.lastIndexOf("java");
		int idx2 = s.indexOf("java");
		System.out.println(idx1);
		System.out.println(idx2);
		
		//int length()
		//문자열의 길이를 알려준다
//		String s = "Hello";
//		int length = s.length();
//		System.out.println(length);
		
		//String replace(char old, char nw)
		//문자열중의 문자old를 새로운 문자nw로 바꾼 문자열은 반환한다
//		String s = "Hello";
//		String s1 = s.replace('3', 'C');
//		System.out.println(s1);
		
		//String replaceAll(String regex, String replacement)
		//문자열중에서 지정된 문자열regex과 일치하는 것을 새로운 문자열replacement로 모두 변경한다
//		String ab = "AABBAABB";
//		String r = ab.replaceAll("BB", "bb");
//		System.out.println(r);
		
		//String replaceFirst(String regex, String replacement)
		//문자열중에서 지정된 문자열(regex)과 일치하는 중,
		//첫째 것만 새로운 문자열replacement로 변경한다
//		String ab = "AABBAABB";
//		String r = ab.replaceFirst("BB", "bb");
//		System.out.println(r);
		
		//String[] split(String regex)
		//문자열을 지정된 분리자regex로 나누어 문자열배열에 담아 반환한다
//		String animals = "dog,cat,bear";
//		String[] arr = animals.split(",");
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
		
		//String[] split(String regex, int limit)
		//문자열을 지정된 분리자regex로 나누되 지정된 개수만큼만 나누어
		//문자열 배열로 반환한다
//		String animals = "dog,cat,bear";
//		String[] arr = animals.split(",",2);
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
		
		//boolean startsWith(String prefix)
		//주어진 문자열prefix로 시작하는지 검사한다
//		String s = "java.lang.Object";
//		boolean b = s.startsWith("java");
//		boolean b2 = s.startsWith("lang");
//		System.out.println(b);
//		System.out.println(b2);
		
		//String substring(int begin)
		//String substring(int begin, int end)
		//주어진 시작위치begin부터 끝위치end 범위에 포함된 문자열을 얻는다
		//이때 시작위치의 문자는 범위에 포함되지만, 끝위치의 문자는
		//포함되지 않는다 (begin <= x < end)
//		String s = "java.lang.Object";
//		String c = s.substring(10);
//		String p = s.substring(5, 12);
//		System.out.println(c);
//		System.out.println(p);
		
		//String toLowerCase()
		//String인스턴스에 저장되어있는 문자열을 소문자로 변환한 결과를 반환한다
//		String s = "Hello";
//		String s1 = s.toLowerCase();
//		System.out.println(s1);
		
		//String toString()
		//String인스턴스에 저장되어있는 문자열을 반환한다
//		String s = "Hello";
//		String s1 = s.toString();
//		System.out.println(s1);
		
		//String toUpperCase()
		//String인스턴스에 저장되어있는 문자열을 대문자로 변환한 결과를 반환한다
//		String s = "Hello";
//		String s1 = s.toUpperCase();
//		System.out.println(s1);
		
		//String trim()
		//문자열의 앞과 뒤에 있는 공백을 없엔 결과를 반환한다.
		//이때 문자열 중간에 있는 공백은 제거되지 않는다.
//		String s = "   Hello World   ";
//		String s1 = s.trim();
//		System.out.println(s1);
		
		//static String valueOf(boolean b)
		//static String valueOf(char c)
		//static String valueOf(int i)
		//static String valueOf(long l)
		//static String valueOf(float f)
		//static String valueOf(double d)
		//static String valueOf(Object o)
		//매개변수로 넘겨 받은 값을 문자열로 변환하여 반환한다.
		//참조변수에는 toString()을 호출한 결과를 반환한다.
//		String b = String.valueOf(true);
//		String c = String.valueOf('a');
//		String i = String.valueOf(100);
//		String l = String.valueOf(100L);
//		String f = String.valueOf(10.0f);
//		String d = String.valueOf(10.0d);
//		java.util.Date o = new java.util.Date();
//		String date = String.valueOf(o);
//		
//		System.out.println(b);
//		System.out.println(c);
//		System.out.println(i);
//		System.out.println(l);
//		System.out.println(f);
//		System.out.println(d);
//		System.out.println(date);

	}

}
