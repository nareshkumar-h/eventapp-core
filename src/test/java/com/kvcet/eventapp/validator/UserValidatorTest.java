package com.kvcet.eventapp.validator;

import com.kvcet.eventapp.model.User;

public class UserValidatorTest {

	public static void main(String[] args) throws Exception {

		User user = new User();
		user.setName("Naresh");
		user.setEmail("n@gmail.com");
		user.setPassword("pass1234");
		user.setCollegeName("LVEC");
		
		System.out.println(user);
		
		UserValidator.validateUserDetails(user);
	}

}
