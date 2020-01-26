package secondjavapackage;

public class MethodRetTypes {
	
	
	public int div()
	{
		int x=10;
		
		int y=2;
		int z=x/y;
	
		return z;
	}
	
	public static void main(String[] args) {
		MethodRetTypes obj=new MethodRetTypes();
		int result=obj.div();
		System.out.println(result);
		
		
	}
	

}
