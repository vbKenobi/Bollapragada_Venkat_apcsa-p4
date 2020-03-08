//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;

public class Doggies
{
	private Dog[] pups;

	public Doggies(int size)
	{
		//point pups at a new arry of Dog
		
		pups = new Dog[size];
		
		
	}
	
	public void set(int spot, int age, String name)
	{
		if (spot >= 0 && spot < pups.length)
		{
			Dog temp = new Dog(age, name);
			pups[spot] = temp;
		}
		
		
		//put a new Dog in the array at spot 
		//make sure spot is in bounds		
	}

	public String getNameOfOldest()
	{
		int oldest = pups[0].getAge();
		int index = 0;
		for (int i = 1; i < pups.length; i++)
		{
			if (oldest < pups[i].getAge())
			{
				oldest = pups[i].getAge();
				index = i;
			}
		}
		return pups[index].getName();
	}

	public String getNameOfYoungest()
	{
		int youngest = pups[0].getAge();
		int index = 0;
		for (int i = 1; i < pups.length; i++)
		{
			if (youngest > pups[i].getAge())
			{
				youngest = pups[i].getAge();
				index = i;
			}
		}
		return pups[index].getName();
	}

	public String toString()
	{
		return ""+Arrays.toString(pups);
	}
}