package com.hcl.emobileconnect.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.hcl.emobileconnect.model.User;

@Repository
@EnableJpaRepositories
public interface UserRepositry extends JpaRepository<User, Long> {
	
	List<User> findByStatus(String status);
}
