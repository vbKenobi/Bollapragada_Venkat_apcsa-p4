//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;
	private int playint;
	private int compInt;

	public RockPaperScissors()
	{
		setPlayers("");
	}

	public RockPaperScissors(String player)
	{
		setPlayers(player);
	}

	public void setPlayers(String player)
	{
		playChoice = player;
		compInt = 0;
	}

	public String determinecomp()
	{
		int randomnum = (int)(Math.random()*3);
		if (randomnum == 0)
		{
			compInt=0;
			compChoice = "R";
		}
		else if (randomnum == 1)
		{
			compInt=1;
			compChoice = "P";
		}
		else if (randomnum == 2)
		{
			compInt=2;
			compChoice = "S";
		}
		
		if (playChoice.compareTo("R") == 0)
		{
			playint = 0;
		}
		else if (playChoice.compareTo("P") == 0)
		{
			playint = 1;
		}
		else
		{
			playint = 2;
		}

		String winner="";
		if (compInt == playint)
		{
			winner ="Tie"; 
		}
		else if (compInt > playint && compInt - playint == 2 && playint - compInt == 2)
		{
			winner = "Computer";
		}
		else if (compInt < playint && compInt - playint == 2 && playint - compInt == 2)
		{
			winner = "Player";
		}
		else if (compInt - playint == 2)
		{
			winner = "Player";
		}
		else 
		{
			winner = "Computer";
		}
		
		return winner;
	}

	public String toString()
	{
		String output= determinecomp();
		return output + " wins!! The computer picked " + compChoice + " user picked " + playChoice;
	}
}