
public class Calculator {
	public static int add(int a, int b) {
		return a+b;
	}
	public static int sub(int a, int b) {
		return a-b;
	}
	public static int mult(int a, int b) {
		return a*b;
	}
	public static int div(int a, int b) {
		return a/b;
	}
	
	
	public static float add(float a, float b) {
		return a+b;
	}
	public static float sub(float a, float b) {
		return a-b;
	}
	public static float mult(float a, float b) {
		return a*b;
	}
	public static float div(float a, float b) {
		return a/b;
	}
	
	
	public static double add(double a, double b) {
		return a+b;
	}
	public static double sub(double a, double b) {
		return a-b;
	}
	public static double mult(double a, double b) {
		return a*b;
	}
	public static double div(double a, double b) {
		return a/b;
	}
	
	public static void operation(int a, int b) {
		try {
			System.out.println("Enter choice for opertations 1.Add, 2.Sub, 3.Multiply, 4.Divide");
			int x = ConsoleInput.getInteger();
		switch(x) {
			case 1:
			{
				System.out.println(add(a,b));
				break;
			}
			case 2:
			{
				System.out.println(sub(a,b));
				break;
			}
			case 3:
			{
				System.out.println(mult(a,b));
				break;
			}
			case 4:
			{
				System.out.println(div(a,b));
				break;
			}
			default :
				System.out.println("Invalid choice");
				break;
			
		}
		} catch(Exception objException) {
			System.out.println(objException);
		}
	}
	
	
	public static void operation(float a, float b) {
		try {
			System.out.println("Enter choice for opertations 1.Add, 2.Sub, 3.Multiply, 4.Divide");
		int x = ConsoleInput.getInteger();
		switch(x) {
			case 1:
			{
				System.out.println(add(a,b));
				break;
			}
			case 2:
			{
				System.out.println(sub(a,b));
				break;
			}
			case 3:
			{
				System.out.println(mult(a,b));
				break;
			}
			case 4:
			{
				System.out.println(div(a,b));
				break;
			}
			default :
				System.out.println("Invalid choice");
				break;
			
		}
		} catch(Exception objException) {
			System.out.println(objException);
		}
	}
	
	public static void operation(double a, double b) {
		try {
			System.out.println("Enter choice for opertations 1.Add, 2.Sub, 3.Multiply, 4.Divide");
		
		int x = ConsoleInput.getInteger();
		switch(x) {
			case 1:
			{
				System.out.println(add(a,b));
				break;
			}
			case 2:
			{
				System.out.println(sub(a,b));
				break;
			}
			case 3:
			{
				System.out.println(mult(a,b));
				break;
			}
			case 4:
			{
				System.out.println(div(a,b));
				break;
			}
			default :
				System.out.println("Invalid choice");
				break;
			
		}
		} catch(Exception objException) {
			System.out.println(objException);
		}
	}
}
