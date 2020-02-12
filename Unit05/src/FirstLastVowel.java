//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -


public class FirstLastVowel
{
   public static String go( String a )
	{

	   char charOne = a.charAt(0);
	   char charTwo = a.charAt(a.length()-1);
	   
	   if (charOne == 'a' || charOne == 'e' || charOne == 'i' || charOne == 'o' || charOne == 'u') 
	   {
		   return "yes";
	   }
	   else if (charOne == 'A' || charOne == 'E' || charOne == 'I' || charOne == 'O' || charOne == 'U')
	   {
		   return "yes";
	   }
	   else if (charTwo == 'a' || charTwo == 'e' || charTwo == 'i' || charTwo == 'o' || charTwo == 'u')
	   {
		   return "yes";
	   }
	   else if (charTwo == 'A' || charTwo == 'E' || charTwo == 'I' || charTwo == 'O' || charTwo == 'U')
	   {
		   return "yes";
	   }
	   else
	   {
		return "no";  
	   }
	   
	   
	}
}