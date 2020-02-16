//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemover
{
   private String sentence;
   private String lookFor;

	public LetterRemover()
	{
		setRemover("a", 'a');
	}

	//add in second constructor
	
	
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = Character.toString(rem);
	}

	public String removeLetters()
	{
		String cleaned=sentence.replaceAll(lookFor, "");
		return cleaned;
	}

	public String toString()
	{
		return sentence + " - letter to remove " + lookFor + "is now :: " + removeLetters();
	}
}