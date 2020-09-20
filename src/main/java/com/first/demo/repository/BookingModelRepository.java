package com.first.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.first.demo.model.BookingModel;
	 
@Repository
public interface BookingModelRepository extends JpaRepository<BookingModel, Long>{

	BookingModel findByBookingId(String bookingId);

	@Query(value="SELECT * FROM ebashmngmnt.booking_model where MONTH(booking_date)  =?1 and is_paid_user = true",nativeQuery=true)
	List<BookingModel> getBookingByBookingDate(int bookingMonth);
	
	@Query(value="SELECT * FROM ebashmngmnt.booking_model where MONTH(booking_date)  =?1 and is_paid_user = false",nativeQuery=true)
	List<BookingModel> getBookingByBookingDateFree(int bookingMonth);

}
