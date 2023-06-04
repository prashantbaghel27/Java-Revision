package variables;

public class StaticVariables {

	
	public static void main(String args[])
	{
		StaticVariables.add();
	}
	
	static int a=60;
	static double b=50.2;
	static double c= a+b;
	 
	public static void add()
	{
	System.out.println(c);
	}
}
