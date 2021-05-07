package pe.edu.upc.dao;

import java.util.List;


import pe.edu.upc.entity.Category;

public interface ICategoryDao {
	public void insert(Category ca);
	public void delete(int idCategory);
	public List<Category> list();
	public List<Category> findByNameCategory(Category ca);
}
