
public class CaptionTv extends Tv{

	CaptionTv(String name, Boolean power, int channel, int volume) {
		super(name, power, channel, volume);
	}

	boolean caption = false;  // 캡션 상태
	
	void displayCaption(String text) {
		if(caption == true) {  // 캡션 상태가 true(켠)일 경우 text를 보여준다 
			System.out.println(text);
		}
	}
	
	//나의 멤버변수 모두 출력
	void tvInfo() {
		System.out.println("현재 티비 타입 : " + name);
		System.out.println("전원: " + power);
		System.out.println("채널: " + channel);
		System.out.println("볼륨: " + volume);
		System.out.println("캡션: " + caption);
		System.out.println();
	}
	
}
