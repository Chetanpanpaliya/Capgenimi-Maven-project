package org.tutorials.NEWBEGNING;



//CourseID, CourseName, CoursePrice, courseDuration 




import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="Employee_details")
public class Course {
	// id, name, city
	@Id
	private int Courseid;
	private String Coursename;
	private String Coursetime;
	private int Courseprice;
	
	
	// parameterized constructor
	public Course(int Courseid, String Coursename, String Coursetime, int Courseprice) {
		super();
		this.Courseid = Courseid;
		this.Coursename = Coursename;
		this.Coursetime = Coursetime;
	}
	// zero-parameterized constructor


	public Course() {
		super();
	}
	// Setter & Getter methods


	public int getCourseId() {
		return Courseid;
	}


	public void setCourseId(int Courseid) {
		this.Courseid = Courseid;
	}


	public String getCourseName() {
		return Coursename;
	}


	public void setName(String Coursename) {
		this.Coursename = Coursename;
	}


	public String getCoursetime() {
		return Coursetime;
	}


	public void setCity(String Coursetime) {
		this.Coursetime = Coursetime;
	}
	
	public int getCoursePrice() {
		return Courseprice;
	}


	public void setCoursePrice(int Courseprice) {
		this.Courseprice = Courseprice;
	}

	

}
