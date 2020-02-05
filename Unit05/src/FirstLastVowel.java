//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -


public class FirstLastVowel
{
   public static String go( String a )
	{
	   String negative = "no";
	   String positive = "yes";

	   char a1 = a.charAt(0);
	   char a2 = a.charAt(a.length()-1);
	   if (a1 == 'a' || a1 == 'e' || a1 == 'i' || a1 == 'o' || a1 == 'u' || a1 == 'A' || a1 == 'E' || a1 == 'I' || a1 == 'O' || a1 == 'U')
	   {
		   return positive;
	   }
	   if (a2 == 'a' || a2 == 'e' || a2 == 'i' || a2 == 'o' || a2 == 'u' || a2 == 'A' || a2 == 'E' || a2 == 'I' || a2 == 'O' || a2 == 'U')
	   {
		   return positive;
	   }
	   else
	   {
		return negative;  
	   }
	   
	   
	}
}