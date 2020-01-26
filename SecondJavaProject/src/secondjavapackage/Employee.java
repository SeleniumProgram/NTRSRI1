package secondjavapackage;

public class Employee {

	String empName;
	String empDesg;
	String empSalaray;
	String empId;

	public Employee(String a, String b, String c, String d) {
		empName = a;
		empDesg = b;
		empSalaray = c;
		empId = d;

	}

	public static void main(String[] args) {
		Employee e1 = new Employee("ABCD", "SSE", "12 Lakhs", "E1");
		System.out.println(e1.empName);
		System.out.println(e1.empDesg);
		System.out.println(e1.empSalaray);
		System.out.println(e1.empId);
        System.out.println("--------------------");
		Employee e2 = new Employee("XYZ", "ASE", "4 Lakhs", "E2");
		System.out.println(e2.empName);
		System.out.println(e2.empDesg);
		System.out.println(e2.empSalaray);
		System.out.println(e2.empId);
	}

}
