package application;

import board.Board;
import deckOfCards.Deck;
import javafx.event.ActionEvent;

public class MainController {

	public void generate(ActionEvent e) {


		Board board;

		for (int i = 1; i < 33;  i++) {
			Deck deck = new Deck();
			deck.shuffle();
			board = new Board(i, deck);
			System.out.println(board.toString());
		}
	}

}
