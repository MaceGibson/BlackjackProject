package com.skilldistillery.blackjack.entities;

import java.util.Scanner;

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

	public void playTurn(Deck deck) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("Player's hand: " + getHand().getCards());
			System.out.println("Current hand value: " + getHand().getHandValue());
			System.out.print("Do you want to (1) Hit or (2) Stand? ");
			int choice = scanner.nextInt();

			if (choice == 1) {
				getHand().addCard(deck.dealCard());
				if (getHand().getHandValue() > 21) {
					System.out.println("Bust! Your hand value is over 21.");
					break;
				}
			} else if (choice == 2) {
				System.out.println("Player stands.");
				break;
			} else {
				System.out.println("Invalid choice. Please enter 1 to Hit or 2 to Stand.");
			}
		}
	}
}
