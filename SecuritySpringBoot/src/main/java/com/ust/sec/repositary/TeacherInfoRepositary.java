package com.ust.sec.repositary;

import com.ust.sec.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Component
public interface TeacherInfoRepositary extends JpaRepository<Teacher,Integer> {
    Optional<Teacher> findByName(String username);
}
