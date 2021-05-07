package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IReservationDetailsDao;
import pe.edu.upc.entity.ReservationDetails;

public class ReservationDetailsDaoImpl implements IReservationDetailsDao, Serializable{

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName = "b")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insert(ReservationDetails rD) {
		try {
			em.persist(rD);
		}	
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<ReservationDetails> list() {
		List<ReservationDetails> list =  new ArrayList<ReservationDetails>();
		Query q= em.createQuery("from ReservationDetails rD");
		list = (List<ReservationDetails>)q.getResultList();
		return list;
	}

}
