package rfeng670.players;

import java.util.*;

public class Sanatan2 implements Player {
	
	private ArrayList<Boolean> moves;
	
	public Sanatan2()
	{
		moves = new ArrayList<Boolean>();
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Sanatan Strategy #2";
	}

	@Override
	public boolean firstMove() {
		// TODO Auto-generated method stub
		return true;
	}
	
	@Override
	public boolean makeMove(boolean opponentLastMove) {
		// TODO Auto-generated method stub
		moves.add(opponentLastMove);
		int cooperate = 0, defect = 0;
		for (Boolean move : moves)
		{
			if (move)
			{
				cooperate++;
			}
			else
			{
				defect++;
			}
		}
		if (moves.size() > 5 && defect == 0)
		{
			return false;
		}
		if (moves.size() > 5 && cooperate == 0)
		{
			return false;
		}
		return cooperate > defect;
	}

}
