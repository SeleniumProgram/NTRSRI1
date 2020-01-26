package overriding;

public class Parent {

	public int add(int a,int b,int c) {
		
		int d = a + b + c;
		return d;
		

	}

	public void sub() {
		int a = 2;
		int b = 1;
		int c = a - b;
	}

}
