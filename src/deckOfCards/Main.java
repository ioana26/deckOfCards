package deckOfCards;

public class Main {
public static void main(String args[]) {
	Deck deck = new Deck();
	System.out.print("Start\n");	
	deck.createDeck();	
	deck.printDeck();
	deck.shuffle();
	deck.printDeck();
//	deck.deal(1);
}
}
