//2016 AP Computer Science Principles Question 1 Part A FRQ

import java.util.ArrayList;

public class RandomStringChooser_2016
{
	private String[] wordArray;
	private ArrayList<String> copyList;


	
	public RandomStringChooser_2016(String[] userArray)
	{
		wordArray = userArray;
		copyList = new ArrayList<String>();
		
		for (int i = 0; i < wordArray.length; i++)
		{
			copyList.add(wordArray[i]);
		}
	}
	
	public String getNext()
	{
		String output;
		int index = (int)(Math.random()*copyList.size());
		
		if (copyList.size() == 0)
		{
			return "NONE";
		}
		else
		{
			output = copyList.get(index);
			copyList.remove(index);
			return output;	
		}
	}
}