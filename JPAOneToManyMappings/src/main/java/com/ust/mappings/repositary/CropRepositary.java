package com.ust.mappings.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ust.mappings.entity.Crop;

@Repository
public interface CropRepositary extends JpaRepository<Crop, Integer> {

}
