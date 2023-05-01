package Patterns;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatch {
public static void main(String[] args) {
	String re="^[a|A]gent (\\d{3,4})$";
	Pattern pattern=Pattern.compile(re);
	Matcher matcher=pattern.matcher("agent 0007");
	
	
//	boolean find=matcher.find();
//	boolean match=matcher.matches();
//	System.out.println("Found : "+find);
//	System.out.println("Match : "+match);
	
	if(matcher.find()) {
		System.out.println("Group:"+matcher.group());
		System.out.println("Group:"+matcher.group(1));
	}
}
}
