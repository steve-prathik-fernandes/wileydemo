package StringClasses;
import java.util.Arrays;
import java.util.List;
public class StringFormat {
public static void main(String[] args) {
	String title="Java Developer";
	float salary=2000.39f;
	System.out.format("%s has $ %.2f USD Salary",title,salary);
	
	List<String> techStack = Arrays.asList(  // Initializing a list using Arrays
			"Essential Java",
			"Head First Java",
			"Java Design Patterns"
			);
		// -%20 s is left justification	
	for(String book: techStack) {
		System.out.format("%-20s - In Stock%n",book);// giving proper format
	}
}
}
