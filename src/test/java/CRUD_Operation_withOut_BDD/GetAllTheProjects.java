package CRUD_Operation_withOut_BDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetAllTheProjects {
	@Test
	public void getAllProjectsTest() {

		/* Response rsps = RestAssured.get("http://localhost:8084/projects"); */
		/*
		 * System.out.println(rsps.asString()); System.out.println(rsps.prettyPrint());
		 * System.out.println(rsps.contentType());
		 * System.out.println(rsps.getStatusCode());
		 */
		
		Response rsps = RestAssured.delete("http://localhost:8084/projects/TY_PROJ_603");
		System.out.println(rsps.asString());
		/*
		 * ValidatableResponse vResponse = rsps.then();
		 * vResponse.assertThat().statusCode(200);
		 * vResponse.assertThat().contentType("application/json");
		 * vResponse.log().all();
		 */
	}

}
