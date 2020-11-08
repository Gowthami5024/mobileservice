package com.hcl.emobileconnect.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.emobileconnect.model.User;
import com.hcl.emobileconnect.service.UserService;

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
	
	@GetMapping("/user")
	public List<User> list() {
	   return null;
	}
	

}
