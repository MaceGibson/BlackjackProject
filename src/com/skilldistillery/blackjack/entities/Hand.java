package com.skilldistillery.blackjack.entities;

import java.util.ArrayList;
import java.util.List;

public abstract class Hand {
	protected List<Card> cards;

	public Hand() {
		cards = new ArrayList<>();
	}

	public void addCard(Card card) {
		cards.add(card);
	}

	public void clear() {
		cards.clear();
	}

	public List<Card> getCards() {
		return cards;
	}

	public int getHandValue() {
		int value = 0;
		for (Card card : cards) {
			value += card.getValue();
		}
		return value;
	}

}
