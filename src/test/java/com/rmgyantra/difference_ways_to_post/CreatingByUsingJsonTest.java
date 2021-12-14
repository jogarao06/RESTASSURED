package com.rmgyantra.difference_ways_to_post;

import static io.restassured.RestAssured.*;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class CreatingByUsingJsonTest {
	@Test
public void creatTest() {
//	RestAssured
	File fis = new File("./newProject.json");
	given()
	.contentType(ContentType.JSON)
	.body(fis)
	.when()
	.post("http://localhost:8084/addProject")
	.then()
	.assertThat()
	.statusCode(201)
	.log().all();
	
	
}
}
