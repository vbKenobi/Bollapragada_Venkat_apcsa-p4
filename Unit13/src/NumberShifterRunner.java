//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifterRunner
{
	public static void main( String args[] ) throws IOException
	{
		NumberShifter s = new NumberShifter();

		//add test cases
		s.shiftEm(s.makeLucky7Array(20));
		
		System.out.println();
		
		s.shiftEm(s.makeLucky7Array(19));
		
		System.out.println();
		
		s.shiftEm(s.makeLucky7Array(18));
		
		System.out.println();
		
		s.shiftEm(s.makeLucky7Array(17));
	}
}



