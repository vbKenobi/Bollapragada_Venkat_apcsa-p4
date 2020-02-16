//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemoverRunner
{
	public static void main( String args[] )
	{
		LetterRemover test = new LetterRemover();
		test.setRemover("I am Sam I am", 'a');
		test.removeLetters();
		System.out.println(test);
		
		test.setRemover("ssssssssxssssesssssesss", 's');
		test.removeLetters();
		System.out.println(test);
		
		test.setRemover("qwertyqwertyqwerty", 'a');
		test.removeLetters();
		System.out.println(test);
		
		test.setRemover("abababababa", 'b');
		test.removeLetters();
		System.out.println(test);
		
		test.setRemover("abaababababa", 'x');
		test.removeLetters();
		System.out.println(test);
											
	}
}