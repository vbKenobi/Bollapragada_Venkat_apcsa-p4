/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2
{
	/**
	 * Get a default greeting 	
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	
	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement)
	{
		String response = "";
		if (statement.trim().length() == 0)
		{
			response = "Say something, please";
		}
		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0)
		{
			response = "Tell me more about your family.";
		}
			
		else if (statement.indexOf("cat") >= 0 || statement.indexOf("dog") >= 0 || statement.indexOf("turtle") >= 0 || statement.indexOf("fish") >= 0)
		{
			response = "Tell me more about your pets";
		}
		
		else if (statement.indexOf("Mauro") >= 0)
		{
			response = "I know that teahcer (ONE OF THE BEST THAT EXISTS)!";
		}
		
		else if (statement.indexOf("Star Wars") >= 0 || statement.indexOf("Skywalker") >= 0 || statement.indexOf("Kylo") >= 0 || statement.indexOf("Rey") >= 0)
		{
			response = "I know, some of the characters in the franchise are very intersting.";
		}
		
		else if (statement.indexOf("sports") >= 0 || statement.indexOf("soccer") >= 0 || statement.indexOf("tennis") >= 0 || statement.indexOf("football") >= 0)
		{
			response = "Tell me more about your favorite sports.";
		}
		
		else if (statement.indexOf("videogames") >= 0 || statement.indexOf("racing") >= 0 || statement.indexOf("madden") >= 0 || statement.indexOf("fifa") >= 0 || statement.indexOf("fortnite") >= 0)
		{
			response = "Tell me more about your favorite videogames";
		}
		
		else if (statement.indexOf("no") >= 0)
		{
			response = "Why so negative?";
		}
		
		else
		{
			response = getRandomResponse();
		}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 7;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
		{
			response = "Interesting, tell me more.";
		}
		else if (whichResponse == 1)
		{
			response = "Hmmm.";
		}
		else if (whichResponse == 2)
		{
			response = "Do you really think so?";
		}
		else if (whichResponse == 3)
		{
			response = "You don't say.";
		}
		else if (whichResponse == 4)
		{
			response = "I need to think about that...";
		}
		else if (whichResponse == 5)
		{
			response = "I'm fascinated, continue.";
		}
		else if (whichResponse == 6)
		{
			response = "Wow, that is impressive";
		}

		return response;
	}
}
