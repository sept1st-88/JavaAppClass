
public class Rectangle {

//	점이 4개 있으면 사각형이다
	
//	배열
	
	Point[] pointArr = null;
	
	public Rectangle(Point[] pointArr) {
		this.pointArr = pointArr;
	}
	
	void info() {
		System.out.println();
		System.out.println("사각형:");
		for (int i = 0; i < pointArr.length; i++) {
			System.out.println("x: " + pointArr[i].x + ", y: " + pointArr[i].y);
		}
	}
	
}
