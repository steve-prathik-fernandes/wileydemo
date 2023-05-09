package CollectionInfo;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorPrg {
public static void main(String[] args) {
	
	LinkedList<String>li=new LinkedList<String>();
	ListIterator<String> listr=li.listIterator();
	
	listr.add("Hello");
	listr.add("Steve");
	listr.add("Here");
	
	while(listr.hasPrevious()){
		System.out.println(listr.previous());
	}
}
}
