package com.kvcet.eventapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.kvcet.eventapp.exception.DBException;
import com.kvcet.eventapp.model.User;

public class UserDAOImpl implements UserDAO {

	public void register(User user) throws  DBException {
		Connection connection = null;
		PreparedStatement statement = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://101.53.133.59:3306/revature_training_db";
			String username = "rev_user";
			String password = "rev_user";
			connection = DriverManager.getConnection(url, username, password);

			String sql = "INSERT INTO naresh_eventapp_users( NAME,email,PASSWORD,college_name) values ( ?,?,?,?)";
			statement = connection.prepareStatement(sql);
			statement.setString(1, user.getName());
			statement.setString(2, user.getEmail());
			statement.setString(3, user.getPassword());
			statement.setString(4, user.getCollegeName());

			int rows = statement.executeUpdate();
			System.out.println("No of rows inserted:" + rows);

		} catch (SQLException e) {
			e.printStackTrace();
			throw new DBException(e.getMessage(), e );
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				statement.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
