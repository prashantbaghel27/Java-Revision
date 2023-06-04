package Constructor;

public class Example1 {
	
	public static void main(String args[])
	{
		Example1 xyz=new Example1();
		xyz.stri();
		Example1 cvx=new Example1(2,3);
		
	}

	// user defined constructor
	Example1()
	{
		int a=96;
		double b=56.5;
		double c=a+b;
		
			System.out.println(c);
	}
	
	// default constructor
	
	public void stri()
	{
		String a= "CHETANA";
			System.out.println(a);
	}
	
	//Parametrization constructor
	
	Example1(int a, int b)
	{
		System.out.println(a+b);
	}
	
}
