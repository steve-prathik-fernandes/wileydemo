package CollectionInfo;

import java.util.TreeSet;

public class SetHeadSet {
	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>();

		ts.add("h");
		ts.add("b");
		ts.add("b");
		ts.add("w");
		ts.add("a");

		System.out.println(ts);
		System.out.println(ts.first());
		System.out.println(ts.last());
		System.out.println(ts.headSet("h"));//<obj1
		System.out.println(ts.tailSet("h"));//>obj2
		System.out.println(ts.subSet("b","w"));
		
	}

}
