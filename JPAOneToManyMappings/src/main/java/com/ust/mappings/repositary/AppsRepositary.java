package com.ust.mappings.repositary;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ust.mappings.entity.Apps;

@Repository
public interface AppsRepositary extends JpaRepository<Apps, Integer> {
	
	Set<Apps> findById(int mobileId);
	
	

}
