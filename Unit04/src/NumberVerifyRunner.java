//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class NumberVerifyRunner
{
	public static void main ( String[] args )
	{
		Scanner keyboard  = new Scanner(in);
		//add in input
		out.print("Enter a integer :: ");
		int num = keyboard.nextInt();

		System.out.println( num + " is odd :: " + NumberVerify.isOdd(num));
		System.out.println( num + " is even :: " + NumberVerify.isEven(num));
		System.out.println();
		
		//add in more test cases
		
		//Test 2 
		out.print("Enter a integer :: ");
		num = keyboard.nextInt();

		System.out.println( num + " is odd :: " + NumberVerify.isOdd(num));
		System.out.println( num + " is even :: " + NumberVerify.isEven(num));
		System.out.println();
		
		//Test 3 
		out.print("Enter a integer :: ");
		num = keyboard.nextInt();

		System.out.println( num + " is odd :: " + NumberVerify.isOdd(num));
		System.out.println( num + " is even :: " + NumberVerify.isEven(num));
		System.out.println();
		
		//Test 4 
		out.print("Enter a integer :: ");
		num = keyboard.nextInt();

		System.out.println( num + " is odd :: " + NumberVerify.isOdd(num));
		System.out.println( num + " is even :: " + NumberVerify.isEven(num));
		System.out.println();
	}
}