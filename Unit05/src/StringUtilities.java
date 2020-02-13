//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -


public class StringUtilities
{
   public static String endsWith( String a, String b)
	{
	   if (a.lastIndexOf(b) == a.length() - b.length())
	   {
		   return "true";
	   }
	   return "false";
	}
}

