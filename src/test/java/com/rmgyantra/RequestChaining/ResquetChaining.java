package com.rmgyantra.RequestChaining;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class ResquetChaining {
//RestAssured
	@Test
	public void requestChaining() {
		Response rsps = given().get("http://localhost:8084/projects");
		String projectId = rsps.jsonPath().get("[1].projectId");
		System.out.println(projectId);
		given()
		.pathParam("ProId", projectId)
		.when()
		.delete("http://localhost:8084/projects/{ProId}")
		.then()
		.log()
		.all();

	}
}
