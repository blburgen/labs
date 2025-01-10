package week05;

import java.util.*;

public class Deck {

	List<Card> cards = new ArrayList<>();
	
	Deck () {
		String[] suits = {"Spades", "Hearts", "Clubs", "Diamonds"};
		String[] numbers = {"Two", "Three", "Four", "Five", "Six", "Seven", 
							"Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
	
		for (String suit : suits) {
			for (String name : numbers) {
				cards.add(new Card(name, suit));
			}
		}
	}
	
	public List<Card> getCards() {
		return cards;
	}
	
	public void describe() {
		for (Card card : this.cards) {
			card.Describe();
		}		
	}
	
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	public Card draw() {
		return this.cards.remove(0);
	}
}
