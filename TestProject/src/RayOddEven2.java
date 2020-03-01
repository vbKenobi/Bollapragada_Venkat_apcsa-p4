public class RayOddEven2
{
	private int[] ray;
	
	public RayOddEven2()
	{
		setArray(new int[] {0,0,0,0,0});
	}
	public RayOddEven2(int[] setX)
	{
		setArray(setX);
	}
	public void setArray (int[] setX)
	{
		ray = new int[setX.length];
		for (int i = 0; i < setX.length; i++)
		{
			ray[i] = setX[i];
		}
	} 
	

	public int rayTester()
	{
		return ray.length;
	}
	public String toString()
	{
		int indexodd = 0;
		int indexeven = 0;
		String output = "";
		boolean odd = false;
		
		for (int j = 0; j < ray.length; j++)
		{
			if (!odd)
			{
				if (ray[j] % 2 == 1)
				{
					indexodd = j;
					odd = true;
				}
			}
			else if (odd)
			{
				if (ray[j] % 2 == 0)
				{
					indexeven = j;
					break;
				}
			}
		}
		int diff = indexeven-indexodd;
		output = output + diff;
		
		return output;
	}
}