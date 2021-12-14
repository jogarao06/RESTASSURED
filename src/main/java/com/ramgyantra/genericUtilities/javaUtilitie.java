package com.ramgyantra.genericUtilities;

import java.util.Random;

public class javaUtilitie {
	
	public int randomnumber() {
		Random rn = new Random();
		int number = rn.nextInt(500);
		return number;
	}

}
