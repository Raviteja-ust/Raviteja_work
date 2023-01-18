package com.ust.sec.repositary;

import com.ust.sec.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepositary extends JpaRepository<Student, Integer> {
}
