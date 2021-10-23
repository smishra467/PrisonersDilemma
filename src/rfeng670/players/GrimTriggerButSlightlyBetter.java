package rfeng670.players;

import rfeng670.simulation.Fight;
public class GrimTriggerButSlightlyBetter implements Player
{
	private boolean betrayed;
	private int numMoves;
	public GrimTriggerButSlightlyBetter()
	{
		numMoves = 0;
		betrayed = false;
	}

	public String name()
	{
		return "GrimTriggerButSlightlyBetter";
	}

	public boolean firstMove()
	{
		numMoves = 1;
		betrayed = false;
		return true;
	}

	public boolean makeMove(boolean opponentLastMove)
	{
		numMoves++;
		if(!opponentLastMove || numMoves == Fight.N) betrayed = true;
		return !betrayed;
	}
}

