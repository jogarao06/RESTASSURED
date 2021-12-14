package com.rmgyantra.authenticationTest;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class oAuthTest {
	@Test
	public void oAuth() {
		//RestAssured
		Response rsps = given()
		.formParam("client_id", "chakravarthi")
		.formParam("client_secret", "1ee4034b9597be86a2a49e8bf774d5f1")
		.formParam("grant_type","client_credentials")
		.formParam("redirect_uri","https://example.com")
		.when()
		.post("http://coop.apps.symfonycasts.com/token");
		System.out.println(rsps.prettyPrint());
		String token = rsps.jsonPath().get("access_token");
		System.out.println(token);
		
		given()
		.auth().oauth2(token)
		.pathParam("USER_ID","2530")		
		.when()
		.post("http://coop.apps.symfonycasts.com/api/{USER_ID}/eggs-count")
		.then()
		.log()
		.all();
	}

}
