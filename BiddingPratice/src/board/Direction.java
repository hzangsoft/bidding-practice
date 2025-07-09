package board;

public enum Direction {

	NORTH("North", "N"),
	EAST("East", "E"),
	SOUTH("South","S"),
	WEST("West", "W");


	private String shortString;
	private String longString;
	
	private Direction(String shortString, String longString) {
		this.shortString = shortString;
		this.longString = longString;
	}

	public String getShortString() {
		return shortString;
	}

	public String getLongString() {
		return longString;
	}



	
}
