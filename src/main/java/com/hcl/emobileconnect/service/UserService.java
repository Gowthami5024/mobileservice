package com.hcl.emobileconnect.service;

import java.util.List;

import com.hcl.emobileconnect.model.User;

/**
 * 
 * @author Gowthami V
 *
 */
public interface UserService {
	
	/**
	 * 
	 * @return
	 */
	List<User> getAllUser();
	
	/**
	 * 
	 * @param requestId
	 * @return
	 */
	String getRequestStatus(Long requestId);
	

	User addUser(User user);
	
	/**
	 * 
	 * @param user
	 * @return
	 */
	User getUserDetails(Long requestId);
	
	

}
