//(c) A+ Computer Science
//www.apluscompsci.com

//Name - 
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class DiscountRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		//Test 1
		out.print("Enter the original bill amount :: ");
		double amt = keyboard.nextDouble();
		out.println("The price after discount :: " + Discount.getDiscountedBill( amt ) );
		out.println("");
		
		//Test 2
		out.print("Enter the original bill amount :: ");
		amt = keyboard.nextDouble();
		out.println("The price after discount :: " + Discount.getDiscountedBill( amt ) );
		out.println("");
		
		//Test 3
		out.print("Enter the original bill amount :: ");
		amt = keyboard.nextDouble();
		out.println("The price after discount :: " + Discount.getDiscountedBill( amt ) );
		out.println("");		

		//Test 4
		out.print("Enter the original bill amount :: ");
		amt = keyboard.nextDouble();
		out.println("The price after discount :: " + Discount.getDiscountedBill( amt ) );
		out.println("");
	}
}