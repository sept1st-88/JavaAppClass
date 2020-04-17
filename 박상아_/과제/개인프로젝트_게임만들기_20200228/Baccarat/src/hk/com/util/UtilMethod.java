package hk.com.util;

import java.util.Scanner;

import hk.com.AdminDTO;

public class UtilMethod {

	public void sleep1s()
	{
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void sleep3s()
	{
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public int sumNum(AdminDTO tDto)	// 카드 두장 합(실제 연산)
	{
		int sum = 0;
		int one = 0;	
		int two = 0;
				
		String fc = tDto.getFirstCard();
		one = subStringNum(fc);
						
		String sc = tDto.getSecondCard();
		two = subStringNum(sc);
	
				
		sum = (one + two) % 10;
		
		return sum;
	}
	// 위랑 아래 고쳐야 함
	public int sumResult(AdminDTO tDto) // 카드 3장 합 
	{
		int sum = 0;
		int one = 0;
		int two = 0;
		int three = 0;
		
		String fc = tDto.getFirstCard();
		one = subStringNum(fc);
						
		String tc = tDto.getSecondCard();
		two = subStringNum(tc);
		
		String td = tDto.getThirdCard();
		three = subStringNum(td);
				
		sum = (one + two + three) % 10;
		
		return sum;
	}
	
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
		else if ( !temp.equals("J") && !temp.equals("Q") && !temp.equals("K") )
		{
			result = Integer.parseInt(card.substring(1));
		}	
		else
		{
			result = 0;
		}

		return result;
	}
	
	public String whoWinner(AdminDTO player, AdminDTO banker)
	{
		String winner = "";
		
		int p = 9 - player.getScore();
		int b = 9 - banker.getScore();
		
		if( p == b )
		{
			winner = "Tie";
		}
		else
		{
			winner = (p > b) ? "BANKER" : "PLAYER"; 
		}
		
		return winner;
	}	
	
	public String inputLoop()
	{
		String con = "";
		
		Scanner scan = new Scanner(System.in);
		
		while(true)
		{	
			System.out.println("한번 더? : y/n");
			try 
			{
				con = scan.next();
				if ( !(con.equalsIgnoreCase("y") || con.equalsIgnoreCase("N")))
				{
					System.out.println("y or n");
				}
				else
				{
					break;
				}
			} 
			catch (Exception e) 
			{
				System.out.println("y/n만 입력가능합니다.");
			}
			
			
		}
		return con;
	}
}
