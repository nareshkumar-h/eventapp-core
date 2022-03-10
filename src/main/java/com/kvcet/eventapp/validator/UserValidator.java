package com.kvcet.eventapp.validator;

import com.kvcet.eventapp.model.User;

public class UserValidator {

	/**
	 * This method is used to validate User details
	 * @param user
	 * @throws Exception
	 */
	public static void validateUserDetails(User user) throws Exception {
		if(user.getName() ==null) {
			throw new Exception("Invalid Name");
		}
		else if (user.getEmail() == null ) {
			throw new Exception("Invalid Email");
		}
		else if (user.getPassword() == null) {
			throw new Exception("Invalid Password");
		}
		else if (user.getPassword().length() < 8) {
			throw new Exception("Password must have minimum 8 characters");
		}
		else if (user.getCollegeName()  == null) {
			throw new Exception("Invalid College Name");
		}
		
		System.out.println("Validation Passed");
	}
}
