
public class CaptionTv extends Tv {

	// false꺼짐, true 켜짐
	boolean captionState = false;
	
	void tvInfo() {
		System.out.println("============");
		System.out.println("전원 : " + power);
		System.out.println("볼륨 : " + volume);
		System.out.println("캡션: " + captionState);
	}
	
}
