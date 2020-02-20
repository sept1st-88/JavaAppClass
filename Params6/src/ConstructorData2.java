
public class ConstructorData2 {
	
	int value = 0;
	
	ConstructorData2(){		//입력값을 받아서 만들고 싶으면 이것을 사용.
							//값을 다 알고 있다면 아래것을 사용한다.
	}
		
	ConstructorData2(int num) {	//생선자를 만들고 매개변수를 잡아주면 
		value = num;			//앞으로는 매개변수 값을 입력해주지 않으면은 
	}							//생성되지 않는다. 절대로 변수 할당만 한다.(NO 출력)
	
}
