package CollectionInfo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetClass {
	
	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<>();// Not sorted, only 1st occurrence
		Set<String> ts=new TreeSet<>(); // Sorted
		Set<String>lhs=new LinkedHashSet<>();
		
		
		hs.add("Java");
		hs.add("Java");
		hs.add("Java");
		hs.add("Java");
		hs.add("Java");
		hs.add("Java");
		hs.add("java");
		hs.add("python");
		hs.add("Javascript");
		hs.add("mysql");
		
		System.out.println("HashSet"+hs);
		ts.add("Java");
		ts.add("Java");
		ts.add("Java");
		ts.add("Java");
		ts.add("Java");
		ts.add("Java");
		ts.add("java");
		ts.add("python");
		ts.add("Javascript");
		ts.add("mysql");
		
		System.out.println("TreeSet"+ts);
		
		lhs.add("Java");
		lhs.add("Java");
		lhs.add("Java");
		lhs.add("Java");
		lhs.add("Java");
		lhs.add("Java");
		lhs.add("java");
		lhs.add("python");
		lhs.add("Javascript");
		lhs.add("mysql");
		System.out.println("LinkedHashSet"+lhs);
	}

}
