package deckOfCards;

public class Card {

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
	public boolean equals(Object c) {
		if (this == c)
			return true;
		if (c == null)
			return false;
		if (getClass() != c.getClass())
			return false;
		Card other = (Card) c;
		return rank == other.rank && suit == other.suit;
	}
	
}
