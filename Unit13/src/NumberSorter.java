//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays; 
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSorter
{
	//instance variables and other methods not shown

	
	private static int getNumDigits(int number)
	{
		
		int count = 0;
		int temp = number;
	
		while (temp > 0)
		{
			temp = (temp - temp%(10));
			temp = temp/10;
			count++;
		}

		return count;
	}

	public static int[] getSortedDigitArray(int number)
	{
		int[] sorted = new int[getNumDigits(number)];
		int temp = number;
		int index = 0;
		
		while (temp > 0)
		{
			sorted[index] = temp%10;
			temp = (temp - temp%(10));
			temp = temp/10;
			index++;
		}
		
		Arrays.sort(sorted);
		
		return sorted;
	}
}