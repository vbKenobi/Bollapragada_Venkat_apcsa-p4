//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class RecursionFunOne
{
	public static int countOddDigits(int num)
	{

		int count = 0;
		
		if ((num != 0) && (num % 2 == 0))
		{	
			count++;
		}	
		
		if (num >= 10)
		{
			count += countOddDigits(num/10);
			return count;
		}
		else
		{
			return count;

		}
	}
}