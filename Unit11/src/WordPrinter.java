//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class WordPrinter
{
	//instance variables and constructors could be present, but are not necessary
	private String output = "";
	
	
	public static void printWord(String word, int times)
	{
		for (int i = 0; i < times; i++)
		{
			out.println(word);
		}
	}
}