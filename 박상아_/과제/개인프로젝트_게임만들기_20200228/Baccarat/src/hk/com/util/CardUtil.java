package hk.com.util;

import hk.com.AdminDTO;

public class CardUtil {
	
	public int subStringNum(String card)	// 카드 숫자만 자르기
	{
		int result = 0;
		String temp = card.substring(1);
		
		if ( card.length() == 3 )
		{
			result = 0;
		}
		else if ( temp.equals("A") )
		{
			result = 1;
		}
		else if ( !temp.equals("10") &&!temp.equals("J") && !temp.equals("Q") && !temp.equals("K") )
		{
			result = Integer.parseInt(card.substring(1));
		}	
		else
		{
			result = 0;
		}

		return result;
	}	
}
