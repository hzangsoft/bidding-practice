package board;



import deckOfCards.Card;
import deckOfCards.Deck;
import hand.Hand;

public class Board {

	private int boardNumber;
	private Hand north;
	private Hand east;
	private Hand south;
	private Hand west;

	private static final String[] dealers = new String[] {"W", "N", "E", "S"};

	private static final String[] vulnerabilities = new String[] {
			"EW", "None", "NS", "EW", "All",
			"NS", "EW", "All", "None",
			"EW", "All", "None", "NS", 
			"All", "None", "NS"};

	public Board(int boardNumber, Deck deck) {
		super();
		this.boardNumber = boardNumber;
		north = new Hand(deck.dealHand());
		east = new Hand(deck.dealHand());
		south = new Hand(deck.dealHand());
		west = new Hand(deck.dealHand());
	}

	public String getDealer() {
		return dealers[boardNumber % 4];
	}

	public String getVulnerability() {
		return vulnerabilities[(boardNumber % 16)];
	}

	@Override
	public String toString() {
		String result ="";
		result += "Board:" + this.boardNumber + "\n";
		result += "Dealer:" + getDealer() + "\n";
		result += "Vulnerability:" + getVulnerability() + "\n";
		result += north.toString() + "\n";
		result += east.toString() + "\n";
		result += south.toString() + "\n";
		result += west.toString() + "\n";
		return result;
	}




}
