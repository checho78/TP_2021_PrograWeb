package pe.edu.upc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Products")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "product_id")
	private Integer id;
	
	@Column(name = "name", length = 30)
	private String name;
	
	@Column(columnDefinition = "8,2")
	private Float price;
	
	@Column(name = "description_id", length = 100)
	private String description;
	
	@ManyToOne
	@JoinColumn(name = "id")
	private Brand brand;
	
	@ManyToOne
	@JoinColumn(name = "id")
	private Category category;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Product(Integer id, String name, Float price, String description, Brand brand, Category category) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.description = description;
		this.brand = brand;
		this.category = category;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
