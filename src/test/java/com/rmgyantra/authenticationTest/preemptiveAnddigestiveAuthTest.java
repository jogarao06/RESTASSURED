package com.rmgyantra.authenticationTest;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class preemptiveAnddigestiveAuthTest {
//RestAssured
	@Test
	public void preemptive() {
		given()
		.auth()
		.preemptive().basic("rmgyantra","ramgy@9999")
		.when()
		.get("http://localhost:8084/login")
		.then()
		.assertThat()
		.statusCode(202);
		
	}
	@Test
	public void digestive() {
		given()
		.auth()
		.digest("rmgyantra","ramgy@9999")
		.when()
		.get("http://localhost:8084/login")
		.then()
		.assertThat()
		.statusCode(202);
	}
	
}
