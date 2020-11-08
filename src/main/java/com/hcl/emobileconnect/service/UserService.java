package com.hcl.emobileconnect.service;

import java.util.List;

import com.hcl.emobileconnect.model.User;

/**
 * 
 * @author Gowthami V
 *
 */
public interface UserService {
	
	List<User> getAllUser();
	
	/**
	 * 
	 * @param requestId
	 * @return
	 */
	String getRequestStatus(Long requestId);
	
	/**
	 * 
	 * @return
	 */
	List<User> getAllUserList();
	
	

}
