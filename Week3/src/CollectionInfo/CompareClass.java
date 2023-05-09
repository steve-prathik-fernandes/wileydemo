package CollectionInfo;

import java.util.TreeSet;

public class CompareClass {
	public static void main(String[] args) {
		TreeSet<String> comp = new TreeSet<>();
		comp.add("Hello");
		comp.add("World");

		System.out.println((comp.first()).compareTo(comp.last()));
	}
}
