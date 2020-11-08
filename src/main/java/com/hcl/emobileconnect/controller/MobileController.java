package com.hcl.emobileconnect.controller;

import java.util.List;

import com.hcl.emobileconnect.dao.UserDao;
import com.hcl.emobileconnect.model.User;
import com.hcl.emobileconnect.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author Gowthami V
 *
 */
@RestController
@RequestMapping("/api")
public class MobileController {
	
	@Autowired
	UserService userService;

	@Autowired
	UserDao userDao;


	@PostMapping(path = "/users", consumes = "application/json", produces = "application/json")
	public User createUser(@RequestBody User user) {
		return userDao.save(user);
	}

	
	@GetMapping("/user")
	public List<User> list() {
	   return null;
	}
	

}
