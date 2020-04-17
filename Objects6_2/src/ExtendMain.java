
public class ExtendMain {
	
	public static void main(String[] args) {
		
//		Parent p = new Parent();
//		Child c = new Child();	//Child는 Parent를 부모로 불러오고 있기 때문에, 굳이 Parent를 new로 생성 안해도 된다.
//		
////		p.name = "df"; // 에러! Child에 선언된 변수는 부모로 불러오지 못한다.
////		System.out.println(p.age);
//		
//		c.age = 332;
//		System.out.println(c.age);
//		c.name = "나";
//		System.out.println(c.name);
//		
//		c.weight = 10;
//		
//		System.out.println(c.weight);
		
		Child child = new Child();
		
		child.age = 10;
		child.play();
		
		Child2 c2 = new Child2();
		c2.age = 20;
		c2.weight = 100;
//		c2.play();	//에러! 같은 부모를 갖고 있더라도 Child라는 클라스와 아무런 관계/연관성이 없다
		
	}

}
