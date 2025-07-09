package hand;

import java.util.Arrays;
import java.util.Collections;

import deckOfCards.Card;
import deckOfCards.Rank;
import deckOfCards.Suit;

public class Hand{

	Card[] hand = new Card [13];

	int hcp;
	double ltcCount;

	public Hand(Card[] hand) {
		super();
		this.hand = hand;
		Arrays.sort(hand);
		Collections.reverse(Arrays.asList(hand));
		this.hcp = 0;
		for (Card card : this.hand) {
			this.hcp += card.getRank().getHcpValue();
		}
		
		this.ltcCount = 0.0;
		this.ltcCount += calculateLTC(Suit.SPADES);
		this.ltcCount += calculateLTC(Suit.HEARTS);
		this.ltcCount += calculateLTC(Suit.DIAMONDS);
		this.ltcCount += calculateLTC(Suit.CLUBS);
		
	}

	public int getHcp() {
		return hcp;
	}
	
	public double getLtcCount() {
		return ltcCount;
	}
	
	private float calculateLTC(Suit suit) throws ArrayIndexOutOfBoundsException {
		boolean containsAce = false;
		boolean containsKing = false;
		boolean containsQueen = false;
		boolean containsJack = false;
		boolean containsTen = false;
		int noOfCards = 0; 		
		for (Card card : hand) {
			if (card.equals(new Card(suit, Rank.ACE))) {
				containsAce = true;
			}
			if (card.equals(new Card(suit, Rank.KING))) {
				containsKing = true;
			}
			if (card.equals(new Card(suit, Rank.QUEEN))) {
				containsQueen = true;
			}
			if (card.equals(new Card(suit, Rank.JACK))) {
				containsJack = true;
			}
			if (card.equals(new Card(suit, Rank.TEN))) {
				containsTen = true;
			}
			if (card.getSuit() == suit) {
				noOfCards++;
			}
		}
		
		noOfCards = Math.min(noOfCards, 3);

		switch (noOfCards) {
		case 0 :
			// A void counts as 0 losers.
			return 0.0f;
		case 1 :
			// A singelton ace counts as 0 losers. ALl other singletons counts as one lose.  
			if (containsAce)
				return 0.0f;
			else
				return 1.0f;
		case 2 :
			// AK counts as 0 losers.
			if (containsAce && containsKing)
				return 0.0f;
			// AQ counts as 0.5 losers.
			else if(containsAce && containsQueen)
				return 0.5f;
			// Ace or king counts as 1 loser
			else if (containsAce || containsKing)
				return 1.0f;
			else
				return 2.0f;
		case 3 :
			// AKQ counts as 0 losers.
			if (containsAce && containsKing && containsQueen)
				return 0.0f;
			// AKJ counts as 0.5 losers.
			else if(containsAce && containsKing && containsJack)
				return 0.5f;
			// AK and a lower card counts as 1 loser
			else if (containsAce && containsKing)
				return 1.0f;
			// AQJ counts as 0.5 losers.
			else if(containsAce && containsQueen && containsJack)
				return 0.5f;
			// AQT counts as 0.5 losers.
			else if(containsAce && containsQueen && containsTen)
				return 1.0f;
			// AQx counts as 1.5 losers.
			else if(containsAce && containsQueen)
				return 1.5f;
			// AJT counts as 1 losers.
			else if(containsAce && containsJack && containsTen)
				return 1.0f;
			// AJx or worse counts as 2 losers.
			else if(containsAce)
				return 2.0f;
			// KQJ counts as 1 loser.
			else if(containsKing && containsQueen && containsJack)
				return 2.0f;
			// KQx counts as 1.5 loser.
			else if(containsKing && containsQueen)
				return 1.5f;
			// KJT counts as 1.5 loser.
			else if(containsKing && containsJack && containsTen)
				return 1.5f;
			// KJx or worse counts as 2 losers.
			else if(containsKing)
				return 2.0f;
			// QJx or worse counts as 2.5 losers.
			else if(containsQueen )
				return 2.5f;
			else
				return 3.0f;

		default:
			throw new ArrayIndexOutOfBoundsException("Illegal suit length in LTC calculation");
		}
	}

	public void sort() {
		
		
	}
	@Override
	public String toString() {
		return "Hand [hand=" + Arrays.toString(hand) + ", hcp=" + hcp + ", ltcCount=" + ltcCount + "]";
	}
	
	
	
}
