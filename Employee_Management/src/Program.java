
public class Program {

	public static void main(String[] args) {
		Manager [] arrManager = new Manager[60];
		Engineer [] arrEngineer = new Engineer[60];
		SalesPerson[] arrSalesPerson = new SalesPerson[60];
		Employee[] arrEmp = new Employee[180];
		
		int countM=0;
		int countE=0;
		int countS=0;
		
		
		int choice=0;
		while(choice!=6) {
			System.out.println("Enter Choice: \r\n"
					+ "1. Add Employee \r\n"
					+ "2.Display \r\n"
					+ "3. Sort \r\n"
					+ "4. Save to File \r\n"
					+ "5. Load from File \r\n"
					+ "6. Exit\r\n");
			choice = ConsoleInput.getInteger();
			switch(choice) {
			
			case 1:
			{
				int choiceEmp=0;
				
				
				while(choiceEmp!=4) {
					
					System.out.println("Enter Choice: \r\n"
							+ "1. Manager \r\n"
							+ "2. Engineer \r\n"
							+ "3. Sales person \r\n"
							+ "4. Exit \r\n");
				
					choiceEmp = ConsoleInput.getInteger();
					switch(choiceEmp) {
					case 1:
						arrManager[countM]=new Manager();
						arrManager[countM++].addEmployee();
						
						
						break;
					case 2:
						arrEngineer[countE]=new Engineer();
						arrEngineer[countE++].addEmployee();
						
						break;
					case 3:
						arrSalesPerson[countS]=new SalesPerson();
						arrSalesPerson[countS++].addEmployee();
						
						break;
					case 4:
						System.out.println("Employee Added! ");
						break;
					default:
						System.out.println("Invalid choice!");
						break;
					}
				}
			}
				
				break;
			case 2:
			{
				int choiceEmp=0;
				
				
				while(choiceEmp!=4) {
					System.out.println("Enter Choice: \r\n"
							+"1. All Employees" 
							+"2. First Employee" 
							+"3. Next Employee" 
							+"4. Previous Employee" 
							+"5. Last Employee" 
							+"6. Exit to Main Menu ");
				
					choiceEmp = ConsoleInput.getInteger();
					switch(choiceEmp) {
					case 1:
					{	
						Operations.addInEmp(arrEmp, arrManager, arrEngineer, arrSalesPerson, countM, countE, countS);
						int totalCount = countM + countE + countS;
						Operations.sortEmpDesc(arrEmp, totalCount);
						int count = countM+countE+countS;
						for(int i =0; i<count; i++) {
							arrEmp[i].display();
						}
					}
						
						break;
					case 2:
					{	Operations.addInEmp(arrEmp, arrManager, arrEngineer, arrSalesPerson, countM, countE, countS);
						int totalCount = countM + countE + countS;
						Operations.sortEmpDesc(arrEmp, totalCount);
						arrEmp[0].display();
						
					}
					
					break;
					case 3:
					{	Operations.addInEmp(arrEmp, arrManager, arrEngineer, arrSalesPerson, countM, countE, countS);
						int totalCount = countM + countE + countS;
						Operations.sortEmpDesc(arrEmp, totalCount);
						
						int count = countM+countE+countS;
						for(int i =0; i<count; i++) {
							arrEmp[count].display();
						}
					}
					
					break;
					case 4:
					{	Operations.addInEmp(arrEmp, arrManager, arrEngineer, arrSalesPerson, countM, countE, countS);
						int totalCount = countM + countE + countS;
						Operations.sortEmpDesc(arrEmp, totalCount);
						int count = countM+countE+countS;
						for(int i =0; i<count; i++) {
							arrEmp[count].display();
						}
					}
					
					break;
					case 5:
						Operations.addInEmp(arrEmp, arrManager, arrEngineer, arrSalesPerson, countM, countE, countS);
						int totalCount = countM + countE + countS;
						Operations.sortEmpDesc(arrEmp, totalCount);
						for (int i = 0; i < totalCount; i++) {
					        arrEmp[i].display();
					    
					    break;
					}
					
					break;
					case 6:
						System.out.println("-------------------------------------- ");
						break;
					default:
						System.out.println("Invalid choice!");
						break;
					}
				}
			}
				break;
			
			case 3:
				
				int choiceEmp=0;
				
				
				while(choiceEmp!=4) {
					System.out.println("Enter Choice: \r\n"
							+ "1. Manager \r\n"
							+ "2. Engineer \r\n"
							+ "3. Sales person \r\n"
							+ "4. Exit \r\n");
				
					choiceEmp = ConsoleInput.getInteger();
					switch(choiceEmp) {
					case 1:
						{Employee [] temp= arrManager;
						Operations.sortEmp(temp,countM);
						
						for(int i =0; i<countM; i++) {
							arrManager[i].display();
						}
						}
						break;
					case 2:
						{Employee [] temp= arrEngineer;
						Operations.sortEmp(temp,countE);
						for(int i =0; i<countE; i++) {
							arrEngineer[countE].display();
						}
						}
						
						break;
					case 3:
						{Employee [] temp= arrSalesPerson;
						Operations.sortEmp(temp,countS);
						for(int i =0; i<countS; i++) {
							arrSalesPerson[countS].display();
						}
						}
						
						break;
					case 4:
						{Employee [] temp= arrEmp;
						Operations.sortEmp(temp,countM+countE+countS);}
						
						break;
					case 5:
						{Employee [] temp= arrSalesPerson;
						Operations.sortEmpDesc(temp,countM+countE+countS);}
						
						break;
						
					case 6:
						System.out.println("-------------------------------------- ");
						break;
					default:
						System.out.println("Invalid choice!");
						break;
					}
				}
				 break;
			case 4:
				
				break;
			case 5:
				break;
			case 6:
				break;
			default:
				System.out.println("Invalid choice!");
				break;
					
			}
		}
	}
	}
	


