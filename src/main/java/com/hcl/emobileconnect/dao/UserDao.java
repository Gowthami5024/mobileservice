package com.hcl.emobileconnect.dao;

import com.hcl.emobileconnect.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Integer> {
}
