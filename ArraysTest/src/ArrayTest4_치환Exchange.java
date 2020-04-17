/*
*/
public class ArrayTest4_치환Exchange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int myNum = 10;
		int yourNum = 0;
		int tempNum = 0;

//		이렇게해서는 서로 교환이 안된다.
//		yourNum = myNum;
//		myNum = yourNum;
		
//		치환(exchange)를 이루기 위해서 임의의 저장값을 만들어서 한가지 값을 저장해 놓고, 임의로 저장한 값에 교환하고 싶은 값을 지정하고
		tempNum = myNum;
		myNum = yourNum;
		yourNum = tempNum;
		
		System.out.println("myNum : " + myNum);
		System.out.println("yourNum : " + yourNum);

	}

}
