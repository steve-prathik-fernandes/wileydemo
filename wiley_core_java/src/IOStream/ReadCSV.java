package IOStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadCSV {
public static void main(String[] args) throws FileNotFoundException {
	Scanner scan=new Scanner(new File("C:\\Users\\Steve\\eclipse-workspace\\wiley_core_java\\src\\DataD.csv"));
	
	List<String> list=new ArrayList<String>();  
	
	scan.useDelimiter(",");
	
	while(scan.hasNext()) {
		list.add(scan.next());
	}
	for(String s: list) {
		System.out.println(s);
	}
}
}
