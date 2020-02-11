//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StringEquality
{
	private String wordOne, wordTwo, result;

	public StringEquality()
	{
		setWords("","");
	}

	public StringEquality(String one, String two)
	{
		setWords(one, two);
	}

	public void setWords(String one, String two)
	{
		wordOne = one;
		wordTwo = two;
	}

	public String checkEquality( )
	{
		if (wordOne.equals(wordTwo))
		{
			result = "";
			return result;
		}
		else
		{
			result = "not ";
			return result;
		}
	}

	public String toString()
	{
		return wordOne + " does " + result + "have the same letters as " + wordTwo + "\n";
	}
}