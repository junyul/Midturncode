package pkgCore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

import pkgEnum.eRank;
import pkgEnum.eSuit;

public class Deck {

	private ArrayList<Card> cardsInDeck;

	public Deck() {
		for (eSuit eSuit : eSuit.values()) {
			for (eRank eRank : eRank.values()) {
				cardsInDeck.add(new Card(eSuit, eRank));
			}
		}
		Collections.shuffle(cardsInDeck);
	}

	
	public Card Draw() {
		return cardsInDeck.remove(0);
	}
	
	
	
	public int Draw(eSuit eSuit) {
		for (Card newCard: this.cardsInDeck) {
				if (newCard.geteSuit() == eSuit) {
					cardsInDeck.remove(newCard);
					return newCard;
				}
		}
		return null;
		
		
	public Card pkgEnum.eSuit eRank; {
		for (Card newCard: this.cardsInDeck) {
				if (newCard.geteRank() == eRank) {
					cardsInDeck.remove(newCard);
					return newCard;
				}
		}
		return null;
	} 
	
	
	public int eSuit; {
		Stream<Card> CardSuit = cardsInDeck.stream();
						
		return ((ArrayList<Card>) CardSuit).size();
		
}

	public int Count(eRank,eRank); {
		Stream<Card> CardRank = cardsInDeck.stream();
						
		return ((ArrayList<Card>) CardRank).size();
}

	int FinalCard(Card c){
		for (Card cards:cardsInDeck)
		{
			if (cards == c)
				return 1;
		}
		return 0;
}
}


	
}