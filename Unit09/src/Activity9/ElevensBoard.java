package Activity9;
import java.util.List;
import java.util.ArrayList;
import Activity1.Card;
import Activity2.Deck;
/**
 * The ElevensBoard class represents the board in a game of Elevens.
 */
public class ElevensBoard extends Board {

	/**
	 * The size (number of cards) on the board.
	 */
	private static final int BOARD_SIZE = 9;

	/**
	 * The ranks of the cards for this game to be sent to the deck.
	 */
	private static final String[] RANKS =
		{"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};

	/**
	 * The suits of the cards for this game to be sent to the deck.
	 */
	private static final String[] SUITS =
		{"spades", "hearts", "diamonds", "clubs"};

	/**
	 * The values of the cards for this game to be sent to the deck.
	 */
	private static final int[] POINT_VALUES =
		{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14};

	/**
	 * Flag used to control debugging print statements.
	 */
	private static final boolean I_AM_DEBUGGING = false;


	/**
	 * Creates a new <code>ElevensBoard</code> instance.
	 */
	 public ElevensBoard() {
	 	super(BOARD_SIZE, RANKS, SUITS, POINT_VALUES);
	 }

	/**
	 * Determines if the selected cards form a valid group for removal.
	 * In Elevens, the legal groups are (1) a pair of non-face cards
	 * whose values add to 11, and (2) a group of three cards consisting of
	 * a jack, a queen, and a king in some order.
	 * @param selectedCards the list of the indices of the selected cards.
	 * @return true if the selected cards form a valid group for removal;
	 *         false otherwise.
	 */
	@Override
	public boolean isLegal(List<Integer> selectedCards) {
		
		/* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
		
		if (selectedCards.size() == 2)
		{
			return containsPairSum11(selectedCards);
		}
		else if (selectedCards.size() == 3)
		{
			return containsJQK(selectedCards);
		}
		else
		{
			return false;
		}
	}

	/**
	 * Determine if there are any legal plays left on the board.
	 * In Elevens, there is a legal play if the board contains
	 * (1) a pair of non-face cards whose values add to 11, or (2) a group
	 * of three cards consisting of a jack, a queen, and a king in some order.
	 * @return true if there is a legal play left on the board;
	 *         false otherwise.
	 */
	@Override
	public boolean anotherPlayIsPossible() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
		List <Integer> listIndexes = cardIndexes(); 
		
		return containsPairSum11(listIndexes) || containsJQK(listIndexes);
	}

	/**
	 * Check for an 11-pair in the selected cards.
	 * @param selectedCards selects a subset of this board.  It is list
	 *                      of indexes into this board that are searched
	 *                      to find an 11-pair.
	 * @return true if the board entries in selectedCards
	 *              contain an 11-pair; false otherwise.
	 */
	private boolean containsPairSum11(List<Integer> selectedCards) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
		int size = selectedCards.size();
		
		System.out.println("containsPairSum11");
		
		for (int i = 0 ; i < size-2; i++)
		{
			
			if(selectedCards.get(i) + selectedCards.get(i+1) == 11)
			{
				return true;
			}
		}
		return false;	
	}

	/**
	 * Check for a JQK in the selected cards.
	 * @param selectedCards selects a subset of this board.  It is list
	 *                      of indexes into this board that are searched
	 *                      to find a JQK group.
	 * @return true if the board entries in selectedCards
	 *              include a jack, a queen, and a king; false otherwise.
	 */
	private boolean containsJQK(List<Integer> selectedCards) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
		List<Integer> indexValues = new ArrayList<Integer>(); 
		boolean king = false;
		boolean queen= false;
		boolean jack = false;
		System.out.println("JQK");
		for (int i = 0 ; i < selectedCards.size(); i++)
		{
			
			if(selectedCards.get(i) == 11 || selectedCards.get(i) == 12 || selectedCards.get(i) == 14 )
			{
				indexValues.add(i);
			}
		}
		
		for (int i = 0; i < indexValues.size(); i++)
		{
			if(indexValues.get(i) == 11)
			{
				jack = true;
			}
			else if(indexValues.get(i) == 12)
			{
				queen = true;
			}
			else
			{
				king = true;
			}
		}
		
		if (jack && queen && king)
		{
			System.out.println("True");
			return true;
		}
		return false;
		
	}
}
