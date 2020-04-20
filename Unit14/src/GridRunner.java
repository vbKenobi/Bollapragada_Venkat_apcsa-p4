//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class GridRunner
{
	public static void main( String args[] ) throws IOException
	{
		String[] test = {"a", "b", "c", "7", "9", "x", "2"};
		
		Grid s = new Grid(5, 5, test);
		
		System.out.println(s);
		
		System.out.println();
		
		Grid t = new Grid(10, 10, test);
		
		System.out.println(t);
		
		System.out.println();
		
		Grid u = new Grid(10, 15, test);
		
		System.out.println(u);
		
		System.out.println();
		
		Grid v = new Grid(20, 20, test);
		
		System.out.println(v);
	}
}