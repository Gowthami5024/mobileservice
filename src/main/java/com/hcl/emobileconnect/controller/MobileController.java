package com.hcl.emobileconnect.controller;

import java.util.List;

import com.hcl.emobileconnect.model.User;
import com.hcl.emobileconnect.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
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


	@PostMapping(path = "/users")
	public User createUser(@RequestBody User user) {
		return userService.addUser(user);
	}
	
		
	@GetMapping(value="/userStatus/{id}",  consumes = "application/json", produces = "application/json")
	@ResponseBody
	public String getRequestStatus(@PathVariable Long id){
		return userService.getRequestStatus(id);
	}
	
	@GetMapping(value="/admin/all", consumes = "application/json", produces = "application/json")
	public @ResponseBody List<User> getAllUser(){
		return userService.getAllUser();
	}
	
	@GetMapping(value="/admin/{id}", consumes = "application/json", produces = "application/json")
	public @ResponseBody User getUser(@PathVariable Long id){
		return userService.getUserDetails(id);
	}

}
