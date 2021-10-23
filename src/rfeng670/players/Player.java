package rfeng670.players;

public interface Player
{
	/**
	 * @return String that is the name of the player
	 */
	String name();
	/**
	 * First move: true for cooperate, false for defect.
	 * @return a boolean representing the player's next move
	 */
	boolean firstMove();
	/**
	 * Makes a move: true for cooperate, false for defect.
	 * @return a boolean representing the player's next move
	 */
	boolean makeMove(boolean opponentLastMove);
}
