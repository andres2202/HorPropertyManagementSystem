package uptc.edu.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "resident")
public class Resident implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="id")
	private String id;
	
	@Column
	private String name;
	
	@Column(name="surname")
	private String surname;
	
	@Column(name="cellPhone")
	private String cellPhone;
	
	@Column(name="block")
	private char block;
	
	@Column(name="")
	private String apartment;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getCellPhone() {
		return cellPhone;
	}

	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}

	public char getBlock() {
		return block;
	}

	public void setBlock(char block) {
		this.block = block;
	}

	public String getApartment() {
		return apartment;
	}

	public void setApartment(String apartment) {
		this.apartment = apartment;
	}
	
	
}
