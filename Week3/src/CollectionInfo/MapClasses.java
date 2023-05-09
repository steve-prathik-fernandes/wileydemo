package CollectionInfo;

import java.util.HashMap;
import java.util.Map;

public class MapClasses {
public static void main(String[] args) {
	Map<String,String> ss=new HashMap<String, String>();
	
	ss.put("a", "A");
	ss.put("b", "B");
	ss.put("c", "C");
	
	ss.put("D", null);
	ss.put(null, "nulival");
	ss.put(null, null);
	ss.put("e", null);
	
	System.out.println(ss);

}
}
