package Exceptions;

public class FinalBlock {
	public static void main(String[] args) {
		try {
			System.out.println("11111111");
			System.out.println("wiley");
			try {
				// TODO: handle exception
				System.out.println(10 / 0);
				System.exit(0);
				System.out.println("edge");

			} catch (Exception e) {
				System.out.println("catch block");
				System.exit(0);
				System.out.println(10 / 0);
				e.printStackTrace();

			} finally {
//			System.out.println(10/0);
				System.out.println("nested close connection");
			}
		} catch (Exception ee) {
			ee.printStackTrace();
		} finally {
			System.out.println("close connection");
		}
		System.out.println("Last statement");
	}
}
