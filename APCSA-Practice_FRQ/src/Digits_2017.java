import java.util.ArrayList;

public class Digits_2017
{
	private ArrayList<Integer> digitList;
	
	public Digits_2017(int num)
	{
		digitList = new ArrayList<Integer>();
		
		if (num == 0)
		{
			digitList.add(0);
		}
		else
		{
			while (num != 0)
			{
				digitList.add(0, num%10);
				num = num/10;
			}
		}
		
	}
	
	public boolean isStrictlyIncreasing()
	{
		for (int i = 0; i < digitList.size() - 1; i++)
		{
			if (digitList.get(i+1) <= digitList.get(i))
			{
				return false;
			}
		}
		
		
		return true;
	}
	
	
}