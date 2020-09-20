package com.first.demo.service;

import java.util.List;

import com.first.demo.model.Available;
import com.first.demo.model.BookingModel;
import com.first.demo.model.CompanyDetails;
import com.first.demo.model.User;

public interface LoginService {

	String userCreate(User user);

	List<User> userRetrivelAll();

	User findByUserName(String userName);


	boolean loginUser(User user);

	boolean companyRegister(CompanyDetails companyDetails);

	CompanyDetails getCompanybyUserEmail(String emailAddres);

	boolean newBooking(BookingModel bookingModel);

	List<BookingModel> allBooking();

	BookingModel getBookingById(String bookingId);

	List<BookingModel> getBookingByBookingDate(String bookingMonth);
	
	List<BookingModel> getBookingByBookingDateFree(String bookingMonth);

	boolean newPlantAvail(Available available);
	
	public List<Available> allAvailable();
	
	int getAvailable();

}
