//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class ToyRunner
{
	public static void main(String[] args)
	{
		Toy test1 = new Toy();
		test1.setName("Legos");
		test1.setCount(100);
		System.out.println(test1);
		
		
		Toy test2 = new Toy();
		test2.setName("Teddy Bear");
		System.out.println(test2);
		
		Toy test3 = new Toy("Cards");
		System.out.println(test3);
		
	}
}