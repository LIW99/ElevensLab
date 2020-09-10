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
		Card card1 = new Card("King", "Clubs", 10);
		System.out.println("Card1 Rank: " + card1.rank());
		System.out.println("Card1 Suit: " + card1.suit());
		System.out.println("Card1 PointValue: " + card1.pointValue());
		System.out.println(card1);
		System.out.println("***********************");
		
		Card card2 = new Card("Seven", "Diamonds", 7);
		System.out.println("Card2 Rank: " + card2.rank());
		System.out.println("Card2 Suit: " + card2.suit());
		System.out.println("Card2 PointValue: " + card2.pointValue());
		System.out.println(card2);
		System.out.println("Card2 matches Card1? --> " + card2.matches(card1));
		System.out.println("***********************");
		
		Card card3 = new Card("King", "Clubs", 10);
		System.out.println("Card3 Rank: " + card3.rank());
		System.out.println("Card3 Suit: " + card3.suit());
		System.out.println("Card3 PointValue: " + card3.pointValue());
		System.out.println(card3);
		System.out.println("Card3 matches Card1? --> " + card3.matches(card1));
		System.out.println("Card3 matches Card2? --> " + card3.matches(card2));
		System.out.println("***********************");
		
		
		

	}
}
