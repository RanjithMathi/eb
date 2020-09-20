package com.first.demo.serviceImpl;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.first.demo.model.Available;
import com.first.demo.model.BookingModel;
import com.first.demo.model.CompanyDetails;
import com.first.demo.model.User;
import com.first.demo.repository.AvailableRepository;
import com.first.demo.repository.BookingModelRepository;
import com.first.demo.repository.CompanyDetailsRepository;
import com.first.demo.repository.LoginRepository;
import com.first.demo.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	LoginRepository loginRepository;
	
	@Autowired
	CompanyDetailsRepository companyDetailsRepository;
	
	@Autowired
	BookingModelRepository bookingModelRepository;
	
	@Autowired
	AvailableRepository availableRepository;
 
	@Override
	public String userCreate(User user) {

		try {
			User userFromDb = loginRepository.findByEmail(user.getEmail());
			if(userFromDb == null) {
			BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
			String encodedPassword = passwordEncoder.encode(user.getPassword());
			System.out.println("Encoded Password is : " + encodedPassword);
			user.setPassword(encodedPassword);
			user = loginRepository.save(user);
			return "user registered successfully";
			}else {
				return "Please provide unique email";
			}
		} catch (Exception e) {
			return e.getMessage();
		}
	}

	@Override
	public boolean loginUser(User user) {
		boolean isPasswordMatch = false;
		try {
			User userFromDb = loginRepository.findByEmail(user.getEmail());
			if(userFromDb != null) {
			BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

			isPasswordMatch = passwordEncoder.matches(user.getPassword(), userFromDb.getPassword());
			System.out.println("Password match : " + isPasswordMatch);
			
			if(userFromDb.getRole().equals(user.getRole()) && isPasswordMatch){
				isPasswordMatch = true;
			}else{
				isPasswordMatch = false;
			}
			
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isPasswordMatch;
	}

	@Override
	public List<User> userRetrivelAll() {

		return loginRepository.findAll();
	}

	@Override
	public User findByUserName(String userName) {

		return loginRepository.findByUserName(userName);
	}


	@Override
	public boolean companyRegister(CompanyDetails companyDetails) {
		
		CompanyDetails com = new CompanyDetails();
		List<CompanyDetails> compList =  companyDetailsRepository.findAll();
		for (int i = 0; i < compList.size(); i++) {
			if(null != compList.get(i).getUpdateUserEmailAddress()){
			if(compList.get(i).getUpdateUserEmailAddress().equals(companyDetails.getUpdateUserEmailAddress())){
				com = compList.get(i);
			}else{
				com = null;
			}
			}else{
				com = null;
			}
		}
		
		CompanyDetails company = new CompanyDetails();
		if(com != null){
			companyDetails.setId(com.getId());
			companyDetailsRepository.save(companyDetails);
		}else{
			company =  companyDetailsRepository.save(companyDetails);
		}
		if(null != company){
			return true;
		}else{
			return false;
		}
		 
	}

	@Override
	public CompanyDetails getCompanybyUserEmail(String emailAddres) {
//		CompanyDetails companyDetails = new CompanyDetails();
//		List<CompanyDetails> compList =  companyDetailsRepository.findAll();
//		for (int i = 0; i < compList.size(); i++) {
//			if(null != compList.get(i).getUpdateUserEmailAddress()){
//				String getUpdateUserEmailAddress = compList.get(i).getUpdateUserEmailAddress();
//			if(getUpdateUserEmailAddress.equals(emailAddres)){
//				companyDetails = compList.get(i);
//			}
//			else{
//				companyDetails = null;	
//			}
//			}else{
//				companyDetails = null;	
//			}
//		}
		return companyDetailsRepository.findByUpdateUserEmailAddress(emailAddres);
	}

	@Override
	public boolean newBooking(BookingModel bookingModel) {
		Random random = new Random();
		String bookingId = String.format("%04d", random.nextInt(10000));
		bookingModel.setBookingId(bookingId);
		BookingModel bookingModel1 = bookingModelRepository.save(bookingModel);
		if(bookingModel1 != null)
		return true;
		else
		return false;
	}

	@Override
	public List<BookingModel> allBooking() {
		return bookingModelRepository.findAll();
	}

	@Override
	public BookingModel getBookingById(String bookingId) {
		return bookingModelRepository.findByBookingId(bookingId);
	}

	@Override
	public List<BookingModel> getBookingByBookingDate(String bookingMonth) {
		Integer bookingMonthIn = Integer.parseInt(bookingMonth);
		return bookingModelRepository.getBookingByBookingDate(bookingMonthIn);
	}

	
	@Override
	public List<BookingModel> getBookingByBookingDateFree(String bookingMonth) {
		Integer bookingMonthIn = Integer.parseInt(bookingMonth);
		return bookingModelRepository.getBookingByBookingDateFree(bookingMonthIn);
	}

	@Override
	public boolean newPlantAvail(Available available) {
		Available bookingModel1 = availableRepository.save(available);
		if(bookingModel1 != null)
		return true;
		else
		return false;
	}
	
	@Override
	public List<Available> allAvailable() {
		return availableRepository.findAll();
	}

	@Override
	public int getAvailable() {
		return availableRepository.getAvailable();
	}
	

}
