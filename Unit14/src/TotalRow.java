//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;

public class TotalRow
{
    public static List<Integer> getRowTotals( int[][] m )
    {
    	//add code here
    	
    	int total;
    	List<Integer> sum = new ArrayList();
    	
    	
    	for (int i = 0; i < m.length; i++)
    	{
    		total = 0;
    		
    		for(int j = 0; j < m[i].length; j++)
    		{
    			total += m[i][j];
    		}
    		sum.add(total);
    	}
    	
		return sum;
    }
}
