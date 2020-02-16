//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Perfect
{
   private int number;
   private int count;
   

   public Perfect()
   {
	   setInt(0);
   }
   
   public Perfect(int x)
   {
	  setInt(x); 
   }
   public void setInt(int x)
   {
	   number = x;
	   count = 0;
   }
   
	public boolean isPerfect()
	{
		for (int i = 1; i < number; i ++)
		{
			if (number % i == 0)
			{
				count = count + i;	
			}
				
		}
		
		if (count == number)
		{
			return true;
		}
		else 
		{
			return false;
		}

	}

	public String toString()
	{
		return number + " is perfect " + isPerfect();
	}
	
}