package com.hcl.emobileconnect.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.emobileconnect.model.User;

@Repository
public interface UserRepositry extends JpaRepository<User, Long> {
	
	List<User> findByStatus(String status);
}
