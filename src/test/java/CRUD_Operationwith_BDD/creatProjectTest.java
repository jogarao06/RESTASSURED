package CRUD_Operationwith_BDD;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class creatProjectTest {
	@Test
	private void creatProject() {

		JSONObject jobj = new JSONObject();
		jobj.put("createdBy", "Chakravarthi");
		jobj.put("projectName", "TYSS-123456");
		jobj.put("status", "completed");
		jobj.put("teamSize", 5);

		given().contentType(ContentType.JSON).body(jobj).when().post("http://localhost:8084/addProject").then()
				.assertThat().statusCode(201).log().all();

	}

}
