package Patterns;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexBasics {
	public static void main(String[] args) {
//		String re="..";
//		String re="\\w\\w\\w";//(a-z,A-Z,0-9,_)
//		String re="\\S\\s";
		String re = "\\d\\d\\D";
		String text = "99@";

		Pattern pattern = Pattern.compile(re);// creates a regular expression
		Matcher mt = pattern.matcher(text); // checks for the text to match with regular expression

		boolean res = mt.matches();
		System.out.println(res);
	}
}
