
public class Program {

	public static void main(String[] args) {
		int day=1;
		int month=1;
		int year=2026;
		
		Date date = new Date(day, month, year);
		Operations objOper = new Operations();
		
		int choice = 0;
		while(choice!=6) {
			System.out.println("Enter Choice: "
					+ "1. Set Date\r\n"
					+ "2. Add Days\r\n"
					+ "3. Add Months\r\n"
					+ "4. Add Years\r\n"
					+ "5. Display\r\n"
					+ "6. Exit\r\n");
			choice = ConsoleInput.getInteger();
			switch(choice) {
				case 1: 
					System.out.println("Enter Day: ");
					day=ConsoleInput.getInteger();
					
					System.out.println("Enter Month: ");
					month=ConsoleInput.getInteger();
					
					System.out.println("Enter Year: ");
					year=ConsoleInput.getInteger();
					
					date.setDate(day,month,year);
					
					System.out.println("Date: " + date.getDay() + "/" + date.getMonth() + "/" + date.getYear());
					
					break;
				case 2: 
					System.out.println("Enter Number of days to add: ");
					int days = ConsoleInput.getInteger();
					
					objOper.addDays(date, days);
					System.out.println("Date: " + date.getDay() + "/" + date.getMonth() + "/" + date.getYear());
					
					break;
				case 3: 
					System.out.println("Enter Number of months to add: ");
					int months = ConsoleInput.getInteger();
					
					objOper.addMonths(date, months);
					System.out.println("Date: " + date.getDay() + "/" + date.getMonth() + "/" + date.getYear());
					
					break;
				case 4: 
					System.out.println("Enter Number of years to add: ");
					int years = ConsoleInput.getInteger();
					
					objOper.addYear(date, years);
					System.out.println("Date: " + date.getDay() + "/" + date.getMonth() + "/" + date.getYear());
					
					break;
				case 5: 
					System.out.println("Date: " + date.getDay() + "/" + date.getMonth() + "/" + date.getYear());
					
					break;
				case 6: 
					System.out.println("Thanks for using our code!");
					
					break;
				default: 
					System.out.println("Invalid Choice !");
					break;
			}
			
		}
		
		return;
	}

}
