//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

class TriangleWord
{
   private String word;

	public TriangleWord()
	{
		setWord("");
	}

	public TriangleWord(String w)
	{
		setWord(w);
	}

	public void setWord(String w)
	{
		word = w;
	}

	public String toString()
	{
		String output="";
		for (int i = 0; i < word.length(); i++)
		{
		
			for (int k = 0; k < word.length()/2 - i + word.length()-2; k++)
			{
				output = output + " ";
			}
			
			output = output + word.charAt(i);
						
			if (i != 0)
			{
				if (i == word.length()-1)
				{
					for (int l = word.length()-2; l >= 0; l--)
					{
						output = output + word.charAt(l);
					}
					for (int m = 1; m < word.length(); m++)
					{
						output = output + word.charAt(m);
					}
				}
				
				else
				{
					for (int j = 0; j < 2*i-1; j ++)
					{
						output = output + " ";
					}
					output = output + word.charAt(i);
				}
			}
			
			output = output + "\n";
		}
		return output+"\n";
	}
}