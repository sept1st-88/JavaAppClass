package hk.com.util;

public class PrintCard {
	
	/**
	 * 작은 크기의 카드를 큰 카드로 변경해 준다.
	 * @param smallCard 작은 사이즈 카드
	 * @return 큰 사이즈 카드
	 */
	public String bigSizeCard(String smallCard) 
	{
		String shape = "";
		String num = "";

		shape = smallCard.substring(0, 1);
		num = smallCard.substring(1);

//		System.out.println("shape: " + shape);
//		System.out.println("num: " + num);

		String widthStr = "ㅡ";

//		System.out.println("width:" + widthStr);

		String heightStr = "ㅣ";

//		System.out.println("height" + heightStr);

		String bigCard = "";

		bigCard = cardWidth(widthStr) + "\n" + cardTop(num, heightStr) + "\n"
				+ cardSpace(heightStr) + "\n" + cardMiddle(shape, heightStr)
				+ "\n" + cardSpace(heightStr) + "\n"+ cardBottom(num, heightStr)
				+ "\n" + cardWidth(widthStr);

		return bigCard;
	}

	/**
	 * 카드의 넓이이지만 ㅡㅡㅡㅡ 이와 같은 카드 모양의 위와 아래를 만들어 준다
	 * @param widthStr ㅡ
	 * @return ㅡㅡㅡㅡㅡㅡㅡ
	 */
	public static String cardWidth(String widthStr) {
		String width = "";
		for (int i = 0; i <= 7; i++) {
			width = width + widthStr;
		}
		width = " " + width;
		return width;
	}

	/**
	 * 카드의 윗부분 바로 밑 숫자가 보이는 부분
	 * @param num 카드의 숫자
	 * @param heightStr ㅣ (카드 모양의 양끝)
	 * @return ㅣ7       ㅣ이런 식
	 */
	public static String cardTop(String num, String heightStr) {
		String str = "";
		int pos = 0;
		str = heightStr + num;
		pos = str.length();
//		System.out.println(pos);
		pos = 7 - pos;
		for (int i = 0; i < pos-1; i++) {
			str = str + "  ";
		}
		str = str + " ";
		str = str + heightStr;
		return str;
	}

	/**
	 * 숫자나 문양이 나타나지 않는 부분
	 * @param heightStr ㅣ
	 * @return ㅣ         ㅣ
	 */
	public static String cardSpace(String heightStr) {
		String str = "";

		str = heightStr;
		for (int i = 0; i <= 9; i++) {
			str = str + "  ";
		}
		str = str + heightStr;
		
		return str;
	}

	/**
	 * 가운데 부분에 문양이 보이는 부분
	 * @param shape 문양(♠)
	 * @param heightStr ㅣ
	 * @return
	 */
	public static String cardMiddle(String shape, String heightStr) {
		String str = "";
		int pos = 0;
		str = heightStr;
		pos = str.length();
//		System.out.println(pos);
		pos = 9 - pos;
		for (int i = 0; i < pos-1; i++) {
			if(!(i==5)){
				str = str + "  ";
			}else{
				str = str + shape;
			}
		}
		str = str + "  ";
		str = str + heightStr;
		return str;
	}
	
	/**
	 * 카드의 아랫부분 바로 위 숫자가 보이는 부분
	 * @param num 카드의 숫자
	 * @param heightStr ㅣ (카드 모양의 양끝)
	 * @return ㅣ       7ㅣ이런 식
	 */
	public static String cardBottom(String num, String heightStr) {
		String str = "";
		int pos = 0;
		str = heightStr;
		pos = str.length()+ num.length();
//		System.out.println(pos);
		pos = 10 - pos;
		for (int i = 0; i <= pos; i++) {
			str = str + "  ";
		}

		str = str + num + heightStr;
		return str;
	}
}
