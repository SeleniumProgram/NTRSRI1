package secondjavapackage;

public class ObjectExample {

	// Instance variables
	
	int x;
	double d;
	String s;
	char ch;
	boolean b;
	
	public ObjectExample(int x, double d, String s, char ch, boolean b) {
		this.x = x;
		this.d = d;
		this.s = s;
		this.ch = ch;
		this.b = b;

	}

	
	public void print(String name) {

		System.out.println("My Name is " + name);
	}

	public static void main(String[] args) {
		ObjectExample obj1 = new ObjectExample(1, 1.2, "abcd",'d',false);
		System.out.println("Object 1 data");
		System.out.println("--------------------------");
		System.out.println(obj1.x);
		System.out.println(obj1.d);
		System.out.println(obj1.s);
		System.out.println(obj1.ch);
		System.out.println(obj1.b);

		ObjectExample obj2 = new ObjectExample(2, 2.4, "xyz", 'z', true);
		System.out.println("Object 2 data");
		System.out.println("--------------------------");
		System.out.println(obj2.x);
		System.out.println(obj2.d);
		System.out.println(obj2.s);
		System.out.println(obj2.ch);
		System.out.println(obj2.b);

	}

}
