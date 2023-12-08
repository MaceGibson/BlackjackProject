package com.skilldistillery.blackjack.entities;

public class Player extends Hand {
	
	private Hand hand;
	
	public Player() {
		setHand(new BlackjackHand());
	}

	public Hand getHand() {
		return hand;
	}

	public void setHand(Hand hand) {
		this.hand = hand;
	}
}
