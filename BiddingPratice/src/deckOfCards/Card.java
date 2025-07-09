package deckOfCards;

import java.util.Comparator;
import java.util.Objects;

public class Card implements Comparable<Card>{

	private Suit suit;
	private Rank rank;
	public Card(Suit suit, Rank rank) {
		super();
		this.suit = suit;
		this.rank = rank;
	}
	public Suit getSuit() {
		return suit;
	}
	public void setSuit(Suit suit) {
		this.suit = suit;
	}
	public Rank getRank() {
		return rank;
	}
	public void setRank(Rank rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		return  suit.getAsciiString() + rank.getAsciiString();
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(rank, suit);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		return rank == other.rank && suit == other.suit;
	}
	
    public int compareTo(Card card) {
        if (this.suit == card.getSuit()) {
        	if (this.rank.ordinal() > card.getRank().ordinal())
        		return 1;
        	else if (this.rank.ordinal() < card.getRank().ordinal())
        		return -1;
        	else return 0;
        }
        if (this.suit.ordinal() > card.getSuit().ordinal())
        	return 1;
        else
        	return -1;
    }
}
