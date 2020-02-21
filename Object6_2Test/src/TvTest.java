
/**
 * 
 * @author TJ
 * 	Tv는 볼륨이 있다
 * 	Tv는 볼륨을 1올리고 1내리는 기능이 있다
 * 	음소거 Tv를 만든다
 * 	음소거가 있다
 * 	음소거 버튼을 누르면 은소거가 된다
 * 	음소거가 된 상태에서 다시 음소거 버튼을 누르면 이전의 볼륨 상태로 돌아간다
 *
 */
public class TvTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 캡션 티비
		 */
		CaptionTv captionTv = new CaptionTv();
		
		captionTv.channel = 10;
		captionTv.channelUp();
		
		System.out.println("채널: " + captionTv.channel);
		
//		captionTv.displayCaption("Hello, Java");
		
		captionTv.caption = true;
		
		captionTv.displayCaption("Hello, Java");
		
		captionTv.volume = 30;
		captionTv.volumeDown();
		
		/*
		 * 음소거 티비
		 */
		MuteTv muteTv = new MuteTv();
		
		muteTv.volume = 20;
		muteTv.volumeUp();
		
		System.out.println("볼륨: " + muteTv.volume);
		
		muteTv.mute();
		muteTv.mute();
		muteTv.mute();
		muteTv.mute();

	}

}
