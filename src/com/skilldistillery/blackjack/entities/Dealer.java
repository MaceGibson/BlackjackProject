package com.skilldistillery.blackjack.entities;

public class Dealer extends Player {
	
	private Deck deck;
	
	public Dealer() {
		deck = new Deck();
		shuffleDeck();
		setHand(new BlackjackHand());
	}
	
	public void dealInitialCards(Player player) {
		player.getHand().addCard(deck.dealCard());
		player.getHand().addCard(deck.dealCard());
	}
	
	private void shuffleDeck() {
		deck.shuffle();
	}
}
