//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFive
{
   private char letter;
   private int amount;

	public TriangleFive()
	{
		setLetter(' ');
		setAmount(0);
	}

	public TriangleFive(char c, int amt)
	{
		setLetter(c);
		setAmount(amt);
	}

	public void setLetter(char c)
	{
		letter = c;
	}

	public void setAmount(int amt)
	{
		amount = amt;
	}

	public String toString()
	{
	   	char temp = ' ';
		String line="";
		int length = amount;
		int row = amount;
		String output="";
		boolean overflow = false;
		
		for (int k  = 0; k < amount; k++)
		{
			for (int i = 0; i < row; i++)
			{
				
				if (overflow)
				{
					temp= (char)(temp + 1);
				}
	
				else
				{
					temp = (char)(letter + i);
				}
				
				if (temp > 90)
				{
					temp = (char)('A');
					overflow = true;
				}
				
				length = length - 1;
				for(int j = length; j >= 0; j--)
				{
					line = line + temp;
				}
				line = line + " ";
				
			}
			output = output + line + "\n";
			line = "";
			length = amount;
			row--;
			overflow = false;
			temp = letter;
		}
		
	
		return output;
	}
}