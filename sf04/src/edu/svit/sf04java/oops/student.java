package edu.svit.sf04java.oops;

public class student {
	private int id;
	private String name;
	private String department;
	private String location;
	
	//default constructor
	public student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	//parametrized constructor
	public student(int id, String name, String department, String location) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.location = location;
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
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", department=" + department + ", location=" + location + "]";
	}
	
	
	
	
	

}

