package com.skilldistillery.blackjack.entities;

import java.util.Scanner;

public class Player extends Hand {

	public Player() {
	}

	public void playTurn(Deck deck) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("Player's hand: " + this.getHandAsString());
			System.out.println("Current hand value: " + this.getHandValue());
			System.out.print("Do you want to (1) Hit or (2) Stand? ");
			int choice = scanner.nextInt();

			if (choice == 1) {
				Card dealtCard = deck.dealCard();
				this.addCard(dealtCard);

				if (isBusted()) {
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
