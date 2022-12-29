package com.user.userMicroservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.user.userMicroservice.model.User;
@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

	@Query("SELECT e from User e where e.workDetails =:workDetails")
	List<User> findAllUserByWork(@Param("workDetails") String workDetails );

}
