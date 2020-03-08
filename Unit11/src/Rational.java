//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

class Rational implements Comparable<Rational>
{
	//add two instance variables

	private int num1;
	private int dem1;
	
	//write two constructors

	public Rational ()
	{
		setRational(1,1);
	}

	public Rational (int num, int dem)
	{
		setRational(num, dem);
	}
	
	//write a setRational method
	public void setRational(int num, int dem)
	{
		num1 = num;
		dem1 = dem;
	}

	//write  a set method for numerator and denominator

	
	public void setNumerator (int num)
	{
		num1 = num;
	}
	
	public void setDenominator (int dem)
	{
		dem1 = dem;
	}
	
	public void add(Rational  other)
	{
		
		num1 = num1*other.getDem() + other.getNum()*dem1;
		dem1 = dem1*other.getDem();		
		reduce();
	}

	private void reduce()
	{
		int div = gcd(num1, dem1);
		num1 = num1/div;
		dem1 = dem1/div;
		
	}

	private int gcd(int numOne, int numTwo)
	{
		int gcd = 0;
		int min = 0;
		
		if (numOne <numTwo)
		{
			min = numOne;
		}
		else
		{
			min = numTwo;
		}
		
		for (int i = 1; i <= min; i++)
		{
			if (numTwo%i == 0 && numOne%i == 0)
			{
				gcd = i;
			}
		}
		
		return gcd;
	}

	public Object clone ()
	{
		Rational temp = new Rational();
		temp.dem1 = dem1;
		temp.num1 = num1;
		return temp;
	}


	//ACCESSORS
	//write get methods for numerator and denominator
	public int getNum ()
	{
		return num1;
	}
	
	public int getDem ()
	{
		return dem1; 
	}
	

	
	public boolean equals( Object obj)
	{
		
		Rational temp = (Rational)obj;
		
		temp.reduce();
		reduce();

		if ((temp.dem1 == dem1) && (temp.num1 == num1))
		{
			return true;
		}
		return false;
	}

	public int compareTo(Rational other)
	{
		double one = (double)num1/dem1;
		double two = (double)other.num1/other.dem1;
		
		if (one > two)
		{
			return 1;
		}
		
		return -1;
	}


	
	//write  toString() method
	public String toString()
	{
		return num1 + "/" + dem1;
	}
	
}