
import static java.lang.System.*;

public class DigitsRunner_2017
{
	   public static void main(String args[])
	   {	
		   Digits_2017 test = new Digits_2017(7);
		   
		   System.out.println(test.isStrictlyIncreasing());
		   
		   
		   test = new Digits_2017(1356);
		   
		   System.out.println(test.isStrictlyIncreasing());
		   
		  test = new Digits_2017(1336);
		   
		   System.out.println(test.isStrictlyIncreasing());

		   test = new Digits_2017(1536);
			   
		   System.out.println(test.isStrictlyIncreasing());
		   
		   test = new Digits_2017(65310);
		   
		   System.out.println(test.isStrictlyIncreasing());
		   
		}
	
}