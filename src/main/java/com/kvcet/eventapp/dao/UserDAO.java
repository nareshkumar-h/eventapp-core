package com.kvcet.eventapp.dao;

import java.sql.SQLException;

import com.kvcet.eventapp.exception.DBException;
import com.kvcet.eventapp.model.User;

public interface UserDAO {

	void register(User user) throws DBException;
}
