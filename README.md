# Blackjack Game

## Description
The Blackjack Game is a Java console application that allows users to play a simplified version of the popular card game Blackjack. The application consists of several classes, including `Player`, `Dealer`, `BlackjackHand`, `Hand`, `Deck`, `Card`, and the main application class `BlackjackApp`.

## Technologies Used
- Object-Oriented Programming
- Inheritance
- Composition
- User Input Handling
- Conditional Statements
- Loop Structures
- Enumerations

## Features
1. **Player and Dealer Classes:** The application features a `Player` class that represents the user and a `Dealer` class that manages the dealer's actions.

2. **Hand Class:** The `Hand` class and is used to represent a hand of cards in the game of Blackjack.  Ideally this would have been handled more explicitly by the `BlackjackHand` class but I only extended the `Hand` class in this project.

3. **Menu-Driven User Interface:** The program offers a simple menu allowing players to hit or stand during their turn and decides the dealer's actions automatically.

4. **Deck and Card Classes:** The application includes a `Deck` class that manages a standard deck of playing cards, and a `Card` class to represent individual cards with a rank and suit.

5. **Game Logic:** The application enforces the rules of Blackjack, including calculating hand values, determining winners, and handling player and dealer turns.

## Lessons Learned
1. **Inheritance and Composition:** Utilizing inheritance for common functionalities and composition for creating complex objects.

2. **Enumerations:** Using enumerations to represent ranks and suits of playing cards in a clean and organized manner.

3. **User Input Handling:** Implementing a simple yet effective mechanism to handle user input during the game.

4. **Game Logic Implementation:** Understanding and implementing the rules and logic of the Blackjack game.

## How to Run
1. Clone the repository: `git clone https://github.com/yourusername/BlackjackGame.git`
2. Navigate to the project directory: `cd BlackjackGame`
3. Compile the Java files: `javac BlackjackApp.java Player.java Dealer.java BlackjackHand.java Hand.java Deck.java Card.java Rank.java Suit.java`
4. Run the application: `java BlackjackApp`
