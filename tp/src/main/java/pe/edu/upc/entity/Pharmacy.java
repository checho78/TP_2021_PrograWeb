package pe.edu.upc.entity;
import java.util.Date;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name= "Pharmacies")
public class Pharmacy {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "name", length = 50, nullable = false)
	private String name;
	
	@Column(name = "name", length = 50, nullable = false)
	private String address;
	
	@Column(name = "district", length = 30, nullable = false)
	private String district;
	
	@Column(name = "password", length = 20, nullable = false)
	private String password;
	
	@Column(name = "description", length = 100, nullable = false)
	private String description;
	
	@Column(name = "start_hour")
	@Temporal(TemporalType.TIME) 
	private Date startHour;
	
	@Column(name = "end_hour")
	@Temporal(TemporalType.TIME) 
	private Date endHour;
	
	@Column(name = "ruc", length = 100 , nullable= false)
	private Long ruc ;
	
	

	public Pharmacy(int id, String name, String address, String district, String password, String description,
			Date startHour, Date endHour, Long ruc) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.district = district;
		this.password = password;
		this.description = description;
		this.startHour = startHour;
		this.endHour = endHour;
		this.ruc = ruc;
	}

	public Pharmacy() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getStartHour() {
		return startHour;
	}

	public void setStartHour(Date startHour) {
		this.startHour = startHour;
	}

	public Date getEndHour() {
		return endHour;
	}

	public void setEndHour(Date endHour) {
		this.endHour = endHour;
	}

	public Long getRuc() {
		return ruc;
	}

	public void setRuc(Long ruc) {
		this.ruc = ruc;
	}
	
	

}
