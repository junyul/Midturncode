package pkgCore;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgEnum.eSuit;

public class DeckTest {


public void TestEmptyDeck() {
	Deck d = new Deck();
	for (int k = 1; k <= 53; k++) {
		d.Draw();
	}		
}
	

public void TestSuit() {
	Deck d = new Deck();
	Card c = d.Draw();
	assertTrue(c.geteSuit() == eSuit.CLUBS);
	}

public void TestRank() {
	Deck d = new Deck();
	;
	Object eRank;
	Card c = d.Draw(eRank.2);
	assertTrue(c.geteRank() == eRank.2);}
	