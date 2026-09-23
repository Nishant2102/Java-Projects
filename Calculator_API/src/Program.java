
public class Program {

	public static void main(String[] args) {
		try {
		int x =0;
//		Calculator objCalculator = new Calculator();
		while(x!=4) {
			System.out.println("Enter data type for operation. 1:INTEGER, 2.FLOAT, 3.DOUBLE, 4.EXIT");
			x=ConsoleInput.getInteger();
			switch(x) {
			case 1:
			{
				System.out.println("Enter number for operation");
				int num1 = ConsoleInput.getInteger();
				int num2 = ConsoleInput.getInteger();
				Calculator.operation(num1,num2);
			}
			break;
			case 2:
			{
				System.out.println("Enter number for operation");
				float num1 = ConsoleInput.getFloat();
				float num2 = ConsoleInput.getFloat();
				Calculator.operation(num1,num2);
			}
			break;
			case 3:
			{
				System.out.println("Enter number for operation");
				double num1 = ConsoleInput.getDouble();
				double num2 = ConsoleInput.getDouble();
				Calculator.operation(num1,num2);
			}
			break;
			case 4:
			
				return;
				
			default :
				System.out.println("Invalid choice");
				
			
			}
		}
		
		
		}catch(Exception objException) {
			System.out.println(objException);
		}
	}

}
