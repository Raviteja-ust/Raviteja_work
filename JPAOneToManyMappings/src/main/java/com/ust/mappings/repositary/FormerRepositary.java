package com.ust.mappings.repositary;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ust.mappings.entity.Former;

@Repository
public interface FormerRepositary extends JpaRepository<Former, Integer>{
	

	public List<Former> findByFormerId(int id);

}
