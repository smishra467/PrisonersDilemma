package rfeng670.players;

public class MyPlayer implements Player {

	@Override
	public String name() {
		
		return "Me";
	}

	@Override
	public boolean firstMove() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean makeMove(boolean opponentLastMove) {
		//TitForTat strategy
		return opponentLastMove;
	}

}
