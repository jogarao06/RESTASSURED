package com.ramgyantaPathparameters;

import static io.restassured.RestAssured.when;

import java.util.concurrent.TimeUnit;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class ValidationHamcrestTest {
	// RestAssured
	@Test
	public void hm() {
		when()
		.get("http://localhost:8084/projects")
		.then()
		.assertThat().time(Matchers.lessThan(5000L),TimeUnit.MILLISECONDS)
		.assertThat().body("[0].projectName", Matchers.equalTo("Chakravarthi"))
		.log()
		.all();
		

	}

}
