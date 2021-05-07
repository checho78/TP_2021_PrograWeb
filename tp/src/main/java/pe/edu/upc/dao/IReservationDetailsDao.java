package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.ReservationDetails;


public interface IReservationDetailsDao {

	public void insert(ReservationDetails r);
	public List<ReservationDetails> list();

}
