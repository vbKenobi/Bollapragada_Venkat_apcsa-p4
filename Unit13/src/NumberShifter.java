//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifter
{
	public static int[] makeLucky7Array( int size)
	{
		int[] unsorted = new int[size];
		for (int i = 0; i < size; i++)
		{
			unsorted[i] = (int)(Math.random()*10) + 1;
		}
		System.out.println(Arrays.toString(unsorted));
		return unsorted;
	}
	
	public static void shiftEm(int[] array)
	{
		//Determine number of 7s
		
		int num7 = 0;
		for (int i = 0; i < array.length; i++)
		{
			if (array[i] == 7)
			{
				num7++;
			}
		}
		
		//Create a new array without the 7s
		
		int[] not7 = new int[array.length - num7];
		int index = 0;
		for (int i = 0; i < array.length; i++)
		{
			if (array[i] != 7)
			{
				not7[index] = array[i];
				index++;
			}
		}
		
		
		//Create a new array with the sevens at the beginning
		
		int[] sorted = new int[array.length];
		
		for (int i = 0; i < num7; i++)
		{
			sorted[i] = 7;
		}
		
		index = 0;
		for (int i = num7; i < array.length; i++)
		{
			sorted[i] = not7[index];
			index++;
		}
		
		//Print out the sorted Array
		
		System.out.println(Arrays.toString(sorted));
	}
}