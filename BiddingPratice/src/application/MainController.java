package application;

import board.Board;
import deckOfCards.Deck;
import javafx.event.ActionEvent;

public class MainController {
	
	private final int maxBoardNo = 32;
	private int currentBoardNo = 1;

	public void generate(ActionEvent e) {


		Board board;

		for (int i = 1; i < maxBoardNo;  i++) {
			Deck deck = new Deck();
			deck.shuffle();
			board = new Board(i, deck);
			System.out.println(board.toString());
		}
	}
	
	/**
	 * Methods for menus and menu items
	 */
	
	/**
	 * Method for the 'New' button.
	 */
	public void newMenuItem() {
		System.out.println("'New' menu item selected.");
	}

	/**
	 * Method for the 'Open' button.
	 */
	public void openMenuItem() {
		System.out.println("'Open' menu item selected.");
	}

	/**
	 * Method for the 'Open Recent' button.
	 */
	public void openRecentMenuItem() {
		System.out.println("'Open recent' menu item selected.");
	}
	
	/**
	 * Method for the 'Save' button.
	 */
	public void saveMenuItem() {
		System.out.println("'Save' menu item selected.");
	}

	/**
	 * Method for the 'Save as' button.
	 */
	public void saveAsMenuItem() {
		System.out.println("'Save as' menu item selected.");
	}

	
	/**
	 * Method for the 'Close' button.
	 */
	public void closeMenuItem() {
		System.out.println("'Close' menu item selected.");
	}
	
	/**
	 * Method for the 'Preferences' button.
	 */
	public void preferencesMenuItem() {
		System.out.println("'Preferences' menu item selected.");
	}

	
	/**
	 * Methods for board navigation.
	 * 
	 */

	/**
	 * Method for the '<<' (First board) button.
	 */

	public void firstBoard() {
		currentBoardNo = 1;
		System.out.println("Current board: " + currentBoardNo);
	}

	/**
	 * Method for the '<' (Previous board) button.
	 */

	public void previousBoard() {
		if (currentBoardNo > 1) {
			currentBoardNo--;
		}
		System.out.println("Current board: " + currentBoardNo);
	}

	/**
	 * Method for the '<<' (Next board) button.
	 */

	public void nextBoard() {
		if (currentBoardNo < maxBoardNo) {
			currentBoardNo++;
		}
		System.out.println("Current board: " + currentBoardNo);
	}

	/**
	 * Method for the '>>' (Last board) button.
	 */

	public void lastBoard() {
		currentBoardNo = maxBoardNo;
		System.out.println("Current board: " + currentBoardNo);
	}


}
