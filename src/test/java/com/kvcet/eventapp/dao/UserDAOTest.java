package com.kvcet.eventapp.dao;

import com.kvcet.eventapp.exception.DBException;
import com.kvcet.eventapp.model.User;

public class UserDAOTest {

	public static void main(String[] args) throws DBException {

		User user = new User();
		user.setName("Prabhu");
		user.setEmail("p@gmail.com");
		user.setPassword("pass1234");
		user.setCollegeName("LVEC");
		
		System.out.println(user);
		
		UserDAO userDAO = new UserDAOImpl();
		userDAO.register(user);
	}

}
