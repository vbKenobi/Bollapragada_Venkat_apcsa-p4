//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWord
{
	//instance variables and constructors could be present, but are not necessary
		
	public static void printTriangle(String word)
	{
		int index = 1;
		String temp = word.substring(0,1);

		for (int i = 0; i < word.length(); i++)
		{
			for (int j = 0; j < temp.length(); j++)
			{
				out.print(temp);
			}
			
			if (i != word.length()-1)
			{
				out.println("");
				temp = temp + word.charAt(index);
				index++;
			}
		}
		
		
	}
}