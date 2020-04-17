package hk.com.rule;

import hk.com.AdminDTO;
import hk.com.game.GameMaster;
import hk.com.util.CardUtil;

public class BaccaratRule extends GameMaster{
	
	//1.player가 Stands이냐?
	//2.banker가 Stands이냐?
	//3.player가 natural이냐?
	//4.banker가 natural이냐?
	//5.player가 세번째 카드를 받느냐?
	//6.banker가 세번째 카드를 받느냐?
	
	CardUtil cu = new CardUtil();
	
	//1.player가 Stands이냐?
	public boolean playerStands(AdminDTO pDto)
	{
		boolean isc = false;
		String pfirstCard = pDto.getFirstCard();
		String psecondCard = pDto.getSecondCard();
		//? 카드를 보내면 숫자로 돌려주는 메서드 부름
		//new로 숫자를 주는(동진이꺼) 클래스를 생성..
		int first = cu.subStringNum(pfirstCard);
		int second = cu.subStringNum(psecondCard);
		
		int sum = (first + second)%10;//두카드 합의 일의자리수만 뽑아냄
		
		// 왠지 0, 1, 2, 3, 4, 5이면 player만 카드를 한장 더 받고
		// 6, 7이면 바로 승부를 겨루고
		// 8, 9이면 플레이어나 뱅커 모두 카드를 더 이상 받지 않고 겨뤄야 함
		switch(sum)
		{
			case 6 : isc = true; 
			break;
			case 7 : isc = true; 
			break;	
		}		
				
		return isc;
		
	}
	
	//2.banker가 stands이냐?
	public boolean bankerStands(AdminDTO bDto)
	{
		boolean isc = false;
		
		String bfirstCard = bDto.getFirstCard();
		String bsecondCard = bDto.getSecondCard();
				
		//? 카드를 보내면 숫자로 돌려주는 메서드 부름
				//new로 숫자를 주는(동진이꺼) 클래스를 생성..
		int first = cu.subStringNum(bfirstCard);
		int second = cu.subStringNum(bsecondCard);
		int sum = (first + second)%10;
				
		// 7인 경우에 stand이다 즉 카드를 더 이상 받지 않고 승부를 겨룸
		// 잘못 짠 코드
		switch(sum)
		{
			case 6 : isc = true; 
			break;
			case 7 : isc = true; 
			break;		
		}		
		
		return isc;
	}
			
	//3.player가 natural이냐?
	public boolean playerNatural(AdminDTO pDto)
	{
		boolean isc = false;
	
		String pfirstCard = pDto.getFirstCard();
		String psecondCard = pDto.getSecondCard();
		
		//? 카드를 보내면 숫자로 돌려주는 메서드 부름
		//new로 숫자를 주는(동진이꺼) 클래스를 생성..
		int first = cu.subStringNum(pfirstCard);
		int second = cu.subStringNum(psecondCard);
		int sum = (first + second)%10;
		
		switch(sum)
		{
			case 8 : isc = true; 
			break;
			case 9 : isc = true; 
			break;
		}		
		
		return isc;
	}
	
	
	public boolean bankerNatural(AdminDTO bDto)
	{
		boolean isc = false;

		String bfirstCard = bDto.getFirstCard();
		String bsecondCard = bDto.getSecondCard();
				
		//? 카드를 보내면 숫자로 돌려주는 메서드 부름
		//new로 숫자를 주는(동진이꺼) 클래스를 생성..
		int first = cu.subStringNum(bfirstCard);
		int second = cu.subStringNum(bsecondCard);
		int sum = (first + second)%10;
		
		switch(sum)
		{
			case 8 : 
				isc = true; 
				break;
			case 9 : 
				isc = true; 
				break;
		}		
		
		return isc;
	}
	
	
	//5.player가 세번째 카드를 받느냐?
	public boolean playerthird(AdminDTO pDto)
	{
		boolean isc = false;
		
		String pfirstCard = pDto.getFirstCard();
		String psecondCard = pDto.getSecondCard();
				
		//? 카드를 보내면 숫자로 돌려주는 메서드 부름
		//new로 숫자를 주는(동진이꺼) 클래스를 생성..
		int first = cu.subStringNum(pfirstCard);
		int second = cu.subStringNum(psecondCard);
		int sum = (first + second)%10;
		
		// 뱅커가 stands 또는 natural 이면 player는 못받는다
		if(!bankerStands(pDto) || !bankerNatural(pDto))
		{
			if(sum<=5)
			{
				isc = true;
	   		}
		}
	
		return isc;
	}
	
	//6.banker가 세번째 카드를 받느냐?
	public boolean bankerthird(AdminDTO pDto, AdminDTO bDto)
	{
		boolean isc = false;
		
		String pfirstCard = pDto.getFirstCard();
		String psecondCard = pDto.getSecondCard();
		String bfirstCard = bDto.getFirstCard();
		String bsecondCard = bDto.getSecondCard();
		String pthirdCard = pDto.getThirdCard();
		
		
		//? 카드를 보내면 숫자로 돌려주는 메서드 부름
		//new로 숫자를 주는(동진이꺼) 클래스를 생성..
		int pfirst = cu.subStringNum(pfirstCard);
		int psecond = cu.subStringNum(psecondCard);
		int bfirst = cu.subStringNum(bfirstCard);
		int bsecond = cu.subStringNum(bsecondCard);
		int pthird = cu.subStringNum(pthirdCard);
				
		int bsum = (bfirst + bsecond)%10;
		
		if(!playerthird(pDto))
		{			
			if(bsum<=2)
			{
				isc = true;
			}
			
		}
		else 
		{
			switch(bsum)
			{
				case 0 : 
					isc = true; 
					break;
				case 1 : 
					isc = true; 
					break;
				case 2 : 
					isc = true; 
					break;
				case 3 : 
					int[] a = {0,1,2,3,4,5,6,7,8,9};
					searchThird(a, pthird);
					break;
				case 4 : 
					int[] a1= {2,3,4,5,6,7};
					if(searchThird(a1, pthird))
					{
						isc = true;
						break;
					}
				case 5 :  
					int[] a2= {4,5,6,7};
					if(searchThird(a2, pthird))
					{
						isc = true;
						break;
					}
				case 6 :  int[] a3= {6,7};
					if(searchThird(a3, pthird))
					{
						isc = true;
						break;
					}					
				break;
			}
		}		
		
		return isc;
	}
	
	//배열에서 player의 third가 있는지 검색
	public boolean searchThird(int arr[], int third)
	{
		boolean isc = false;
		
		for (int i = 0; i < arr.length; i++) 
		{
			if(third == arr[i])
			{
				isc = true;
				break;
			}			
		}
		
		return isc;
	}
	
	private void playerRule()
	{
		String rule = "";
		
		if ( playerStands(player) ) 
		{
			rule = "STAND";
		}
		else if ( playerNatural(player) )
		{
			rule = "NATURAL";
		}
		else
		{
			rule = "NORMAL";
		}		
		
		player.setRule(rule);		
	}
	
	private void bankerRule()
	{
		String rule = "";
		
		if ( bankerStands(banker) ) 
		{
			rule = "STAND";
		}
		else if ( bankerNatural(banker) )
		{
			rule = "NATURAL";
		}
		else // 3인 경우, 4인 경우, 5인 경우, 6인 경우를 구해야 함?
		{
			rule = "NORMAL";
		}		
		
		banker.setRule(rule);	
	}
	
	public void setRule()
	{
		playerRule();
		bankerRule();
	}
		
}

		
		

