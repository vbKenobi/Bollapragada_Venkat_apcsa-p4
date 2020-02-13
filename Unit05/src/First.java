//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -


public class First
{
   public static String go( String a )
	{
	   String firstchar = a.substring(0,1);
	   String temp = a.replaceAll(firstchar, "");
	   if (temp.length() < a.length() - 1)
	   {
		   return "yes";
	   }
		return "no";
	}
}



/*

EXPECTED RUNNER OUTPUT
 
no
yes
no
no
yes
no
yes
yes
no
no


*/