package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.inject.Inject;

import pe.edu.upc.dao.IReservationDetailsDao;
import pe.edu.upc.entity.ReservationDetails;
import pe.edu.upc.service.IReservationDetailsService;

public class ReservationDetailsServiceImpl implements IReservationDetailsService{

	@Inject
	private IReservationDetailsDao rD;
	

	public void insert(ReservationDetails r) {
		rD.insert(r); 
	}

	@Override
	public List<ReservationDetails> list() {
		return rD.list();
	}

}
