package StringClasses;

public class StringBufferClass {
	public static void main(String[] args) {
		StringBuffer sb= new StringBuffer("Wiley");
		StringBuffer sb1= new StringBuffer("Wiley");
		StringBuffer sb2= new StringBuffer("Wiley");
	
		System.out.println(sb.equals(sb1));
		
		String ss="Wiley";
		System.out.println(ss.equals(sb1));// gives false because literal is compared to object
		System.out.println(ss.equals(sb1.toString()));// gives boolean because there are 2 String literals
													// not String objects
		System.out.println(sb);
		
//		sb.append("Edge");
		
		System.out.println(sb);
		sb.insert(5,  "Edge");
		System.out.println(sb);
	}

}
