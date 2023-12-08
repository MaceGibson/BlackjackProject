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

		d.dealInitialCards(p);
		d.dealInitialCards(d);

		System.out.println("Dealer's face-up card: " + d.getHand().getCards().get(1));
		System.out.println("Player's hand: " + p.getHand().getCards());

		p.playTurn(d.getDeck());
		d.playRound();
	}

}
