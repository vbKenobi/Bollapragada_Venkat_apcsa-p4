//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class DownRunner
{
	public static void main( String args[] )
	{				
		RayDown test = new RayDown();
		int[] testarray = {31,12,6,2,1};
		System.out.println(test.go(testarray));
		System.out.println(test.go({-99,1,2,3,4,5,6,7,8,9,10,12345}));
		
	}
}