package rfeng670.players;

import java.util.*;

public class Sanatan1 implements Player {
	
	private ArrayList<Boolean> moves;
	
	public Sanatan1()
	{
		moves = new ArrayList<Boolean>();
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Sanatan Strategy #1";
	}

	@Override
	public boolean firstMove() {
		// TODO Auto-generated method stub
		return true;
	}
	
	private boolean avg()
	{
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
		return cooperate > defect;
	}

	@Override
	public boolean makeMove(boolean opponentLastMove) {
		// TODO Auto-generated method stub
		moves.add(opponentLastMove);
		return avg();
	}

}
