//2016 AP Computer Science Principles Question 1 Part B FRQ


import java.util.ArrayList;

public class RandomLetterChooser_2016 extends RandomStringChooser_2016
{	
	public RandomLetterChooser_2016(String str)
	{
		
		super(getSingleLetters(str)); 

	}
	
	public static String[] getSingleLetters(String str)
	{
		String[] letters;
		letters = new String[str.length()];
		
		for (int i = 0; i < str.length(); i++)
		{
			letters[i] = str.substring(i, i+1);
		}
		return letters;
	}
}