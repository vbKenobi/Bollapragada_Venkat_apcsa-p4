//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class WordsCompareRunner
{
   public static void main( String args[] )
   {
	   //Instantiation
	   WordsCompare test = new WordsCompare();
	   
		//add test cases
	   test.setWords("Hello", "Cat");
	   test.compare();
	   out.println(test);

	   test.setWords("Green", "Blue");
	   test.compare();
	   out.println(test);
	   
	   test.setWords("123", "124");
	   test.compare();
	   out.println(test);
	   
	   test.setWords("ZXY", "YOU");
	   test.compare();
	   out.println(test);
	   
	   test.setWords("And", "Ant");
	   test.compare();
	   out.println(test);
	   
	   test.setWords("CSA", "CSA");
	   test.compare();
	   out.println(test);
	   
	   test.setWords("CSA", "PHYSICS");
	   test.compare();
	   out.println(test);
	}
}