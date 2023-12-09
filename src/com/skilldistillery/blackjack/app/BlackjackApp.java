package com.skilldistillery.blackjack.app;

import com.skilldistillery.blackjack.entities.*;

import java.util.Scanner;

public class BlackjackApp {

	public static void main(String[] args) {
		BlackjackApp app = new BlackjackApp();
		app.run();
	}

	public void run() {
		Scanner scanner = new Scanner(System.in);

		boolean continuePlaying = true;

		while (continuePlaying) {
			Player player = new Player();
			Dealer dealer = new Dealer();

			dealer.dealInitialCards(player);

			if (player.getHandValue() == 21 && player.getCards().size() == 2) {
				System.out.println("Blackjack!! Player wins!");
				continuePlaying = askToPlayAgain(scanner);
				continue;
			}
			if (dealer.getHandValue() == 21 && dealer.getCards().size() == 2) {
				System.out.println("Blackjack!! Dealer wins!");
				continuePlaying = askToPlayAgain(scanner);
				continue;
			}

			System.out.println("Dealer's face-up card: " + dealer.getCards().get(1));

			player.playTurn(dealer.getDeck());
			dealer.playRound(player);

			determineWinner(player, dealer);

			continuePlaying = askToPlayAgain(scanner);
		}
		System.out.println("Thanks for playing! Goodbye!");
		scanner.close();
	}

	private boolean askToPlayAgain(Scanner scanner) {
		System.out.print("Do you want to play again? (y/n): ");
		String playAgainChoice = scanner.next().toLowerCase();
		return playAgainChoice.equals("y");
	}

	private void determineWinner(Player player, Dealer dealer) {
		if (player.isBusted()) {
			System.out.println("Player busts! Dealer wins!");
		} else if (dealer.isBusted()) {
			System.out.println("Dealer busts! Player wins!");
		} else if (player.getHandValue() == 21 && player.getCards().size() == 2) {
			System.out.println("Blackjack!! Player wins!");
		} else if (dealer.getHandValue() == 21 && dealer.getCards().size() == 2) {
			System.out.println("Blackjack!! Dealer wins!");
		} else if (player.getHandValue() > dealer.getHandValue()) {
			System.out.println("Player wins!");
		} else if (player.getHandValue() < dealer.getHandValue()) {
			System.out.println("Dealer wins!");
		} else {
			System.out.println("It's a tie!");
		}
	}

}