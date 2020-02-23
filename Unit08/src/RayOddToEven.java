//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayOddToEven
{
	public static int go(int[] ray)
	{
		int distance = 0;
		boolean odd = false;
		
		for (int i = 0; i < ray.length; i++)
		{
			if (!odd)
			{
				if (ray[i] % 2 == 1)
				{
					odd = true;
				}
			}
			else if (odd)
			{
				distance ++;
				if (ray[i] % 2 == 0)
				{
					return distance;
				}
			}
			
		}
		return -1;
	}
}