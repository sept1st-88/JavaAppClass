package hk.com.game;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import hk.com.UserDTO;

public class GameMakeUser extends GameMaster{
	
	private Scanner scan;
	private String errMsg = "Error ! : ";
		
	public GameMakeUser() {
		scan = new Scanner(System.in);
	}
	
	public List<UserDTO> makeUser()
	{
		List<UserDTO> temp = new ArrayList<UserDTO>();	// 임시 객체
		int num = 0;	// 참가 유져 수		
		
		num = inputUserNum();
		
		int b = 1;
		while(true)	// 유져 생성, 이름 입력 While
		{			
			UserDTO uDto = new UserDTO();
			
			System.out.print(b + "번 유져 ");
			uDto.setName(inputUserName());	// dto 객체 이름이 같으니 set name
			uDto.setMoney(startMoney);
			
			System.out.println(b + "번 User : [name=" + uDto.getName() + ", money=" + uDto.getMoney() + "]");
			temp.add(uDto);
						
			if(b == num)	// Scanner 몇명 할건지?
			{
				break;
			}
			b++;
		}
		System.out.println("User Input END!!\n");
		
		return temp;
	}
	
	private int inputUserNum()
	{
		int num = 0;
		
		while(true)
		{
			System.out.print("참가인원 입력(1 ~ 8) : ");
			
			try {
				num = scan.nextInt();				
				if ( num < 1 || num >8 )
				{
					System.out.println(errMsg + "입력 범위 확인!!(1 ~ 8)");
				}
				else
				{
					System.out.println(num + "명 참가합니다!\n");
					break;
				}
			} catch (InputMismatchException e) {
				System.out.println("숫자 1~8만 입력가능합니다.");
				scan.nextLine();
			}	
			
		}		
		
		return num;
	}
	
	private String inputUserName()
	{
		String name = "";
		
		while(true)
		{
			System.out.print("이름 3글자 입력(홍길동) : ");
			name = scan.next();
			
			if( !(name.length() == 3) )
			{
				System.out.println(errMsg + "3글자 입력");
			}
			else
			{				
				break;
			}
		}
		
		return name;
	}
	
}
