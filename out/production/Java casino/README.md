# Java Casino

A little console-based casino game I built while learning Java! Features a classic game of Blackjack where you play against the dealer.

## What's in here?

- **Blackjack** - Try to get as close to 21 as possible without going bust
- **Higher/Lower** - A number guessing game (not wired up to the main menu yet)

## Tech stack

- Plain Java, no external dependencies
- Runs in the terminal

## How to run

From the project root:

```bash
javac -d . novi/blackjack/*.java novi/higherlower/*.java novi/Main.java
java novi.Main
```

## How to play

1. You get two cards, the dealer gets one
2. Type `hit` to get another card, or `stay` to keep your hand
3. Try to beat the dealer without going over 21!
