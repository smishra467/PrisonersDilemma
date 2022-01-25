package rfeng670.simulation;
import java.text.DecimalFormat;

import rfeng670.players.*;

public class Tournament
{
	public static void main(String[] args)
	{
		Player[] players = new Player[]
				{
						new Joss(),
						new Pavlov(),
						new TitForTat(),
						new TitForTwoTats(),
						new GrimTrigger(),
						new AdaptiveTitForTat(),
						new AdaptivePavlov(),
						new Defect(),
						new Cooperate(),
						new Alternate(),
						new Desperate(),
						new Hopeless(),
						new GrimTriggerButSlightlyBetter(),
						new Sanatan1(),
						new Sanatan2()
				};
		double[] scores = new double[players.length];
		for(int i = 0; i < players.length; i++)
		{
			for(int j = i+1; j < players.length; j++)
			{
				double[] results = Fight.fight(players[i], players[j], true); //true for verbose fighting
				scores[i]+=results[0];
				scores[j]+=results[1];
			}
		}

		DecimalFormat df = new DecimalFormat("0.000");
		for(int i = 0; i < players.length; i++)
		{
			System.out.println(players[i].name() + ": " + df.format(scores[i]));
		}
	}
}
