import java.util.Arrays;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Grid
{
   private String[][] grid;

   private String[] values;
   
   //load vals into the rows x cols grid randomly
	public Grid(int rows, int cols, String[] vals)
	{
		grid = new String[rows][cols];
		values = vals;
		
		for (int i = 0; i < rows; i++)
		{
			for (int j = 0; j < cols; j++)
			{
				grid[i][j] = vals[(int)(Math.random()*(vals.length))];
			}
		}
		
	}

	//find out which of the vals occurs the most
	public String findMax(String[] vals)
	{
		int maxIndex = 0;
		int maxValue = countVals(vals[0]);
		
		for (int i = 1; i < vals.length; i++)
		{
			int temp = countVals(vals[i]);
			
			if (maxValue < temp)
			{
				maxIndex = i;
				maxValue = temp;
			}
		}
		

		return vals[maxIndex]  + " occurs the most for a total of " + maxValue + " times.";
	}

	//returns a count of how many times val occurs in the matrix
	private int countVals( String val )
	{
		int count = 0; 

		for (int i = 0; i < grid.length; i++)
		{
			for (int j = 0; j < grid[i].length; j++)
			{
				if ((grid[i][j]).equals(val))
				{
					count++;
				}
			}
		}
		
		return count;
	}

	//display the grid
	public String toString()
	{
		String output="";
		for (int i = 0; i < grid.length; i++)
		{
			for (int j = 0; j < grid[i].length; j++)
			{
				output += grid[i][j] + " ";
			}
			output += "\n";
		}
		return output + "\n" + findMax(values);
	}
}