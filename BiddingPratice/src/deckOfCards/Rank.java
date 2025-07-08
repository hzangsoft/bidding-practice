package deckOfCards;

public enum Rank {

		TWO(0, "2"),
		THREE(0, "3"),
		FOUR(0, "4"),
		FIVE(0, "5"),
		SIX(0, "6"),
		SEVEN(0, "7"),
		EIGHT(0, "8"),
		NINE(0, "9"),
		TEN(0, "T"),
		JACK(1, "J"),
		QUEEN(2, "Q"),
		KING(3, "K"),
		ACE(4, "A");
	

	private int hcpValue;
	private String asciiString;
	
	private Rank(int hcpValue, String asciiString) {
		this.hcpValue = hcpValue;
		this.asciiString = asciiString;
	}

	public int getHcpValue() {
		return hcpValue;
	}

	public String getAsciiString() {
		return asciiString;
	}
}
