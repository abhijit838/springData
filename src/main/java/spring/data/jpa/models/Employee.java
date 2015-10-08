package spring.data.jpa.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Employee {
	
	@Id
	@Column(name = "id")
	private Integer empId;
	@Column(name = "firstName")
	private String firstName;
	@Column(name = "lastname")
	private String lastName;
	@ManyToMany
	@JoinTable(name = "Address", 
	joinColumns = 
		@JoinColumn(name = "id", referencedColumnName = "id"),
	inverseJoinColumns = 
		@JoinColumn(name = "id", referencedColumnName = "id"))
	private List<Address> address;
	
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public List<Address> getAddress() {
		return address;
	}
	public void setAddress(List<Address> address) {
		this.address = address;
	}
	
	
	
}
