package hk.com.batting;

import java.util.Iterator;
import java.util.List;

import hk.com.AdminDTO;
import hk.com.UserDTO;

public class TieBattingCalculate extends BattingAbst{

	/**
	 * @param 참가자
	 * 참가자가 타이 진영을 선택해서 이겼을 때 받는 돈
	 */
	@Override
	public void userWinWithdraw(List<UserDTO> uDto) {
		// TODO Auto-generated method stub
		Iterator<UserDTO> it = uDto.iterator();
		UserDTO user = null;
		int battingMoney = 0;
		int money = 0;
		
		while(it.hasNext()){
			user = it.next();
			
			battingMoney = user.getBattingMoney() * 8;

			money = user.getMoney() + battingMoney;		
			user.setMoney(money);
		}
	}

	/**
	 * 운영자의 자금이 충분한가 확인
	 * @param 운영자(승리한 참가자에게 보상을 줄 금액)
	 * @return 자금이 충분히 있는가 없는가 
	 */
	@Override
	public boolean adminMoneyCheck(AdminDTO tDto) {
		// TODO Auto-generated method stub
		boolean isc = false;
		int battingMoney = 0;
		
		battingMoney = tDto.getBattingMoney() * 8;
		
		if(AdminDTO.getMoney() > battingMoney){
			isc = true;
		}
		
		return isc;
		
	}

	/**
	 * 운영자: 우승자에게 보상 제공 이후 자금 차액
	 * (뱅커가 우승시 8배의 금액을 보상해 주어야 한다)
	 */
	@Override
	public void adminMoneyOut(AdminDTO tDto) {
		// TODO Auto-generated method stub
		int money = AdminDTO.getMoney() - (tDto.getBattingMoney()*8);
		AdminDTO.setMoney(money);
	}

}
