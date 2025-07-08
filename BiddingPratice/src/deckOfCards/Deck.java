package deckOfCards;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {

	private ArrayList<Card> deck = new ArrayList<Card>();
	

	public Deck() {
		super();
		for (Suit suit : Suit.values()) {
			for (Rank rank : Rank.values()) {
				deck.add(new Card(suit, rank));

			}
		}
	}
	
	public void shuffle() {
        Collections.shuffle(deck);
	}

	@Override
	public String toString() {
		String result ="Deck: ";
		for (Card card : deck) {
			result += card.toString() + " ";
		}
		return result;
	}
	
	public Card dealTopOfDeck() {
		return deck.removeFirst();
	}
	
	
	
}
