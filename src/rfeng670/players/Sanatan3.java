package rfeng670.players;

import java.util.*;

public class Sanatan3 implements Player {
	
	private ArrayList<Boolean> opponentMoves;
	private ArrayList<Boolean> selfMoves;
	private int copies;
	private int switches;
	private int betrayals;
	private boolean isCopycat;
	private boolean isAlt;
	private boolean isTrigger;
	
	public Sanatan3()
	{
		opponentMoves = new ArrayList<Boolean>();
		selfMoves = new ArrayList<Boolean>();
		copies++;
		isCopycat = false;
		isAlt = false;
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Sanatan Strategy #3 (Opponent Detector)";
	}

	@Override
	public boolean firstMove() {
		// TODO Auto-generated method stub
		selfMoves.add(true);
		return true;
	}
	
	private void analyze(boolean opponentLastMove)
	{
		opponentMoves.add(opponentLastMove);
		if (selfMoves.size() >= 2 && opponentLastMove == selfMoves.get(selfMoves.size() - 2))
		{
			copies++;
		}
		if (copies > 3)
		{
			isCopycat = true;
		}
		if (opponentMoves.size() >= 2 && opponentLastMove != opponentMoves.get(opponentMoves.size() - 2))
		{
			switches++;
		}
		if (switches >= opponentMoves.size() / 3)
		{
			isAlt = true;
		}
		if (!opponentLastMove)
		{
			betrayals++;
		}
		if (betrayals == 0)
		{
			isTrigger = true;
		}
		if (betrayals > 0)
		{
			isTrigger = false;
		}
	}

	@Override
	public boolean makeMove(boolean opponentLastMove) {
		// TODO Auto-generated method stub
		analyze(opponentLastMove);
		if (isTrigger)
		{
			selfMoves.add(true);
			return true;
		}
		if (isCopycat)
		{
			selfMoves.add(true);
			return false;
		}
		if (isAlt)
		{
			selfMoves.add(false);
			return false;
		}
		return true;
	}

}
