package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;


import pe.edu.upc.entity.Card;
import pe.edu.upc.service.ICardService;

@Named
@RequestScoped
public class CardController implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Inject
	 private ICardService cService;
	 
	 private Card card;
	 List<Card> listCards;
	 
	 @PostConstruct
	 public void init()
	 {
		 this.listCards =  new ArrayList<Card>();
		 this.card = new Card();
		 this.list();
	 }
	 public String newBrand() {
			this.setCard(new Card());
			return "card.xhtml";
	 }
	 public void insert() {
		 cService.insert(card);
			this.clean();
			this.list();
	 }
	 public void list() {
			listCards = cService.list();
		}
		
		public void clean() {
			this.init();
		}
		public void findByName() {
			if (card.getNumCard().isEmpty())
				this.list();
			else
				listCards = this.cService.findByNameCard(this.getCard());
		}
//eliminar
		public void delete(Card card) 
	     {
	    	try {
	    		cService.delete(card.getId());
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
	     }
//eliminar
		public Card getCard() {
			return card;
		}

		public void setCard(Card card) {
			this.card = card;
		}

		public List<Card> getListCards() {
			return listCards;
		}

		public void setListCustomers(List<Card> listCards) {
			this.listCards = listCards;
		}

}
