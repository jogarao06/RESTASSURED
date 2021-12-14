package com.ramgyantaPathparameters;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class pathParameter {
//RestAssured
	@Test
	public void PathParameterTest() {
		given()
		.contentType(ContentType.JSON)
		.pathParam("ProId","projectId")
		.when()
		.get("http://localhost:8084/projects/{ProId}")
		.then()
		.log()
		.all();

	}
	@Test
	public void PathParameterUpdate() {
		given()
		.contentType(ContentType.JSON)
		.pathParam("ProId","projectId")
		.when()
		.post("http://localhost:8084/addProject/{ProId}")
		.then()
		.log()
		.all();
		
	}
	@Test
	public void PthaParameterDelete() {
		given()
		.contentType(ContentType.JSON)
		.pathParam("ProId","TY_PROJ_1004")
		.when()
		.delete("http://localhost:8084/projects/{ProId}")
		.then()
		.log()
		.all();

		
	}

}
