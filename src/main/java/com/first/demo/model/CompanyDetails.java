package com.first.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class CompanyDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nameOfCompany;
	private String address;
	private String gstNumber;
	private String contactNumber;
	private String emailAddress;
	private String updateUserEmailAddress;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNameOfCompany() {
		return nameOfCompany;
	}
	public void setNameOfCompany(String nameOfCompany) {
		this.nameOfCompany = nameOfCompany;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGstNumber() {
		return gstNumber;
	}
	public void setGstNumber(String gstNumber) {
		this.gstNumber = gstNumber;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getUpdateUserEmailAddress() {
		return updateUserEmailAddress;
	}
	public void setUpdateUserEmailAddress(String updateUserEmailAddress) {
		this.updateUserEmailAddress = updateUserEmailAddress;
	}
	
}


