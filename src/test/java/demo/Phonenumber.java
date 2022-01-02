package demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Phonenumber {
    //////////10 number 
//	public static void main(String[] args) {
//		
//		Pattern p = Pattern.compile("[6-9][0-9]{9}"); // 10 number(8341208341)
//		Matcher m = p.matcher("8341208341");
//		if (m.find()&& m.group().equals("8341208341")) {
//			System.out.println("matching");
//			
//			
//		}
//		else
//		{
//			System.out.println("not matching");
//
//		}
//		
//
//	}
	
	
//public static void main(String[] args) {
//		
//		Pattern p = Pattern.compile("[0][6-9][0-9]{9}"); // 11 number (08341208341)
//		Matcher m = p.matcher("08341208341");
//		if (m.find()&& m.group().equals("08341208341")) {
//			System.out.println("matching");
//			
//			
//		}
//		else
//		{
//			System.out.println("not matching");
//
//		}
//		
//
//	}
	
	
public static void main(String[] args) {
		
		Pattern p = Pattern.compile("(0|91)?[6-9][0-9]{9}"); // 11 number (08341208341)
		Matcher m = p.matcher("918341208341");
		if (m.find()&& m.group().equals("918341208341")) {
			System.out.println("matching");
			
			
		}
		else
		{
			System.out.println("not matching");

		}
		

	}


}
