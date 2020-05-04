//2016 AP Computer Science Principles Question 1 Part A & B Runner

public class RandomStringChooserRunner_2016
{
	   public static void main(String args[])
	   {	
		   String[] wordArray = {"wheels", "on", "the", "bus"};
		   RandomStringChooser_2016 sChooser = new RandomStringChooser_2016(wordArray);
		   
		   for (int k = 0; k < 6; k++)
		   {
			   System.out.print(sChooser.getNext() + " ");
		   }
		   
		   RandomLetterChooser_2016 letterChooser = new RandomLetterChooser_2016("cat");
		   
		   System.out.println();
		   
		   for (int k = 0; k < 4; k++)
		   {
			   System.out.print(letterChooser.getNext());
		   }
		}
	
}