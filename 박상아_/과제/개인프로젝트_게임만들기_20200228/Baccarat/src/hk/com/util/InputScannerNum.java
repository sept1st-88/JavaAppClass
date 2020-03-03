package hk.com.util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputScannerNum {

	/**
	 * 최소 베팅 금액 만원, 천 자리 이하 단위는 입력 금지, 글자 사용 제한
	 * BattingMoneyMinLimit(금액)를 사용함
	 * @return 만원 이상이며 천 단위는 존재하는 않는 금액
	 */
	public int BattingMoneyInput() {
		int battingMoney = 0;
		System.out.println("베팅하실 금액을 입력해주세요.");
		System.out.println("만 단위 이상, 천 단위 이하는 입력 금지");

		while (true) {
			try {
				Scanner sc = new Scanner(System.in);
				battingMoney = sc.nextInt();
				if (BattingMoneyMinLimit(battingMoney)) {
					break;
				}
				System.out.println("천 단위 이하의 금액이 존재합니다.");
				System.out.println("다시 입력해주세요.");

			} catch (InputMismatchException e) {
				// TODO Auto-generated catch block
				System.out.println("숫자만 입력할 수 있습니다.");
				System.out.println("다시 입력해주세요.");
			}
		}

		return battingMoney;
	}

	/**
	 * 베팅금액에 천 단위 이하의 숫자가 존재하는 판단
	 * @param battingMoney
	 * @return 천 단위 숫자가 없다면 true
	 */
	public boolean BattingMoneyMinLimit(int battingMoney) {
		boolean isc = false;

		if (battingMoney % 10000 == 0) {
			isc = true;
		}

		return isc;
	}

}
