
public class MyTvMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyTv2 tv = new MyTv2();	//일반적인 표현 방식
		MyTv2 tv2 = new MyTv2();
		
		tv.channel = 7;
		tv.power = true;
		tv.color = "red";
		
		tv2.channel = tv.channel;
		tv2.power = tv.power;
		tv2.color = "black";
		
		System.out.println(tv.channel);
		System.out.println(tv.power);
		System.out.println(tv.color);
		System.out.println();
		System.out.println(tv2.channel);
		System.out.println(tv2.power);
		System.out.println(tv2.color);

	}

}
