//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		//ask for name and size
		System.out.println("Enter Monster 1's name:: ");
		String s = keyboard.next();
		
		System.out.println("Enter Monster 1's size:: ");
		int b = keyboard.nextInt();
		
		//instantiate monster one
		
		Skeleton one = new Skeleton(b, s);
		
		//ask for name and size
		
		System.out.println("Enter Monster 2's name:: ");
		s = keyboard.next();
		
		System.out.println("Enter Monster 2's size:: ");
		b = keyboard.nextInt();
		
		//instantiate monster two
		
		Skeleton two = new Skeleton(b, s);
		
		System.out.println("Monster-1:: " + one);
		System.out.println("Monster-2:: " + two);
		
		System.out.println("Monster 1 greater than monster 2 is :: " + one.isBigger(two));
		System.out.println("Monster 1 has the same name as monster 2 is :: " + one.namesTheSame(two));
		
	}
}