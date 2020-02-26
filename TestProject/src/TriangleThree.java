public class TriangleThree
{
	int len = 0;
	String alpha = "";
	
	public TriangleThree()
	{
		setTriangle(0,"");
	}
	public TriangleThree(int l, String s)
	{
		setTriangle(l,s);
	}
	public void setTriangle(int l, String s)
	{
		len = l;
		alpha = s;
	}
	public String getLetter()
	{
		return alpha;
	}
	public String toString()
	{
		String output = "";
		int templetter = 1;
		int tempspace = len-1;
		
		for (int i = 0; i < len; i++)
		{
			for (int j = 0; j < tempspace; j++)
			{
				output = output + " ";
			}
			
			for (int k = 0; k < templetter; k++)
			{
				output = output + getLetter();
			}
			output = output + "\n";
			templetter++;
			tempspace--;
		}
		
		
		return output;
	}
}