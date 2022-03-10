package com.kvcet.eventapp.model;

public class UserTest {

	public static void main(String[] args) {

		User user = new User();
		user.setId(1);
		user.setName("Naresh");
		user.setEmail("n@gmail.com");
		user.setPassword("pass1234");
		user.setCollegeName("LVEC");
		
		System.out.println(user);
	}

}
