//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;
import java.io.*; 

public class WordSearch
{
    private String[][] m;
    private String letters;
    
    
    public WordSearch( int size, String str )
    {
    	int index = 0;
    	
    	m = new String[size][size];
    	for (int i = 0; i < size; i++)
    	{
    		for (int j = 0; j < size; j++)
    		{
    			m[i][j] = (str.substring(index, index+1));
    			index++;
    		}
    	}
    	
    	
    }

    public boolean isFound( String word )
    {
    	for (int i =0; i < m.length; i++)
    	{
    		for (int j = 0; j < m[i].length; j++)
    		{
    			if (checkRight(word, i, j) || checkLeft(word, i, j) || checkUp(word, i, j) || checkDown(word, i, j) || 
    					checkDiagUpRight(word, i, j) || checkDiagUpLeft(word, i, j) || checkDiagDownRight(word, i, j) || 
    					checkDiagDownLeft(word, i, j))
    			{
    				return true;
    			}
    		}
    	}
    	
    	return false;
    }

	public boolean checkRight(String w, int r, int c)
   {
		int index = 1;
		
		if (m[r].length - c - 1 < w.length())
		{
			return false;
		}
		
		for (int  i = 0; i< w.length(); i++)
		{
			if (w.substring(i, index).equals(m[r][c+i]))
			{
				index++;
			}
			else
			{
				return false;
			}
		}
		
		return true;

	}

	public boolean checkLeft(String w, int r, int c)
	{
		
		int index = 1;
		
		if (w.length() < m[r].length - c)
		{
			return false;
		}
		
		for (int  i = 0; i< w.length(); i++)
		{
			if (w.substring(i, index).equals(m[r][c-i]))
			{
				index++;
			}
			else
			{
				return false;
			}
		}
		
		return true;

	}

	public boolean checkUp(String w, int r, int c)
	{
		int index = 1;
		
		if (w.length() > r+1)
		{
			return false;
		}
		
		for (int  i = 0; i< w.length(); i++)
		{
			if (w.substring(i, index).equals(m[r-i][c]))
			{
				index++;
			}
			else
			{
				return false;
			}
		}
		
		return true;
	}

	public boolean checkDown(String w, int r, int c)
   {
		int index = 1;
		
		if (m.length - r -1 < w.length())
		{
			return false;
		}
		
		for (int  i = 0; i< w.length(); i++)
		{
			if (w.substring(i, index).equals(m[r+i][c]))
			{
				index++;
			}
			else
			{
				return false;
			}
		}
		
		return true;
	}

	public boolean checkDiagUpRight(String w, int r, int c)
	{
		int index = 1;
		
		//Checking Up
		if (w.length() > r+1)
		{
			return false;
		}
		
		//Checking Right
		if (m[r].length - c - 1 < w.length())
		{
			return false;
		}
		
		for (int  i = 0; i< w.length(); i++)
		{
			if (w.substring(i, index).equals(m[r-i][c+i]))
			{
				index++;
			}
			else
			{
				return false;
			}
		}
		
		return true;
	}

	public boolean checkDiagUpLeft(String w, int r, int c)
	{
		
		int index = 1;
		
		//Checking Up
		if (w.length() > r+1)
		{
			return false;
		}
		
		//Checking Left
		if (w.length() < m[r].length - c)
		{
			return false;
		}
		
		for (int  i = 0; i< w.length(); i++)
		{
			if (w.substring(i, index).equals(m[r-i][c-i]))
			{
				index++;
			}
			else
			{
				return false;
			}
		}
		
		return true;
		
	}

	public boolean checkDiagDownLeft(String w, int r, int c)
   {
		
		int index = 1;
		
		//Checking Down
		if (m.length - r -1 < w.length())
		{
			return false;
		}
		
		//Check Left
		if (w.length() < m[r].length - c)
		{
			return false;
		}
		
		for (int  i = 0; i< w.length(); i++)
		{
			if (w.substring(i, index).equals(m[r+i][c-i]))
			{
				index++;
			}
			else
			{
				return false;
			}
		}
		
		return true;
		
		
		
	}

	public boolean checkDiagDownRight(String w, int r, int c)
	{
		int index = 1;
		
		//Checking Down
		if (m.length - r -1 < w.length())
		{
			return false;
		}
		
		//Check Right
		if (m[r].length - c - 1 < w.length())
		{
			return false;
		}
		
		for (int  i = 0; i< w.length(); i++)
		{
			if (w.substring(i, index).equals(m[r+i][c+i]))
			{
				index++;
			}
			else
			{
				return false;
			}
		}
		
		return true;
	}

    public String toString()
    {
		String output="";
		for (int i = 0; i < m.length; i++)
		{
			for (int j = 0; j < m[i].length; j++)
			{
				output += m[i][j] + " ";
			}
			output += "\n";
		}
 		return output;
    }
}
