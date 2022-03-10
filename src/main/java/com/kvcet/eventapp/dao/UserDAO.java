package com.kvcet.eventapp.dao;

import java.util.List;

import com.kvcet.eventapp.exception.DBException;
import com.kvcet.eventapp.model.User;

public interface UserDAO {

	void register(User user) throws DBException;
	
	List<User> findAll() throws DBException;
}
