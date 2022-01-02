package com.ramgyantaEndToendTest;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.ramgyantra.genericUtilities.BaseAPIClass;
import com.ramgyantra.genericUtilities.EndPoints;
import com.ramgyantra.genericUtilities.JsonUtilitie;
import com.ramgyantra.genericUtilities.javaUtilitie;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojoLibrary.pojoLibrary;

public class EndToEndTest extends BaseAPIClass implements EndPoints {
	WebDriver driver;

	@Test
	public void post() throws SQLException {
		javaUtilitie Javautil = new javaUtilitie();
		pojoLibrary pj = new pojoLibrary("Chakravarthy", "TYSS10" + Javautil.randomnumber(), "Completed", 15);

		baseURI = "http://localhost";
		port = 8084;

		Response rsps = given().contentType(ContentType.JSON).body(pj).when().post(EndPoints.createProj);
		JsonUtilitie jutil = new JsonUtilitie();
		String ProjectId = jutil.jsonPathFinder("projectId", rsps);

		Response rsps1 = given().pathParam("ProId", ProjectId).when().get("http://localhost:8084/projects/{ProID}");
		String projectName = jutil.jsonPathFinder("projectName", rsps1);
		ResultSet reslt = dutil.ExecuteQuery("select* from project");
		
		while (reslt.next()) {
			if (reslt.getString(4).equals(projectName)) {
				System.out.println(projectName + "is matching");

			}
		}

	}
}
