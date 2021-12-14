package CRUD_Operation_withOut_BDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class creatprojectTest {
	@Test
	public void creat() {
		JSONObject jobj = new JSONObject();
		jobj.put("createdBy", "Chakravarthi");
		jobj.put("projectName", "TYSS-56");
		jobj.put("status", "completed");
		jobj.put("teamSize", 10);

		RequestSpecification reqSep = RestAssured.given();
		reqSep.contentType(ContentType.JSON);
		reqSep.body(jobj);

		Response rsps = reqSep.post("http://localhost:8084/addProject");
		ValidatableResponse vResponse = rsps.then();
		vResponse.assertThat().statusCode(201);
		vResponse.log().all();
	}

}
