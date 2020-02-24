/*
 * 오버로딩 vs 오버라이딩
 * 오버로딩은 기존에 없는 새로운 메서드를 추가하는 것 (new)
 * 오버라이딩은 상속받은 메서드의 내용을 변경하는 것 (change, modify)
 */
public class Point3D extends Point {
	// Overriding
	// 오버라이딩?
	// 조상 클래스로부터 상속받은 메서드의 내용을 변경하는 것을 오버라이딩이라고 한다.
	// 상속받은 메서드를 그대로 사용하기도 하지만, 자식 클래스 자신에 맞게 변경해야하는
	// 경우가 많다. 이럴 떄 조상의 메서드를 오버라이딩 한다.
	
	int z;
	
//	this() - 있기는 하지만 쓰지 않는다.
//	super() - 조상 클래스의 생성자
	Point3D(int x, int y, int z) {
		//super는 꼭 맨 위에 호출 되어야 한다
//		super();	//안적어줘도 묵시적으로 작성이 되는 부분이였다(기본생성자 일때)
//		super(2, 3);	//기본 생성자가 없는 부모일때에는 꼭 super로 생성자를 불러와야 한다 
		//단, 기본 생성자를 수동적으로 작성해주면, super는 작성하지 않아도 된다
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	// 오버라이딩의 조건
	// 자식 클래스에서 오버라이딩하는 메서드는 조상 클래스의 메서드와
	// - 이름이 같아야 한다
	// - 매개변수가 같아야 한다
	// - 반환타입이 같아야 한다 (구현만 다를 뿐)
//	String getLocation() {	//오버라이딩
//		return "x : " + x + ", y : " + y + ", z : " + z;
//	}
	
	String getLocation() {	//오버라이딩
		String msg = "";
		
		msg = super.getLocation();	//super로 부모의 것을 그대로 가져오는 것
		msg += ", z : " + z;
		
		return  msg;
	}

}
