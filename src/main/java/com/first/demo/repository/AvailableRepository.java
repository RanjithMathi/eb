package com.first.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.first.demo.model.Available;

public interface AvailableRepository extends JpaRepository<Available, Long>{

	@Query(value="SELECT SUM(qty) FROM available",nativeQuery=true)
	int getAvailable();
}
