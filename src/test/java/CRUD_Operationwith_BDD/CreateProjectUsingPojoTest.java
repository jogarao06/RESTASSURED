package CRUD_Operationwith_BDD;

import static io.restassured.RestAssured.given;

import java.util.Random;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import pojoLibrary.pojoLibrary;

public class CreateProjectUsingPojoTest {
	@Test(dataProvider = "creatdata")
	public void creatbyUsingPojo(String createdBy,String projectName,String status,int teamSize) {
		// RestAssured
		Random rm = new Random();
		int RandamNumber = rm.nextInt(500);
		pojoLibrary pj = new pojoLibrary(createdBy,projectName + RandamNumber + " ",status, teamSize);

		given().contentType(ContentType.JSON).body(pj).when().post("http://localhost:8084/addProject").then()
				.assertThat().statusCode(201).log().all();
	}
    @DataProvider
	public Object[][] creatdata() {

		Object[][] myarr = new Object[2][4];
		myarr[0][0] = "Jogarao";
		myarr[0][1] = "SDET-0";
		myarr[0][2] = "completed";
		myarr[0][3] = 10;

		myarr[1][0] = "Jogarao";
		myarr[1][1] = "SDET-22";
		myarr[1][2] = "completed";
		myarr[1][3] = 15;
		return myarr;

	}

}
