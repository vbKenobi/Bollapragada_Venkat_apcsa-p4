package Activity2;

/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		
		Deck test1 = new Deck(new String[] {"A", "B", "C"}, new String[] {"Tiger", "Lion"}, new int[] {1, 2, 3});
		System.out.println(test1.isEmpty());
		System.out.println(test1.size());
		System.out.println(test1.deal());
		System.out.println(test1);
		
		
		String[] ranks = { "Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
		String[] suit = {"Hearts", "Diamonds", "Spades", "Clubs"};
		int[] value = {1,2,3,4,5,6,7,8,9,10,11,12,14}; 

		Deck test2 = new Deck(ranks, suit, value);
		//System.out.println(test2.isEmpty());
		//System.out.println(test2.size());
		
		System.out.println(test2);
		test2.shuffle();
		System.out.println(test2);
		
		test2.deal();
		
		System.out.println(test2);
		
		test2.deal();
		
		System.out.println(test2);

		
		System.out.println(test2.size());
		
		test2.shuffle();
		System.out.println(test2);
		
		//test2.shuffle();
		//System.out.println(test2);

		
		//System.out.println(test2.deal());
		//System.out.println(test2);
	
	}
}
