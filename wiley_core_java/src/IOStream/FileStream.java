package IOStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStream {
public static void main(String[] args) throws IOException {
	FileOutputStream fout= new FileOutputStream("C:\\Users\\Steve\\eclipse-workspace\\wiley_core_java\\src\\data1.txt");
	String str="Wiley fullstack project";
	byte[]b=str.getBytes();
	fout.write(b);
	fout.flush();
	fout.close();
	
	FileInputStream fin= new FileInputStream("C:\\Users\\Steve\\eclipse-workspace\\wiley_core_java\\src\\data1.txt");
		int i=0;
	while((i=fin.read())!=-1) {
		System.out.print((char)i);
	}
	fin.close();
}
}
