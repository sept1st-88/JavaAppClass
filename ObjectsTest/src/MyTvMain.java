
public class MyTvMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyTv t;
		t = new MyTv();
		
		t.color = "black";
		t.power = true;
		t.channel = 10;
		t.volume = 30;
		t.size = 50;
		
		System.out.println(t.color);
		System.out.println(t.power);
		System.out.println(t.channel);
		System.out.println(t.volume);
		System.out.println(t.size + "인치");

	}

}
