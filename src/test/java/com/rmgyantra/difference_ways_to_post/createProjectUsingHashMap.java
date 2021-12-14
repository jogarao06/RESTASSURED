package com.rmgyantra.difference_ways_to_post;

import static io.restassured.RestAssured.*;

import java.util.HashMap;
import java.util.Random;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class createProjectUsingHashMap {
//RestAssured
	@Test
	public void CreateByhashmap() {
		HashMap jobj = new HashMap();
		Random ran = new Random();
		int RandomNumber = ran.nextInt(2000);
		jobj.put("createdBy", "Chaithu");
		jobj.put("projectName", "TYSS-12456"+RandomNumber);
		jobj.put("status", "completed");
		jobj.put("teamSize", 12);
		
		given()
		.contentType(ContentType.JSON)
		.body(jobj)
		.when()
		.post("http://localhost:8084/addProject")
		.then()
		.assertThat()
		.statusCode(201).log().all();
	}
}
