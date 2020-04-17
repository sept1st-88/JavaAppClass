package list.arraylist;

import java.util.ArrayList;

public class ArrayListEx1 {
	
	public static void main(String[] args) {
		
		//need to import java.util.ArrayList for use (Ctrl+Shift+o)
//		ArrayList list = new ArrayList(); //기본 길이가 10인 객체 배열이 만들어 진다 
		ArrayList list = new ArrayList(10); //가능한 배열의 길이를 직접 지정해주는 것이 좋다.
		//저장하려는 객채의 갯수보다 넉넉하게 잡아 주는 것이 좋다.
		//객체의 배열은 참조 변수 배열이기 때문에 배열의 길이를 저장할 객채의 갯수의 두배로 잡아도 별 차이가 없다.
		
		//ArrayList에 객체 추가:
		list.add("111"); //boolean add(Object o)
		list.add("222"); //순서대로 배열에 입력됨
		list.add("333");
		list.add("222"); //중복 가능 
		list.add(333); //list.add(new Interger(333)); 자동적으로
		
		//ArrayList의 toString()메서드는 모든 객채를 문자열로 변환해서 출력한
		System.out.println(list);
		
		//원하는 위치에 객체를 추가하고 싶을때:
		list.add(0, "000");
		System.out.println(list);
		
		//원하는 객체의 위치를 알고 싶을때 (첫번째거만 알려줌):
		System.out.println("index = " + list.indexOf("333"));
		
		//객체를 삭제하고 싶을때:
		list.remove("333"); //boolean remove(Object o)
		System.out.println(list);
		
		System.out.println(list.remove("333")); //false (없어서 삭제 실패)
		System.out.println("index = " + list.indexOf("333")); //위치를 찾고자 하는 객체가 없을때 -1을 출력 
		
		for (int i = 0; i < list.size(); i++) {
			//지정된 위치에 새로운 객체를 지정 
			list.set(i, i + ""); //Object set(index index, Object o)
			//for문을 이용해서 ArrayList에 문자열 0, 1, 2,... 을 저장한
		}
		
		System.out.print("{");
		for (int i = 0; i < list.size(); i++) {
			//지정된 위치에 객체를 출
			System.out.print(list.get(i) + ", ");
		}
		System.out.println("}");
		
		//객체를 삭제 할때 이렇게 하면 전부 삭제가 되지 않는다.
		//첫번째 부터 삭제를 하면 그 다음 객체가 삭제된 값으로 올라가기 때문에 전부 삭제가 불가하다.
//		for (int i = 0; i < list.size(); i++) {
//			list.remove(i);
//		}
		
		//객체를 전부 삭제 하기 위해선 이렇게 마지막부터 꺼꾸로 삭제해야한다 
		for (int i = list.size() - 1; i >= 0; i--) {
			list.remove(i);
		}
		
		System.out.println(list);
		
	}

}
