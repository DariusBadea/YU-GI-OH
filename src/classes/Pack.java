package classes;

import java.util.Arrays;

public class Pack {

	int noCards;
	Card[] cards;
	public Pack(int noCards, Card[] cards) {
		super();
		this.noCards = noCards;
		this.cards = cards;
	}
	public Pack() {
		super();
	}
	
	@Override
	public String toString() {
		return "Pack [noCards=" + noCards + ", cards=" + Arrays.toString(cards) + "]";
	}
	
	
	public int getNoCards() {
		return noCards;
	}
	public void setNoCards(int noCards) {
		this.noCards = noCards;
	}
	public Card[] getCards() {
		return cards;
	}
	public void setCards(Card[] cards) {
		this.cards = cards;
	}
	public void addCard(Card card_to_add) {
		if (cards.length == 0) {
			cards = new Card[1];
		cards[0] = card_to_add;}
		else {
			Card[] new_cards = new Card[cards.length+1];
			new_cards = cards;
			new_cards[cards.length-1] = card_to_add;
			this.cards = new_cards;
			this.noCards +=1;
		}
		
	}
	
}
