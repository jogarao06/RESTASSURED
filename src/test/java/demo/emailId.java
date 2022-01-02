package demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class emailId {

	public static void main(String[] args) {

		Pattern p = Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9\\W]*[.a-zA-Z]+");
		Matcher m = p.matcher("jaaoga123123@gmail.in");
		if (m.find() && m.group().equals("jaaoga123123@gmail.in")) {
			System.out.println("matching");

		} else {
			System.out.println("not matching");

		}

	}

}
