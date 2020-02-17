//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class Triples
{
   private int number;

	public Triples()
	{
		setNum(0);
	}

	public Triples(int num)
	{
		setNum(num);

	}

	public void setNum(int num)
	{
		number = num;

	}
	
	public int greatestCommonFactor(int a, int b, int c)
	{
		int max = a;
		if (a < b && a < c)
		{
			
		}
		else if (b < a && b < c)
		{
			max = b;
		}
		else
		{
			max = c;
		}
		for (int i = 2; i <= max; i++)
		{
			if (a%i == 0 && b%i == 0 && c%i == 0)
			{
				return 0;
			}
		}
		return 1;
	}

	public String toString()
	{
		String output="";
		int pythagtotal = 0;
		for (int i = 1; i <= number; i++)
		{
			for (int j = i; j <= number; j++)
			{
				if (i%2 == 0 && j%2 == 0)
				{
					continue;
				}
				else
				{
					pythagtotal = i*i + j*j;
					for (int k = 1; k <= number; k++)
					{
						
						if (pythagtotal == k*k && k%2 == 1)
						{
							if (greatestCommonFactor(i, j, k) == 1)
							{
								output = output + i + " " + j + " " + k + "\n";	
							}
						}
					}
				}
			}
		}

		return output+"\n";
	}
}