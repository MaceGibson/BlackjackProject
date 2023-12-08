package com.skilldistillery.blackjack.app;

import com.skilldistillery.blackjack.entities.Dealer;
import com.skilldistillery.blackjack.entities.Player;

public class BlackjackApp {

	public static void main(String[] args) {
		BlackjackApp app = new BlackjackApp();
		app.run();

	}
	
	public void run() {
		Player p = new Player();
		Dealer d = new Dealer();
	}

}
