package Patterns;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CreditCardMatch {
public static void main(String[] args) {
	String cardNumber="4520-4678-5623-0200";
	
	String re="\\d{4}-\\d{4}-\\d{4}-";
	Pattern pattern=Pattern.compile(re);
	Matcher matcher=pattern.matcher(cardNumber);
	
	
		String s=matcher.replaceAll("xxxx-xxxx-xxxx-");
		System.out.println(s);

	
	
	
}
}
