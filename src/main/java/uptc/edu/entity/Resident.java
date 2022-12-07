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
}
