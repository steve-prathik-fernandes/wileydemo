package IOStream;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class StudentRecordReader {

	DataInputStream dataInput;
	public StudentRecordReader(String inputFile) throws FileNotFoundException {
		
		// TODO Auto-generated constructor stub
		dataInput=new DataInputStream(new FileInputStream(inputFile));
	}
	
	public List<Student> readAll() throws IOException{
		List<Student>listStudent=new ArrayList<>();
		try {
			while(true) {
				String name=dataInput.readUTF();
				boolean gender=dataInput.readBoolean();
				int age=dataInput.readInt();
				float grade=dataInput.readFloat();
				
				System.out.println("Name: "+name);
				
				Student student=new Student(name,gender,age,grade);
				
				listStudent.add(student);
			}
		}catch(Exception e) {
			
		}
		dataInput.close();
		return listStudent;
		
	}
	
	public static void main(String[] args) {
		String inputFile="C:\\Users\\Steve\\eclipse-workspace\\wiley_core_java\\src\\data.txt";
		
		try {
			StudentRecordReader reader=new StudentRecordReader(inputFile);
			List<Student> listOfStudents=reader.readAll();
			
			for(Student student:listOfStudents) {
				System.out.println(student.getName());
				System.out.println(student.isGender());
				System.out.println(student.getAge());
				System.out.println(student.getGrade());
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
