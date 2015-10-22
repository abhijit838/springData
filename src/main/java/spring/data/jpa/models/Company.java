package spring.data.jpa.models;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
@Entity
@Table(name = "company")
public class Company implements Serializable {
	
	@Id
	@Column(name = "companyId")
	@GeneratedValue
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@OneToOne(cascade = CascadeType.MERGE)
	@PrimaryKeyJoinColumn
	private CompanyDetail companyDetails;
	
	@ManyToOne
	@JoinColumn(name = "companyStatusId")
	private CompanyStatus companyStatus;
	
	@OneToMany(mappedBy = "company", cascade = CascadeType.ALL)
	private Set<Contact> contact;
	
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
	public CompanyDetail getCompanyDetails() {
		return companyDetails;
	}
	public void setCompanyDetails(CompanyDetail companyDetails) {
		this.companyDetails = companyDetails;
	}
	public CompanyStatus getCompanyStatus() {
		return companyStatus;
	}
	public void setCompanyStatus(CompanyStatus companyStatus) {
		this.companyStatus = companyStatus;
	}
	public Set<Contact> getContact() {
		return contact;
	}
	public void setContact(Set<Contact> contact) {
		this.contact = contact;
	}
	
	
	
	

}
