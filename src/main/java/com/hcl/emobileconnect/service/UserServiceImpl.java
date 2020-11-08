package com.hcl.emobileconnect.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.emobileconnect.dao.UserRepositry;
import com.hcl.emobileconnect.exception.UserNotFoundException;
import com.hcl.emobileconnect.model.User;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepositry userRepositry;

	public List<User> getAllUser() {
		return userRepositry.findAll();
	}
	
	/**
	 * @param requestId
	 * @return Status String
	 */
	@Override
	public String getRequestStatus(Long requestId) {
		User user = userRepositry.getOne(requestId);
		if(user != null) {
			return user.getStatus().name();
		}else {
			throw new UserNotFoundException("No Record Found");
		}
	}
	
	/**
	 * 
	 * @param requestId
	 * @return
	 */
	@Override
	public User getUserDetails(Long requestId) {
		User user = userRepositry.getOne(requestId);
		if(user != null) {
			return user;
		}else {
			throw new UserNotFoundException("No Record Found");
		}
	}

}
