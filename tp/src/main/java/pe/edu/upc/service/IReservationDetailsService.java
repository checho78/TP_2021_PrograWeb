package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.ReservationDetails;

public interface IReservationDetailsService {

	public void insert(ReservationDetails r);
	public List<ReservationDetails> list();
	
}
