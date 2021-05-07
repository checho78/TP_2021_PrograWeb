package pe.edu.upc.service;

import java.util.List;


import pe.edu.upc.entity.Category;

public interface ICategoryService {
	public void insert(Category  ca);
	public List<Category> list();
	public List<Category> findByNameCategory(Category ca);
	public void delete(int idCategory); 
}
