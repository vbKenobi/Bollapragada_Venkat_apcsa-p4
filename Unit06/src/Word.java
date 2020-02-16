//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class Word
{
	private String word;

	public Word()
	{
		setString("");
	}

	public Word(String s)
	{
		setString(s);
	}

	public void setString(String s)
	{
		word = s;
	}

	public char getFirstChar()
	{
		char firstchar = word.charAt(0);
		return firstchar;
	}

	public char getLastChar()
	{
		char lastchar = word.charAt(word.length()-1);
		return lastchar;
	}

	public String getBackWards()
	{
		String back="";
		for (int i = word.length()-1; i >= 0; i--)
		{
			back = back + word.charAt(i);
		}

		return back;
	}

 	public String toString()
 	{
 		return "First letter:: " + getFirstChar() + " Last Letter:: " + getLastChar() + " Word Backwards:: " + getBackWards();
	}
}