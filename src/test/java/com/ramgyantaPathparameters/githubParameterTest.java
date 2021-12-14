package com.ramgyantaPathparameters;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class githubParameterTest {
	// RestAssured
	@Test
	public void gitpathparameter() {
		given()
		.pathParam("username","Gattupellychakravarthi")
		.queryParam("sort","created")
		.when()
		.get("https://api.github.com/users/{username}/repos")
		.then()
		.log().all();
		
		

	}

}
