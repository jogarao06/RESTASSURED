package com.ramgyantra.genericUtilities;

import java.sql.SQLException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseAPIClass {

	public DataBaseUtilitie dutil = new DataBaseUtilitie();

	@BeforeSuite
	public void ConnectToDb() throws SQLException {
		dutil.connecttoDB();
		
	}

	@AfterSuite
	public void DisconnectToDb() throws SQLException {
		dutil.disconnectDB();
	}
}
