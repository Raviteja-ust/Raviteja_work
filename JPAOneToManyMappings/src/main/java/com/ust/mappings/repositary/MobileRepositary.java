package com.ust.mappings.repositary;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ust.mappings.entity.Mobile;

@Repository
public interface MobileRepositary extends JpaRepository<Mobile, Integer>{
	
	List<Mobile> findByMobileName(String name);
	
	

}
