package hk.com.game;

import java.util.List;

import hk.com.AdminDTO;


public class GameMaster {
	
	protected List<String> fDeck;	// Card 52장 Deck
	
	protected static AdminDTO player;	// Player
	protected static AdminDTO banker;	// Banker	
	
	// 일반적인 고정값 변수들 모음
	protected final int startMoney = 100000;		// User 생성시 기본 보유금
	protected final int minBatting = 10000;		// 최저 배팅금액
	
}
