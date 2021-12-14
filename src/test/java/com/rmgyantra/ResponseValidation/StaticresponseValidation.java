package com.rmgyantra.ResponseValidation;

import static io.restassured.RestAssured.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class StaticresponseValidation {
//RestAssured
	@Test
	public void StaticResponse() {
		String expData = "Komali";
		Response rsps = when().get("http://localhost:8084/projects");
		rsps.then().assertThat().statusCode(200);
		String actData = rsps.jsonPath().get("[0].projectName");
		System.out.println(actData);
		Assert.assertEquals(actData, expData);
	}
}
