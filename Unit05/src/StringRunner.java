//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class StringRunner
{
	public static void main ( String[] args )
	{
		Scanner keyboard  = new Scanner(in);
		
		//test1
		out.print("Enter a String:: ");
		String s = keyboard.nextLine();
		
		StringOddOrEven test = new StringOddOrEven(s);
		test.isEven();
		out.println(test);
		
		//test2
		out.print("Enter a String:: ");
		s = keyboard.nextLine();
		
		test.setString(s);
		test.isEven();
		out.println(test);
		
		//test3
		out.print("Enter a String:: ");
		s = keyboard.nextLine();
		
		test.setString(s);
		test.isEven();
		out.println(test);
		
		//test4
		out.print("Enter a String:: ");
		s = keyboard.nextLine();
		
		test.setString(s);
		test.isEven();
		out.println(test);
		
		//test5
		out.print("Enter a String:: ");
		s = keyboard.nextLine();
		
		test.setString(s);
		test.isEven();
		out.println(test);
		
	}
}