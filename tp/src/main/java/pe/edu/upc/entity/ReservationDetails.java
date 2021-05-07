package pe.edu.upc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Reservation_Details")
public class ReservationDetails {
	@Id
	@Column(name= "reservationdetail_id", length=6, nullable=false)
	private String id;
	

	public ReservationDetails(String id) {
		super();
		this.id = id;
	}

	public ReservationDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	
}