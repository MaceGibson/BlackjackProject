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

	public void playRound() {
		while (getHand().getHandValue() < 17) {
			getHand().addCard(deck.dealCard());
		}
		System.out.println("Dealer's hand: " + getHand().getCards());
		System.out.println("Dealer's hand value: " + getHand().getHandValue());
	}

	public Deck getDeck() {
		return deck;
	}
}
