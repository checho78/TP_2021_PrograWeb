package pe.edu.upc.controller;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Category;
import pe.edu.upc.service.ICategoryService;


@Named
@RequestScoped
public class CategoryController implements Serializable {
	private static final long serialVersionUID = 1L;
	
	 @Inject
	 private ICategoryService caS;
	 

	 private Category category;
	
	 List<Category> listCategories;

	 
	 
	 @PostConstruct
	 public void init()
	 {
		 this.listCategories =  new ArrayList<Category>();
		 this.category = new Category();
		 this.list();
	
	 }
	 
	 public String newCategory() {
			this.setCategory(new Category());
			return "category.xhtml";
		}
	 public void insert() {
		 caS.insert(category);
			this.clean();
			this.list();
		}
		
		public void list() {
			listCategories = caS.list();
		}
		

		public void clean() {
			this.init();
		}
		public void findByName() {
			
			if (category.getName().isEmpty())
				this.list();
			else
				listCategories = this.caS.findByNameCategory(this.getCategory());
		}
		 public void delete(Category ca) 
	     {
	    	try {
	    		caS.delete(ca.getId());
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
	     }

		public Category getCategory() {
			return category;
		}

		public void setCategory(Category category) {
			this.category = category;
		}

		public List<Category> getListCategories() {
			return listCategories;
		}

		public void setListCategories(List<Category> listCategories) {
			this.listCategories = listCategories;
		}

}
