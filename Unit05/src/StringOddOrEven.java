//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class StringOddOrEven
{
	private String word, result;

	public StringOddOrEven()
	{
		setString("");
	}

	public StringOddOrEven(String s)
	{
		setString(s);
	}

	public void setString(String s)
	{
		word = s;
	}

 	public String isEven()
 	{
		if(word.length() % 2 == 0)
		{
			result = "even";
		}
		else
		{
			result = "odd";
		}
 		return result;
	}

 	public String toString()
 	{
 		String output= word + " is :: " + result;
 		return output;
	}
}