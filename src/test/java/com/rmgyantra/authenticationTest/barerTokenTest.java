package com.rmgyantra.authenticationTest;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class barerTokenTest {
	//RestAssured
	@Test
public void barerToken(){
	given()
	.auth().oauth2("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")
	.when()
	.get("https://api.github.com/user/repos")
	.then()
	.log()
	.all();
	
}
}
