package pe.edu.upc.daoimpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.ICategoryDao;
import pe.edu.upc.entity.Category;

public class CategoryDaoImpl implements ICategoryDao, Serializable {
	
	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName = "b")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insert (Category ca) { 
		try {
			em.persist(ca);
		}	
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	@Override
	@SuppressWarnings("unchecked")
	
	public List<Category> list() {
		
		List<Category> list =  new ArrayList<Category>();
		Query q= em.createQuery("from Category ca");
		list = (List<Category>)q.getResultList();
		return list;
	}
	
	public void delete (int idCategory) 
	{
		Category ca = new Category();
		try {
			ca=em.getReference(Category.class, idCategory); 
			em.remove(ca);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Category> findByNameCategory(Category ca) 
	{
		List<Category> list = new ArrayList<Category>();
		
		Query q = em.createQuery("from Category ca where ca.name  like  ?1");
		q.setParameter(1,'%' + ca.getName() + '%');
		list= (List<Category>)q.getResultList();
		return list;
	}

}
