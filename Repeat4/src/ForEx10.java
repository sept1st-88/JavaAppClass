
public class ForEx10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		continue문 	//블록을 마주쳤다고 생각하면 된다. 멈추는 것이 아니라 위로 다시 올라간다. (특별한 경우 아닌 이상 사용하지 않는다)
//		Skip if condition is true.
		
		for (int i = 0; i <= 10; i++) {
			if(i % 3 == 0) {	//i가 3의 배수일 때 
				continue;		//continue로 코드를 시작으로 보낸다 (아래 출력문은 출력되지 않고 스킵한다)
			}
			System.out.println(i);
		}
		
//		조건문
//		삼항 vs switch vs if
		
//		삼항: 웬만해선 안 사용. 수행 속도는 가장 높다(속도가 중요하거나 특별한 상황에서만 사용).
//			 3가지 경우 (맞다, 틀렸다, 기본)이면은 쓸만하다.
//			  가독성이 낮다.
//		switch: 맵핑, 분기문 설정 (일치화 시키는 부분)
		
//		if: 가장 일반적으로 사용. 가독성이 좋고 쓰기 편리하다. if문으로 구현이 가능하다면 삼항과 switch로도 구현이 주로 가능하다.
//			(반대로 삼항/switch가 if문으로 구현이 안될수도 있다.)
		
		
//		반복문
//		for vs while vs do-while
			
//		for: 가장 쉽다, 가독성이 좋다, 수치, 범위 (정확한 범위랑 수치를 알 경우 사용)
//		while: 무한 루프, 미지의 수치 (몇번 실행할지 불분명할때)
//		do-while: 실험용 (연구소). 웹 쪽에선 볼 일이 없을 것.
		
	}

}
