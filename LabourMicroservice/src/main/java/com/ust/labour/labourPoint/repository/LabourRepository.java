package com.ust.labour.labourPoint.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ust.labour.labourPoint.model.Labour;

import jakarta.transaction.Transactional;
@Repository
public interface LabourRepository extends JpaRepository<Labour, Integer> {

	public List<Labour> findBySpecialization(String specialization);

	public List<Labour> findByPayPerDay(double pricePerDay);
	
	//@Transactional
	//@Query("SELECT e from labour e where e.specialization =:specialization")
	//List<Labour> findAllLabourByWork(@Param("specialization") String specialization );

}
