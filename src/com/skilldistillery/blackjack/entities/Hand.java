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
	
	public String getHandAsString() {
		StringBuilder handString = new StringBuilder();
		for (Card card : cards) {
			handString.append(card).append(", ");
		}
		return handString.toString().trim();
	}

	public int getHandValue() {
		int value = 0;
		for (Card card : cards) {
			value += card.getValue();
		}
		return value;
	}
	
	public boolean isBusted() {
		return getHandValue() > 21;
	}

}
