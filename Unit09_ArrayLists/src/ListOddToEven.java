//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;
import java.util.List;

public class ListOddToEven
{
	public static int go( List<Integer> ray )
	{
		int finale = 0;
		int distance = 0;
		boolean odd = false;
		boolean one = false;
		
		for (int i = 0; i < ray.size(); i++)
		{
			if (!odd)
			{
				if (ray.get(i) % 2 == 1)
				{
					odd = true;
				}
			}
			
			else if (odd)
			{
				distance ++;
				if (ray.get(i) % 2 == 0)
				{
					finale = distance;
					one = true;
				}
			}
			
		}
		if (one)
		{
			return finale;
		}
		return -1;
	}
}