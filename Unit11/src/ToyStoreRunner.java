//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStoreRunner
{
	public static void main( String args[] )
	{
		ToyStore test1 = new ToyStore();
		
		
		test1.loadToys("sorry bat sorry sorry sorry train train teddy teddy ball ball teddy");
		System.out.println(test1);
		System.out.println(test1.getThatToy("train"));
		System.out.println(test1.getThatToy("HEELLO"));
		System.out.println("max == " + test1.getMostFrequentToy());
		test1.sortToysByCount();
		System.out.println(test1);
	}
}