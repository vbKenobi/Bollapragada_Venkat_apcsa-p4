/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card test1 = new Card("King", "Hearts", 10);
		Card test2 = new Card("Ten", "Spades", 10);
		Card test3 = new Card("Five", "Clubs", 5);
		Card test4 = new Card("King", "Hearts", 10);
		
		
		//Card 1
		System.out.println(test1.suit());
		System.out.println(test1.rank());
		System.out.println(test1.pointValue());
		System.out.println(test1.matches(test2));
		System.out.println(test1.matches(test3));
		System.out.println(test1.matches(test4));
		System.out.println(test1);
		
		//Card 2
		System.out.println(test2.suit());
		System.out.println(test2.rank());
		System.out.println(test2.pointValue());
		System.out.println(test2.matches(test1));
		System.out.println(test2.matches(test3));
		System.out.println(test2.matches(test4));
		System.out.println(test2);
		
		//Card 3
		System.out.println(test3.suit());
		System.out.println(test3.rank());
		System.out.println(test3.pointValue());
		System.out.println(test3.matches(test1));
		System.out.println(test3.matches(test2));
		System.out.println(test3.matches(test4));
		System.out.println(test3);
		
		//Card 4
		System.out.println(test4.suit());
		System.out.println(test4.rank());
		System.out.println(test4.pointValue());
		System.out.println(test4.matches(test1));
		System.out.println(test4.matches(test2));
		System.out.println(test4.matches(test3));
		System.out.println(test4);
		
	
	}
}
