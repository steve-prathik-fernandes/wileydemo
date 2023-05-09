package CollectionInfo;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class CursorClass {
	public static void main(String[] args) {
		Vector<String> vc=new Vector<>();
		
		vc.addElement("a");
		vc.addElement("b");
		vc.addElement("c");
		vc.addElement("d");
		vc.addElement("e");
		vc.addElement("f");
		
		Enumeration<String> ev=vc.elements();
		ArrayList al=new ArrayList();
			Iterator itr=al.iterator();
		itr.hasNext();
		itr.next();
		itr.remove();
		while (ev.hasMoreElements()) {
			System.out.println(ev.nextElement());
			
			
		}
	}

}
