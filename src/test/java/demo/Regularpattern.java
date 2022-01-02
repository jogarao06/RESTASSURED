package demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regularpattern {

//	public static void main(String[] args) {
//		Pattern p = Pattern.compile("aba");
//		Matcher m = p.matcher("aba");
//		while (m.find()) {
//			System.out.println(m.start() + "" + m.end() + " " + m.group());
//
//		}
//
//	}
	
//	public static void main(String[] args) {
//		Pattern p = Pattern.compile("[a+zA+Z0-9]");
//		Matcher m = p.matcher("abCD96Ab");
//		while (m.find()) {
//			System.out.println(m.start() + " " + m.group());
//
//		}
//
//	}
	
	 
	
//	public static void main(String[] args) {
//		Pattern p = Pattern.compile("\\W");
//		Matcher m = p.matcher("abCD96$#Ab");
//		while (m.find()) {
//			System.out.println(m.start() + " " + m.group());
//
//		}
//
//	}
	
//	public static void main(String[] args) {
//		int count=0;
//		Pattern p = Pattern.compile("[a-zA-Z0-9\\W]");
//		Matcher m = p.matcher("abCD96$#Ab");
//		while (m.find()) {
//			System.out.println(m.start() + " " + m.group());
//
//		}
//		System.out.println(count);
//
//	}

	


	public static void main(String[] args) {
		int count=0;
		Pattern p = Pattern.compile("a?");// a a+ a* a?
		Matcher m = p.matcher("abbaabba");
		while (m.find()) {
			System.out.println(m.start() + " " + m.group());

		}
		System.out.println(count);

	}
	
	
	
	
	

}


