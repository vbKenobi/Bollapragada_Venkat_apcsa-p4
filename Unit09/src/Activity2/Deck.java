package Activity2;
import java.util.List;

import Activity1.Card;

import java.util.ArrayList;

/**
 * The Deck class represents a shuffled deck of cards.
 * It provides several operations including
 *      initialize, shuffle, deal, and check if empty.
 */
public class Deck {

	/**
	 * cards contains all the cards in the deck.
	 */
	
	private List<Card> cards;
	
	//private Card[] cards;

	/**
	 * size is the number of not-yet-dealt cards.
	 * Cards are dealt from the top (highest index) down.
	 * The next card to be dealt is at size - 1.
	 */
	private int size;


	/**
	 * Creates a new <code>Deck</code> instance.<BR>
	 * It pairs each element of ranks with each element of suits,
	 * and produces one of the corresponding card.
	 * @param ranks is an array containing all of the card ranks.
	 * @param suits is an array containing all of the card suits.
	 * @param values is an array containing all of the card point values.
	 */
	public Deck(String[] ranks, String[] suits, int[] values) 
	{
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		
		/* *** USING ARRAY LISTS*** */
		int k = 0;
		cards = new ArrayList<Card>();
		for (int i = 0; i < ranks.length; i++)
		{
			for (int j = 0; j < suits.length; j++)
			{
				Card test1 =  new Card(ranks[i], suits[j], values[i]);
				cards.add(test1);
				k++;
			}
		}

		shuffle();
		size = cards.size();
		
		/* *********************** */
		
		
		/* *** USING ARRAYS*** */
		/*
		int k = 0;
		cards = new Card[ranks.length*suits.length];
		for (int i = 0; i < ranks.length; i++)
		{
			for (int j = 0; j < suits.length; j++)
			{
				Card test1 =  new Card(ranks[i], suits[j], values[i]);
				cards[k] = test1;
				k++;
			}
		}

		size = cards.length;
		
		*/
		/* *********************** */
		
	}


	/**
	 * Determines if this deck is empty (no undealt cards).
	 * @return true if this deck is empty, false otherwise.
	 */
	public boolean isEmpty() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		if (size == 0)
		{
			return true;
		}
		return false;
	}

	/**
	 * Accesses the number of undealt cards in this deck.
	 * @return the number of undealt cards in this deck.
	 */
	public int size() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		return size;
		
	}

	/**
	 * Randomly permute the given collection of cards
	 * and reset the size to represent the entire deck.
	 */
	public void shuffle() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 4 *** */
		
		
		/* *** USING ARRAY LISTS*** */
		int r = 0;
		Card tempvalue;
		
		for (int k = cards.size()-1; k >= 0; k--)
		{
			r = (int)(Math.random()*(k+1));
			tempvalue = cards.get(k);
			cards.set(k, cards.get(r));
			cards.set(r, tempvalue);
		}
		
		size = cards.size();
		
		/* ********************* */
		
		/* *** USING ARRAY ******* */
		/*
		int r = 0;
		Card tempvalue;
		
		for (int k = cards.length-1; k >= 1; k--)
		{
			r = (int)(Math.random()*(k+1));
			tempvalue = cards[k];
			cards[k] = cards[r];
			cards[r] = tempvalue;
		}
		
		size = cards.length;
		
		*/
		/* ********************* */
	}

	/**
	 * Deals a card from this deck.
	 * @return the card just dealt, or null if all the cards have been
	 *         previously dealt.
	 */
	public Card deal() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		
		/* *** USING ARRAY LISTS*** */
		if (size == 0)
		{
			return null;
		}
		size = size -1;
		System.out.println("DEAL " + size);
		return cards.get(size);
		/* ********************* */
		
		
		/* *** USING ARRAY ******* */
		/*
		if (size == 0)
		{
			return null;
		}
		size = size -1;
		return cards[size-1];
		*/
		/* *** ********* ** ******* */
	}

	/**
	 * Generates and returns a string representation of this deck.
	 * @return a string representation of this deck.
	 */
	@Override
	public String toString() {
		String rtn = "size = " + size + "\nUndealt cards: \n";

		for (int k = size - 1; k >= 0; k--) {
			
			// Using Array: rtn = rtn + cards[k].toString();
			
			/*Using Array List */
			rtn = rtn + cards.get(k).toString();
			
			if (k != 0) {
				rtn = rtn + ", ";
			}
			if ((size - k) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\nDealt cards: \n";
		
		/*Using Array Lists */
		
		for (int k = cards.size() - 1; k >= size; k--) {
			rtn = rtn + cards.get(k).toString();
			if (k != size) {
				rtn = rtn + ", ";
			}
			if ((k - cards.size()) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}
		
		
		/*Using Arrays:
		for (int k = cards.length - 1; k >= size; k--) {
			rtn = rtn + cards[k].toString();
			if (k != size) {
				rtn = rtn + ", ";
			}
			if ((k - cards.length) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		 */

		rtn = rtn + "\n";
		return rtn;
	}
}
