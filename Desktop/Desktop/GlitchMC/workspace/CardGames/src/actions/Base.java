package actions;

import objects.Card;
import objects.Deck;
import objects.enums.Suit;

public class Base {

	public static Deck buildDeck()
	{
		Card[] cards = new Card[52];
		
		int pos = 0;
		
		for(int i = 1; i <= 13; i++)
		{
			cards[pos] = new Card(i, Suit.Clubs);
			pos++;
		}
		for(int i = 1; i <= 13; i++)
		{
			cards[pos] = new Card(i, Suit.Spades);
			pos++;
		}
		for(int i = 1; i <= 13; i++)
		{
			cards[pos] = new Card(i, Suit.Diamonds);
			pos++;
		}
		for(int i = 1; i <= 13; i++)
		{
			cards[pos] = new Card(i, Suit.Hearts);
			pos++;
		}
 
		return new Deck(cards);
	}
	
}
