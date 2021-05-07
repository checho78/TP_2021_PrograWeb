package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.inject.Inject;

import pe.edu.upc.dao.ICategoryDao;
import pe.edu.upc.entity.Category;
import pe.edu.upc.service.ICategoryService;


public class CategoryServiceImpl implements ICategoryService{

	@Inject
	private ICategoryDao caD;

	@Override
	public void insert(Category ca){
		caD.insert(ca);
	}

	@Override
	
	public List<Category> list() {
		return caD.list();
	}

	@Override
	public List<Category> findByNameCategory(Category ca) {
		return caD.findByNameCategory(ca);
	}
	
	@Override
	public void delete(int idCategory) {
		caD.delete(idCategory);
	}

}