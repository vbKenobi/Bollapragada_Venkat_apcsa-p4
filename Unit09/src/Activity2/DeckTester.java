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
	}
}
