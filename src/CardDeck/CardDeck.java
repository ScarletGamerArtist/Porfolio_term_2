package CardDeck;
/*
 * Alanna Botscharow
 * 12/18
 */

public class CardDeck {

	public static void main(String[] args) {
		//
		int[] deck = new int[52];	
		String[] suits = {"Spades","Hearts","Diamonds","Clubs"};
		String[] ranks = {"Ace","2","3","4","5","6","7","8","9","10",
				"Jack","Queen","King"};
		
		
		
		
		for (int i = 0; i < deck.length; i++) {
			deck[i] = i; 
			
		}
		
		for (int i = 0; i < deck.length; i++) {
			int index = (int)(Math.random() * deck.length);
			int temp = deck [i];
			deck[i] = deck[index];
			deck[index] = temp;
			
		}
		for (int i = 0; i < 5; i++) {
			String suit = suits[deck[i] / 13];
			String rank = ranks[deck[i] % 13];
			System.out.println("Card number " + deck[i] + ": "
					+ rank + " of " + suit);
			
			//stack = last in, first out
			//Cue = first in, first out
		}
		
	}

}
