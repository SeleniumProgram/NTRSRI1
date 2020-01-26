package secondjavapackage;

public class RunTimeExample {

	public static void main(String[] args) {

		String str = null;

		try {
			System.out.println(str.length());
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Prog completed");
		}
		int a = 100;
		int b = 0;
		System.out.println(a / b);

	}
}
