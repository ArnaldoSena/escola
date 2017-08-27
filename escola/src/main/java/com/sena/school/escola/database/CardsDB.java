package com.sena.school.escola.database;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.sena.school.escola.model.Card;

public class CardsDB {
	
	public static List<Card> cards = new ArrayList<Card>();
	
	public CardsDB() {
				
		Card card1 = new Card(1234, 124, new Date(), 1234, false);
		Card card2 = new Card(2345, 235, new Date(), 2345, false);
		
		UserDB usuarios = new UserDB();
		card1.setUserCard(usuarios.getUser(0));
		card2.setUserCard(usuarios.getUser(1));
		cards.add(card1);
		cards.add(card2);
	}

	public static List<Card> getCards() {
		return cards;
	}

	public static void setCards(List<Card> cards) {
		CardsDB.cards = cards;
	}
	
	public boolean exist(int idCard) {
		boolean result = false;
		for(Card card : cards) {
			if(idCard == card.getIdCard()) result = true;
		}
		return result;
	}
	
	public Card getCard(int idCard) {
		for (Card card : cards) {
			if(card.getIdCard() == idCard) return card;
		}
		return null;
	}
}
