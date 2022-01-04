package javax.persistence;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="Employee_details")
public class Student {
	// id, name, city
	@Id
	private int id;
	private String name;
	private String city;
	
	
	// parameterized constructor
	public Student(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}
	// zero-parameterized constructor


	public Student() {
		super();
	}
	// Setter & Getter methods


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


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}
	

}