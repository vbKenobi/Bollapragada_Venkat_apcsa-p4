//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;

public class StringEqualityRunner
{
	public static void main( String args[] )
	{
		StringEquality test = new StringEquality();
		
		//test1
		test.setWords("abs", "abc");
		test.checkEquality();
		System.out.println(test);
		
		//test2
		test.setWords("Cats", "Dogs");
		test.checkEquality();
		System.out.println(test);
		
		//test3
		test.setWords("Green", "Green");
		test.checkEquality();
		System.out.println(test);
		
		//test4
		test.setWords("Popcorn", "Pop");
		test.checkEquality();
		System.out.println(test);
		
		//test5
		test.setWords("1235", "5321");
		test.checkEquality();
		System.out.println(test);
		
		//test6
		test.setWords("1234", "1234");
		test.checkEquality();
		System.out.println(test);
	}
}