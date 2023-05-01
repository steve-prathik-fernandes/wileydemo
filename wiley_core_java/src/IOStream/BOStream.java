package IOStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BOStream {
	public static void main(String[] args)throws IOException {
		
//		FileOutputStream fout=new FileOutputStream("C:\\Users\\Steve\\eclipse-workspace\\wiley_core_java\\src\\data.txt");
//		BufferedOutputStream bof = new BufferedOutputStream(System.out);
//		String str = "I am a Programmer";
//		byte[] b = str.getBytes();
//
////	System.out.println(b);
//
//		try {
//			bof.write(b);
//			bof.flush();//data within the stream will be cleared
//			bof.close();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		FileInputStream fin=new FileInputStream("C:\\Users\\Steve\\eclipse-workspace\\wiley_core_java\\src\\data.txt");
		
		BufferedInputStream bis=new BufferedInputStream(fin);
		int i;
		
			while( (i = bis.read())!=-1) {
				//TODO Auto-generated catch block
				System.out.println((char)i);
				
			}
			bis.close();
			fin.close();
		
		
	}
}
