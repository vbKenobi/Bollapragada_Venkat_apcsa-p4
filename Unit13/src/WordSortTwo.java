//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class WordSortTwo
{
	private String[] wordRay;

	public WordSortTwo(String sentence)
	{
		String output = "";
		wordRay = sentence.split(" ");
		sort();

	}

	public void sort()
	{
		Arrays.sort(wordRay);
	}

	public String toString()
	{
		
		String output= "";
		for (int i =0; i < wordRay.length; i++)
		{
			output = output + wordRay[i] + "\n";
		}
		
		return output + "\n\n";
	}
}