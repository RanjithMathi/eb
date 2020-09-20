package com.first.demo.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class BookingModel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String qty;
	private Date bookingDate;
	private Date bookingTimeFrom;
	private Date bookingTimeTo;
	private String bookingId;
	private String updateMailAddress;
	private Boolean isPaidUser;
	
	
	public String getUpdateMailAddress() {
		return updateMailAddress;
	}
	public void setUpdateMailAddress(String updateMailAddress) {
		this.updateMailAddress = updateMailAddress;
	}
	public String getQty() {
		return qty;
	}
	public void setQty(String qty) {
		this.qty = qty;
	}
	public Date getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}
	public Date getBookingTimeFrom() {
		return bookingTimeFrom;
	}
	public void setBookingTimeFrom(Date bookingTimeFrom) {
		this.bookingTimeFrom = bookingTimeFrom;
	}
	public Date getBookingTimeTo() {
		return bookingTimeTo;
	}
	public void setBookingTimeTo(Date bookingTimeTo) {
		this.bookingTimeTo = bookingTimeTo;
	}
	public String getBookingId() {
		return bookingId;
	}
	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}
	public Boolean getIsPaidUser() {
		return isPaidUser;
	}
	public void setIsPaidUser(Boolean isPaidUser) {
		this.isPaidUser = isPaidUser;
	}
	
	
}
