package deckOfCards;

public class Main {
public static void main(String args[]) {
	Deck deck = new Deck();
	
	deck.createDeck();	
	deck.printDeck();
	deck.shuffle();
	deck.deal(1);
}
}
