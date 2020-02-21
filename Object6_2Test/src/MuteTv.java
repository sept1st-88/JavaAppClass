
public class MuteTv extends Tv {
	
	boolean mute = false;	//눌렀는지 여부
	int previousVolume = 0;	//이전 볼륨
	
	void mute() {
		if(mute == false) {
			previousVolume = volume;
			volume = 0;
			System.out.println();
			System.out.print("음소거가 on" + " / ");
			System.out.print("볼륨:" + volume);
			mute = true;
		} else {
			volume = previousVolume;
			System.out.println();
			System.out.print("음소거가 off" + " / ");
			System.out.print("볼륨: " + volume);
			mute = false;
		}
	}
	
}
