
// 오버라이딩
// 접근 제어자는 조상 클래스의 메서드보다 좁은 범위로 변경 할 수 없다

public class Child extends Parent {

	//default는 public보다 좁은 범위이고 Parent에서 method()는 public이기 때문에
	//default 상태에서 오버라이딩 할 수 없다
	//반대로 Parent가 default이더라도 Child에서는 public을 사용할 수 있다.
	//하지만 특별한 경우 아닌 이상 동일한 범위를 잡는다
	public void method() {
		System.out.println("x = " + x);
		System.out.println("this.x = " + this.x);
		System.out.println("super.x = " + super.x);
	}
	
}
