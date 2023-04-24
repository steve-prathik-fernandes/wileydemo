package Exceptions;

class AgeNotValid extends Exception {
	public AgeNotValid(String message) {
		super(message);
	}

	@Override
	public String getMessage() {
		// TODO: Auto-generated method stub
		// return super.getMessage();
		return "this age is not valid";
	}

	public String toString() {
		// TODO: Auto-generated method stub
		// return super.toString();
		return "age not applicable";
	}
}

public class CustomException {
	public static void getAge(int age) throws AgeNotValid {
		if (age > 18) {
			try {
				throw new AgeNotValid("Age not valid");
			} catch (Exeption e) {
				e.printStackTrace();
				// TODO: Handle exception
				System.out.println(e.getMessage());
				System.out.println(e.toString());
			}
		}
	}

}
