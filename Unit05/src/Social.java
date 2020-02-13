//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -


public class Social
{
   public static String go( String a )
	{
	   if (a.length() != 11)
	   {
		   return "Invalid";
	   }
	   String pos3 = a.substring(3,4);
	   String pos6 = a.substring(6,7);
	   if (a.indexOf("-") == 3 && a.lastIndexOf("-") == 6)
	   {
		   return a.substring(7, a.length());
	   }
		return "Invalid";
	}
}



/*

EXPECTED RUNNER OUTPUT
 
good
bad
good
bad
good
good
bad
bad




*/