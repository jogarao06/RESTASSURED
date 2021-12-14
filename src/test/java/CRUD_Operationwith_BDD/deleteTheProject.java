package CRUD_Operationwith_BDD;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class deleteTheProject {
	@Test
	public void DeleteTheProject() {
		when()
		.delete("http://localhost:8084/projects/TY_PROJ_605")
		.then()
		.assertThat()
		.statusCode(204)
		.and()
	    .contentType(ContentType.JSON)
	    .log()
	    .all();
	}

}
