
public class DrawShape {
	
	public static void main(String[] args) {
		
		/*
		 * 원
		 */
		Circle circle = new Circle();
		
		circle.r = 5;
		
//		Point p = new Point();
		
//		p.x = 2;
//		p.y = 3;
		
//		circle.point = p;
		
//		circle.info();
		
		/*
		 * 삼각형
		 */
		Point p1 = new Point(2, 3);
		Point p2 = new Point(5, 3);
		Point p3 = new Point(3, 10);
		
//		Point[] pointArr = new Point[3];
//		pointArr[0] = p1;
//		pointArr[1] = p2;
//		pointArr[2] = p3;
//		
//		Triangle tri = new Triangle(pointArr);
		Triangle tri = new Triangle(p1, p2, p3);
		
		tri.info();
		
		
		/*
		 * 사각형
		 */
		Point[] pointArr = new Point[4];
		
		Point rp1 = new Point(2, 2);
		Point rp2 = new Point(5, 2);
		Point rp3 = new Point(5, 5);
		Point rp4 = new Point(2, 5);
		
		pointArr[0] = rp1;
		pointArr[1] = rp2;
		pointArr[2] = rp3;
		pointArr[3] = rp4;
		
		Rectangle rec = new Rectangle(pointArr);
		
		rec.info();
		
	}

}
