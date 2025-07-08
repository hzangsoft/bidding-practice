package deckOfCards;

public enum Suit {

	CLUBS("C"),
	DIAMONDS("D"),
	HEARTS("H"),
	SPADES("S");


	private String asciiString;

	private Suit(String asciiString) {
		this.asciiString = asciiString;
	}



	public String getAsciiString() {
		return asciiString;
	}
}
