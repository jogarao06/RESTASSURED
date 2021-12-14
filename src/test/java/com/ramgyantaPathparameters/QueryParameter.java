package com.ramgyantaPathparameters;
import static io.restassured.RestAssured.*;

public class QueryParameter {
	//RestAssured
	
	public void queryParameter() {
		given()
		.queryParam("page","2")
		.when()
		.get("http://reqres.in/api/users")
		.then()
		.log()
		.all();
	}
}
