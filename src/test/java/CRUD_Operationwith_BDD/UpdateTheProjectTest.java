package CRUD_Operationwith_BDD;

import static  io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class UpdateTheProjectTest {
	//RestAssured
	@Test
	public void PutMethod() {
		JSONObject jobj = new JSONObject();
		jobj.put("createdBy", "vamshi");
		jobj.put("projectName", "TYSS-5611");
		jobj.put("status", "completed");
		jobj.put("teamSize", 11);
		
		given().contentType(ContentType.JSON).body(jobj).when().put("http://localhost:8084/projects/TY_PROJ_1002").then()
		.assertThat().statusCode(200).log().all();
	}
	
}
