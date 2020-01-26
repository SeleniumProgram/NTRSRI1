package secondjavapackage;

public class ExceptionExample {

	public static void main(String[] args) {

		int a = 10;
		int b = 0;
		try {
			System.out.println(a / b);
		} catch (Exception ae) {
			System.out.println(ae.getMessage());
		}
		System.out.println("I am last line of the prog");
	}

}
