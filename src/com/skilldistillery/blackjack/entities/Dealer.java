package com.skilldistillery.blackjack.entities;

public class Dealer extends Hand {

	private Deck deck;

	public Dealer() {
		deck = new Deck();
		shuffleDeck();
	}

	public void dealInitialCards(Player player) {
		player.addCard(deck.dealCard());
		addCard(deck.dealCard());
		player.addCard(deck.dealCard());
		addCard(deck.dealCard());
	}

	private void shuffleDeck() {
		deck.shuffle();
	}

	public void playRound(Player player) {
		while (getHandValue() < 17) {
			addCard(deck.dealCard());
		}
		System.out.println("Dealer's hand: " + getHandAsString());
		System.out.println("Dealer's hand value: " + getHandValue());
	}

	public Deck getDeck() {
		return deck;
	}
}
