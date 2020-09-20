/**
 * 
 */
package com.first.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.first.demo.model.CompanyDetails;

@Repository
public interface CompanyDetailsRepository extends JpaRepository<CompanyDetails, Long>{
	
	@Query(value="SELECT * FROM ebashmngmnt.company_details where update_user_email_address  =?1",nativeQuery=true)
	CompanyDetails findByUpdateUserEmailAddress(String updateUserEmailAddress);
}
