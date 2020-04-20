//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class TotalRowRunner
{
	public static void main( String args[] ) throws Exception
	{
		//add code here		
		int[][] l = {{1,2,3},{5,5,5,5}};
		int[][] m = {{1,2,3},{5},{1},{2,2}};
		int[][] o = {{1,2},{5,5},{5,5},{4,5,6,7},{123124,12312}};
		
		System.out.println(TotalRow.getRowTotals(l));
		System.out.println(TotalRow.getRowTotals(m));
		System.out.println(TotalRow.getRowTotals(o));
		
		
		

		
		

	}
}



