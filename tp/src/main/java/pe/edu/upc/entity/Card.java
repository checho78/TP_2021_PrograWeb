package pe.edu.upc.entity;
import java.util.Date;
//import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
//import javax.persistence.FetchType;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Cards")
public class Card {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "num_card", length = 30)
    private String numCard;
    
    @Column(name = "expiration_date", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date expirationDate; 

    @Column(name = "cvv", length = 3)
    private String cvv;

   

	public Card(int id, String numCard, Date expirationDate, String cvv, Customer customer)
			 {
		super();
		this.id = id;
		this.numCard = numCard;
		this.expirationDate = expirationDate;
		this.cvv = cvv;
	}

	public Card() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNumCard() {
		return numCard;
	}

	public void setNumCard(String numCard) {
		this.numCard = numCard;
	}

	public Date getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

}

    