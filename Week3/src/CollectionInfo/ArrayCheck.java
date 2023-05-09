package CollectionInfo;

import java.util.ArrayList;
import java.util.List;

public class ArrayCheck {
public static void main(String[] args) {
	List<Integer> a=new ArrayList<>();
	
	a.add(null);
	a.add(null);
	for(int i:a) {
		System.out.println(i);
	}
}
}
