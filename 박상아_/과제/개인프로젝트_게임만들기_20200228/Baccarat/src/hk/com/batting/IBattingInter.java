package hk.com.batting;

import java.util.List;

import hk.com.AdminDTO;
import hk.com.UserDTO;

public interface IBattingInter {
	
	/**
	 * @param 참가자
	 * 참가자가 이겼을 때 받는 돈
	 */
	public void userWinWithdraw(List<UserDTO> uDto);
	/**
	 * @param 참가자
	 * 참가자가 졌을 때 잃는 돈
	 */
	public void userLoseWithdraw(List<UserDTO> uDto);
	/**
	 * 
	 * @return 베팅금액의 최소 단위 1만원 이상인가, 아닌가
	 */
	public boolean userBattingMoneyCheck(UserDTO uDto);
	/**
	 * 
	 * @param uDto
	 * @return 참가자의 돈이 최소 만원 이상이면 true
	 */
	public boolean userMoneyCheck(UserDTO uDto);
	
	/**
	 * 운영자의 자금이 충분한가 확인
	 * @param 운영자 객체, 보상 받을 금액
	 * @return 자금이 충분한가, 아닌가
	 */
	public boolean adminMoneyCheck(AdminDTO aDto);
	/**
	 * 게임 결과 후 남은 돈 회수
	 */
	public void adminMoneyGet(AdminDTO aDto);
	/**
	 * 우승자에게 보상 제공 이후 자금 차액
	 */
	public void adminMoneyOut(AdminDTO aDto);
	
	/**
	 *  운영자(Player, Banker)의 베팅금액 초기화
	 */
	public void adminBattingMoneyInit(AdminDTO aDto);

	/**
	 * 운영자(Player, Banker)의 베팅금 셋팅
	 * @param aDto Player or Banker
	 * @param uDto User들 -> 참가자들의 각 진영 베팅금
	 */
	public void adminBattingMoneySet(AdminDTO aDto, List<UserDTO> uDto);
	
}
