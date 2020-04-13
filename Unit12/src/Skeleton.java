//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

public class Skeleton implements Monster
{

	//add instance variables	

	private int size;
	private String name;
	
	//add a constructor

	public Skeleton()
	{
		setValues(0, "");
	}
	
	public Skeleton( int a, String b)
	{
		setValues(a, b);
	}
	
	public Skeleton (int a)
	{
		setValues(a, "");
	}
	
	public Skeleton (String b)
	{
		setValues(0, b);
	}
	
	public void setValues(int a, String b)
	{
		setSize(a);
		setName(b);
	}
	
	public void setSize(int a)
	{
		size = a;
	}
	
	public void setName(String b)
	{
		name = b;
	}
	
	
	//add code to implement the Monster interface

	public int getHowBig()
	{
		return size;
	}
	
	public String getName()
	{
		return name;
	}
	
	public boolean isBigger(Monster other)
	{
		if (size > other.getHowBig())
		{
			return true;
		}
		return false;
	}
	
	public boolean isSmaller(Monster other)
	{
		if (size < other.getHowBig())
		{
			return true;
		}
		return false;
	}
	
	public boolean namesTheSame(Monster other)
	{
		if (name.equals(other.getName()))
		{
			return true;
		}
		return false;
	}
	
	//add a toString
	
	public String toString()
	{
		String s = name + " " + size;
		return s;
	}
}