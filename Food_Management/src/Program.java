
public class Program {

	
	public static void main(String[] args) {
		int choice = 0;
		int Total=0;
		int quantity=0;
		do {
		
		System.out.println("What do you want to eat today? \n 1. Dosa, 2. Samosa, 3. Idli, 4. Poha, 5. Uttapa, 6. Vada Paav, 7. Pav Bhaji, 8. Misal Paav, 9. Noodles, 10 . Generate Bill");
		choice = ConsoleInput.getInteger();
		switch(choice) {
			
			case 1:
			{	System.out.println("Enter Quantity: ");
				quantity=ConsoleInput.getInteger();
				Total+=quantity*50;
			}
			break;
			case 2:
			{	System.out.println("Enter Quantity: ");
				quantity=ConsoleInput.getInteger();
				Total+=quantity*20;
			}
			break;
			case 3:
			{	System.out.println("Enter Quantity: ");
				quantity=ConsoleInput.getInteger();
				Total+=quantity*40;
			}
			break;
			case 4:
			{	System.out.println("Enter Quantity: ");
				quantity=ConsoleInput.getInteger();
				Total+=quantity*20;
			}
			break;
			case 5:
			{	System.out.println("Enter Quantity: ");
				quantity=ConsoleInput.getInteger();
				Total+=quantity*60;
			}
			break;
			case 6:
			{	System.out.println("Enter Quantity: ");
				quantity=ConsoleInput.getInteger();
				Total+=quantity*15;
			}
			break;
			case 7:
			{	System.out.println("Enter Quantity: ");
				quantity=ConsoleInput.getInteger();
				Total+=quantity*60;
			}
			break;
			case 8:
			{	System.out.println("Enter Quantity: ");
				quantity=ConsoleInput.getInteger();
				Total+=quantity*60;
			}
			break;
			case 9:
			{	System.out.println("Enter Quantity: ");
				quantity=ConsoleInput.getInteger();
				Total+=quantity*50;
			}
			break;
			case 10:
			{	System.out.println("Total Amount: "+ Total);
			return;
			}
			default: 
				System.out.println("Invalid Input!");
				break;
		}
		
		}while(choice!=10);

	
	}

}
