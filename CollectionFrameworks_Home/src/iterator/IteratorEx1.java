package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx1 {
	
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		Iterator it = list.iterator(); //일회용. 한번 얻어오면 한번밖에 사용 못한다.
		
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
		
		while (it.hasNext()) {
			System.out.println(it.next());
			it.remove(); //next()로 불러온 요소들을 삭제. 아래 출력은 안된다.
		}
		
		// 두번 불러올 수 없다. 위에 while문에서 한번 소진 했기 때문에.
		// 다시 불러오기 위해선 iterator를 다시 선언해야함
		it = list.iterator();
		
//		while (it.hasNext()) {
//			System.out.println(it.next());
//		}
							//람다식 
		it.forEachRemaining(System.out::println);
	}

}
