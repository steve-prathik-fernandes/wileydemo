package CollectionInfo;

import java.util.TreeMap;

public class TreeMapClass {

	public static void main(String[] args) {
		TreeMap<Integer, String>tmap=new TreeMap<Integer,String>();
		tmap.put(1000, "Venkat");
		tmap.put(1000, "Steve");
		tmap.put(1000, "Anil");
		tmap.put(1000, "Janavi");
		tmap.put(1000, "Rishav");
		
		System.out.println(tmap);
		
		tmap.forEach((k,v) -> System.out.println("key: "+k+"-val: "+v));
		System.out.println("Last key: "+tmap.lastKey());
		System.out.println("First key: "+tmap.firstKey());
		
	}
}
