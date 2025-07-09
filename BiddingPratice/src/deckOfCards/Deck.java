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
	
	public Card dealTopOfDeck() throws IndexOutOfBoundsException {
		if (this.deck.size() == 0)
			throw new IndexOutOfBoundsException("Trying to deal a card from an empty deck.");
		else
			return this.deck.removeFirst();
	}
	
	public Card[] dealHand() throws IndexOutOfBoundsException {
		Card[] newHand = new Card[13];
		if (this.deck.size() % 13 != 0) {
			throw new IndexOutOfBoundsException("THe deck has an invalid number of cards (should be a multiple of 13.");
		} else {
			for (int i = 0; i < 13; i++) {
				newHand[i] = dealTopOfDeck();
			}
			return newHand;
		}		
	}

}
