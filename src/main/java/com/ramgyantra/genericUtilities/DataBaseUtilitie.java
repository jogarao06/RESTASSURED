package com.ramgyantra.genericUtilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class DataBaseUtilitie {
	public Connection con;
	public ResultSet reslt;

	public void connecttoDB() throws SQLException {
		Driver dref = new Driver();
		DriverManager.registerDriver(dref);
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projects", "root", "root");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

	public void disconnectDB() throws SQLException {
		con.close();

	}
	public ResultSet ExecuteQuery(String query) throws SQLException {
		Statement state = con.createStatement();
		 reslt = state.executeQuery(query);
		return reslt;
	}

}
