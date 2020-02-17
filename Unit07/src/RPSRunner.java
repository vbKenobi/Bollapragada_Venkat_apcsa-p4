//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		
		Scanner keyboard = new Scanner(System.in);
		RockPaperScissors game = new RockPaperScissors();
		String response = "";
		boolean cont = false;
		
		//while (cont = false)
		do{
			out.print("type in your prompt [R,P,S] :: ");
			String player = keyboard.nextLine();
			
			game.setPlayers(player);
			out.println(game);
			
			out.print("Continue playing? [y/n] :: ");
			String responce = keyboard.nextLine();
			
			if (responce.equals("n"))
			{
				cont = true;
			}
		}while (!cont);
			
		//}
		//add in a do while loop after you get the basics up and running
	
		

			
			//read in the player value
			

	}
}



