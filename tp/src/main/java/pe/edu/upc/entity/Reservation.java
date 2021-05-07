package pe.edu.upc.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table (name= "Reservations")
public class Reservation {
	@Id
	@Column(name= "reservation_id", length=6, nullable=false)
	private String id; 
	
	@Column(name = "description", length = 50, nullable = false)
	private String description;
	
	@Column(name = "price", length = 50, nullable = false)
	private String price;
	
	@Column(name = "commission", length = 50, nullable = false)
	private String commission;
	
	@Column(name = "start_date", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date startDate;
	
	@Column(name = "end_date", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date endDate;
	
	public Reservation(String id, String description, String price, String commission, Date startDate, Date endDate) {
		super();
		this.id = id;
		this.description = description;
		this.price = price;
		this.commission = commission;
		this.startDate = startDate;
		this.endDate = endDate;

	}

	public Reservation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getCommission() {
		return commission;
	}

	public void setCommission(String commission) {
		this.commission = commission;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}


	
}