package deckOfCards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	public ArrayList<Card> cards = new ArrayList<Card>();

//constructor 
	public Deck() {
		this.cards= new ArrayList<Card>();//creates an empty deck of cards
	}

	// create Deck of cards
	public void createDeck() {
		cards = new ArrayList<Card>(52);
		int[] values = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
		String[] suits = { "Spade", "Heart", "Club", "Diamond" };
		for (int i = 0; i < suits.length; i++) {
			for (int j = 0; j < values.length; j++) {
				int value = j;
				String suit = suits[i];
				cards.add(new Card(value, suit));
			}
		}
		
	}

	// shuffle the deck of cards
	public void shuffle() {
		Collections.shuffle(cards);
	}

//deal n number of cards and cards being removed from the deck of cards
	public ArrayList<Card> dealCards(int n) {
		ArrayList<Card> dealtCards = new ArrayList<Card>(0);

		if (n > cards.size()) {
			n = cards.size();
		}
		for (int i = 0; i < n; i++) {
			dealtCards.add(cards.remove(0));
		}
		return sortDeck(dealtCards);
	}

	public List<Card> deal(int numCards) {
		List<Card> drawnCards = new ArrayList<Card>(numCards);
		for (int index = 0; index < numCards; index++) {
			Card deal = cards.get(cards.size()-1);//gets the last card
			drawnCards.add(deal);
			deal.toString(); //show the card
			cards.remove(cards.size()-1);
		}
		return drawnCards;
	}
	
//sort deck of cards
	public ArrayList<Card> sortDeck(ArrayList<Card> cards) {
		ArrayList<Card> clubs = new ArrayList<Card>();
		List<Card> spades = new ArrayList<Card>();
		List<Card> hearts = new ArrayList<Card>();
		List<Card> diamonds = new ArrayList<Card>();

		for (Card card : cards) {
			if (card.getSuit() == "Club") {
				clubs.add(card);
			}
			if (card.getSuit() == "Spades") {
				spades.add(card);
			}
			if (card.getSuit() == "Hearts") {
				hearts.add(card);
			}
			if (card.getSuit() == "Diamonds") {
				diamonds.add(card);
			}

		}

		ArrayList<Card> sortedCards = new ArrayList<Card>();
		sortedCards.addAll(clubs);
		sortedCards.addAll(spades);
		sortedCards.addAll(hearts);
		sortedCards.addAll(diamonds);
		return sortedCards;
	}
	
	public void printDeck() {
		System.out.println("Deck : " + cards.size());
		for(int i=0; i<cards.size(); i++) {
			System.out.println(cards.get(i).toString());
		}
	}

}
