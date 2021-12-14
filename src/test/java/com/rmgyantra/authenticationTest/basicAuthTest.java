package com.rmgyantra.authenticationTest;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class basicAuthTest {
	//RestAssured
	@Test
	public void basicAuth() {
		given()
		.auth().basic("rmgyantra", "ramgy@9999")
		.when()
		.get("http://localhost:8084/login")
		.then()
		.log()
		.all();
		
	}
}
