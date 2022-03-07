package rfeng670.players;

public class Sanatan4 implements Player {

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Sanatan Strategy #4 (Random)";
	}

	@Override
	public boolean firstMove() {
		// TODO Auto-generated method stub
		return Math.random() > 0.7;
	}

	@Override
	public boolean makeMove(boolean opponentLastMove) {
		// TODO Auto-generated method stub
		return Math.random() > 0.7;
	}

}
