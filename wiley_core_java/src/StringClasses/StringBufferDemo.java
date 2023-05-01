package StringClasses;

public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer chatHistory= new StringBuffer();
		
		String sender="Steve";
		String message="Hi";
		
		chatHistory.append(sender);
		chatHistory.append(message);
		System.out.println(chatHistory);
	}
	
}
