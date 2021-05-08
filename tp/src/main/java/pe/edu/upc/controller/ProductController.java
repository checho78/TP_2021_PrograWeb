package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Brand;
import pe.edu.upc.entity.Category;
import pe.edu.upc.entity.Product;

import pe.edu.upc.service.IBrandService;
import pe.edu.upc.service.ICategoryService;
import pe.edu.upc.service.IProductService;

@Named
@RequestScoped
public class ProductController implements Serializable{
	public static final long serialVersionUID = 1L;
	
	@Inject
	private ICategoryService cS;
	
	@Inject
	private IBrandService bS;
	
	@Inject
	private IProductService pS;
	
	private Category category;
	private Brand brand;
	private Product product;
	
	
	List<Product> listProducts;
	List<Category> listCategories;	
	List<Brand> listBrands;
	
	@PostConstruct
	public void init() {
		this.product = new Product();	
		this.brand= new  Brand();
		this.category = new Category();
		
		this.listProducts = new ArrayList<Product>();
		this.listCategories = new ArrayList<Category>();
		this.listBrands = new ArrayList<Brand>();
	
		this.list();
		this.listBrand();
		this.listCategory();
		}
	
	public String newProduct(){
		this.setProduct(new Product());
		return "product.xhtml";
	}
	
	public void insert() {
		pS.insert(product);
		this.clean();
		this.list();
	}
	
	public void list() {
		listProducts = pS.list();
	}
	public void listBrand() {
		listBrands=bS.list();
	}
	public void listCategory() {
		listCategories=cS.list();
	}
	
	
	
	
	
	
	
	public void clean() {
		this.init();
	}
	
	public void eliminar(Product p) {
		try {
			pS.eliminar(p.getId());
			this.list();
		}
		catch(Exception ex){
			System.out.println(ex.getMessage());
		}
	}
	
	public void findByName() {
		if(product.getName().isEmpty()) {
			this.list();
		}else {
			listProducts = this.pS.fingByNameProduct(this.getProduct());
		}
	}

	
	
	//getters and setters
	
	
	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public List<Product> getListProducts() {
		return listProducts;
	}

	public void setListProducts(List<Product> listProducts) {
		this.listProducts = listProducts;
	}

	public List<Category> getListCategories() {
		return listCategories;
	}

	public void setListCategories(List<Category> listCategories) {
		this.listCategories = listCategories;
	}

	public List<Brand> getListBrands() {
		return listBrands;
	}

	public void setListBrands(List<Brand> listBrands) {
		this.listBrands = listBrands;
	}
	
	
	
	

}
