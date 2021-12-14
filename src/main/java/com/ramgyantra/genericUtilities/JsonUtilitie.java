package com.ramgyantra.genericUtilities;

import io.restassured.response.Response;

public class JsonUtilitie {
//RestAssured
	public String jsonPathFinder(String jsonPath, Response rsps) {
		String text = rsps.jsonPath().get(jsonPath);
		return text;
	}

}
