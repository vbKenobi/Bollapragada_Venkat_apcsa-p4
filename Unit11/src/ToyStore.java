//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore
{
	private ArrayList<Toy> toyList;

	public ToyStore()
	{
		toyList = new ArrayList<Toy>();
	}

	public void loadToys( String toys )
	{
		int space = 0;
		String copyToys = toys;
		String toyName = "";
		boolean newToy = true;
		
		while (copyToys.length() != 0)
		{
			newToy = true;
			
			space = copyToys.indexOf(" ");
			
			if (space == -1 && copyToys.length() >= 1)
			{
				toyName = copyToys.substring(0, copyToys.length());
				copyToys = "";
			}
			else
			{
			toyName = copyToys.substring(0, space);
			copyToys = copyToys.substring(space+1, copyToys.length());
			}
			
			for (int i = 0; i < toyList.size(); i++)
			{
				if (toyName.equals(toyList.get(i).getName()))
				{
					Toy temp = toyList.get(i);
					//System.out.println(temp);
					temp.setCount(temp.getCount()+1);
					toyList.set(i, temp);
					newToy = false;
				}
			}
			if (newToy)
			{	
				Toy temp = new Toy();
				temp.setName(toyName);
				temp.setCount(1);
				toyList.add(temp);
			}
		}
	}
  
  	public Toy getThatToy( String nm )
  	{
		for (int i = 0; i < toyList.size(); i++)
		{
			if (nm.equals(toyList.get(i).getName()))
			{
				return toyList.get(i);
			}
		}
  		
  		
  		return null;
  	}
  
  	public String getMostFrequentToy()
  	{
  		int max = toyList.get(0).getCount();
  		
  		int index = 0;
  		
  		for (int i = 1; i < toyList.size(); i++)
  		{
  			if (max < toyList.get(i).getCount())
  			{
  				max = toyList.get(i).getCount();
  				index = i;
  			}
  		}
  		return toyList.get(index).getName();
  	}  
  
  	public void sortToysByCount()
  	{

  		ArrayList<Toy> tempList = new ArrayList<Toy>();

  		while (toyList.size() > 0)
  		{
  	  		int max = toyList.get(0).getCount();
  	  		
  	  		int index = 0;
  	  		
  	  		for (int i = 1; i < toyList.size(); i++)
  	  		{
  	  			if (max < toyList.get(i).getCount())
  	  			{
  	  				max = toyList.get(i).getCount();
  	  				index = i;
  	  			}
  	  		}
  	  		
  	  		tempList.add(toyList.get(index));
  	  		toyList.remove(index);
  		}
  		
  		toyList = tempList;
  	}  
  	  
	public String toString()
	{
	   String output = "[";
	   
	   for (int i = 0; i < toyList.size(); i++)
	   {
		   if (i == toyList.size()-1)
		   {
			   output += toyList.get(i).toString() + "]";
		   }
		   else
		   {
			   output += toyList.get(i).toString() + ", ";
		   }
	   }
	   
	   return output;
	}
}