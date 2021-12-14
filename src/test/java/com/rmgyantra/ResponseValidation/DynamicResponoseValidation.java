package com.rmgyantra.ResponseValidation;

import static io.restassured.RestAssured.*;

import java.util.List;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class DynamicResponoseValidation {
	@Test
	public void dynamicResponse() {
		// RestAssured
		String expData = "chakri";
		Response rsps = when().get("http://localhost:8084/projects");

		rsps.then().assertThat().statusCode(200);
		List<String> listData = rsps.jsonPath().get("projectName");
		for (String actData : listData) {
			if (actData.equals(expData)) {
				System.out.println(actData + "is present");
				break;

			}
		}

	}

}
