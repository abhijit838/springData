package spring.data.jpa.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "companyDetail")
public class CompanyDetail implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "companyDetailId")
	@GeneratedValue
	private int id;
	
	@Column(name = "employeeStrength")
	private int employeeStrength;
	@Column(name = "notes")
	private String notes;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getEmployeeStrength() {
		return employeeStrength;
	}
	public void setEmployeeStrength(int employeeStrength) {
		this.employeeStrength = employeeStrength;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	
}
