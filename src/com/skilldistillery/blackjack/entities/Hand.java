package com.skilldistillery.blackjack.entities;

import java.util.List;

public abstract class Hand {
	protected List<Card> cards;
	
	public void addCard(Card card) {
		cards.add(card);
	}
	
	public void clear() {
		cards.clear();
	}

}
