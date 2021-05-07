package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.ReservationDetails;
import pe.edu.upc.service.IReservationDetailsService;

@Named
@RequestScoped
public class ReservationDetailsController implements Serializable {
	private static final long serialVersionUID = 1L;

	
	 @Inject
	 private IReservationDetailsService rS;
	 
	 private ReservationDetails reservationDetails;
	 List<ReservationDetails> listReservationDetails;
	 
	 
	 @PostConstruct
	 public void init()
	 {
		 this.listReservationDetails =  new ArrayList<ReservationDetails>();
		 this.reservationDetails = new ReservationDetails();
		 this.list();
	 }
	 
	 public String newReservation() {
			this.setReservationDetails(new ReservationDetails());
			return "customer.xhtml";
		}
	 public void insert() {
		 rS.insert(reservationDetails);
			this.clean();
			this.list();
		}
		
		public void list() {
			listReservationDetails = rS.list();
		}
		
		public void clean() {
			this.init();
		}

		public ReservationDetails getReservationDetails() {
			return reservationDetails;
		}

		public void setReservationDetails(ReservationDetails reservationDetails) {
			this.reservationDetails = reservationDetails;
		}

		public List<ReservationDetails> getListReservationDetails() {
			return listReservationDetails;
		}

		public void setListReservationDetails(List<ReservationDetails> listReservationDetails) {
			this.listReservationDetails = listReservationDetails;
		}
		
		

}
