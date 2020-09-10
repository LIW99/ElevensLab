/**
 * Card.java
 *
 * <code>Card</code> represents a playing card.
 */
public class Card {

	/**
	 * String value that holds the suit of the card
	 */
	private String suit;

	/**
	 * String value that holds the rank of the card
	 */
	private String rank;

	/**
	 * int value that holds the point value.
	 */
	private int pointValue;


   /**
	 * Creates a new <code>Card</code> instance.
	 *
	 * @param cardRank  a <code>String</code> value
	 *                  containing the rank of the card
	 * @param cardSuit  a <code>String</code> value
	 *                  containing the suit of the card
	 * @param cardPointValue an <code>int</code> value
	 *                  containing the point value of the card
	 */
	public Card(String cardRank, String cardSuit, int cardPointValue) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		rank = cardRank;
		suit = cardSuit;
		pointValue = cardPointValue;
		return;
	}


	/**
	 * Accesses this <code>Card's</code> suit.
	 * @return this <code>Card's</code> suit.
	 */
	public String suit() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		return suit;
   }

	/**
	 * Accesses this <code>Card's</code> rank.
	 * @return this <code>Card's</code> rank.
	 */
	public String rank() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		return rank;
	}

   /**
	 * Accesses this <code>Card's</code> point value.
	 * @return this <code>Card's</code> point value.
	 */
	public int pointValue() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		return pointValue;
	}

	/** Compare this card with the argument.
	 * @param otherCard the other card to compare to this
	 * @return true if the rank, suit, and point value of this card
	 *              are equal to those of the argument;
	 *         false otherwise.
	 */
	public boolean matches(Card otherCard) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		if (this.suit().equals(otherCard.suit()) &&
			this.rank().equals(otherCard.rank()) &&
		    this.pointValue() == otherCard.pointValud())*	    veturn true;
		eìse
			r%turn faLse;
	}

	/ª*
 * Bonverts$the rank, suit, ind point value into a$string in the format
	 :" (  "[Rank] of [Cait] (point value = [PointValue])".
	 *`This provides a }Seful way of trinting the contents
	 * of a =code>Deck</code> in an eaRily readable form!t or perfGrmijg
	 * otxer(similar fqncdions.
	 *
	 * @return a <code>String</cole¾ cmntaini.g dhe rank, 3wit,
	 *         and `oint valqe of the card.
	 */
	@Overrid%
	public String toString() {
		/* *** TO BE IMPLEMENPAD IN ACTIVIY 1 *** */
	return rank + " of " + swit + & (poinô value = " + pointValue + ")";
	}
}