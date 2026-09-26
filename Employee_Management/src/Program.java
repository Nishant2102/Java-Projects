import utilities.list.LinkedList;

public class Program {
	

	public static void addEmployee(LinkedList<Employee> employeeList)
	{
		final int MENU_ADD_MANAGER=1;
		final int MENU_ADD_ENGINEER=2;
		final int MENU_ADD_SALESPERSON=3;
		final int EXIT=4;
		
		
		int choiceEmp=0;
		
		
		while(choiceEmp!=4) {
			
			System.out.println("Enter Choice: \r\n"
					+ "1. Manager \r\n"
					+ "2. Engineer \r\n"
					+ "3. Sales person \r\n"
					+ "4. Exit \r\n");
		
			choiceEmp = ConsoleInput.getInteger();
			switch(choiceEmp) {
				case MENU_ADD_MANAGER:{
					
					System.out.println("Enter Name :");
					String name=ConsoleInput.getString();
					
					System.out.println("Enter Address :");
					String address=ConsoleInput.getString();
					
					System.out.println("Enter Age :");
					int age=ConsoleInput.getInteger();
					
					System.out.println("Enter Gender (Male true/ Female False) :");
					boolean gender=ConsoleInput.getBoolean();
					
					System.out.println("Enter Basic Salary :");
					float basicSalary=ConsoleInput.getFloat();
					
					
					System.out.println("HRA :");
					
					float hra=ConsoleInput.getFloat();
					
					employeeList.add(new Manager(name, address, age , gender , basicSalary,hra));
				}
					break;
				case MENU_ADD_ENGINEER:
				{
					System.out.println("Enter Name :");
					String name=ConsoleInput.getString();
					
					System.out.println("Enter Address :");
					String address=ConsoleInput.getString();
					
					System.out.println("Enter Age :");
					int age=ConsoleInput.getInteger();
					
					System.out.println("Enter Gender (Male true/ Female False) :");
					boolean gender=ConsoleInput.getBoolean();
					
					System.out.println("Enter Basic Salary :");
					float basicSalary=ConsoleInput.getFloat();
					
					System.out.println("Over Time :");
					
					float overTime=ConsoleInput.getFloat();
					
					employeeList.add(new Engineer(name, address, age , gender , basicSalary,overTime));
				}
					break;
				case MENU_ADD_SALESPERSON:
				{
					System.out.println("Enter Name :");
					String name=ConsoleInput.getString();
					
					System.out.println("Enter Address :");
					String address=ConsoleInput.getString();
					
					System.out.println("Enter Age :");
					int age=ConsoleInput.getInteger();
					
					System.out.println("Enter Gender (Male true/ Female False) :");
					boolean gender=ConsoleInput.getBoolean();
					
					System.out.println("Enter Basic Salary :");
					float basicSalary=ConsoleInput.getFloat();
					System.out.println("Commission :");
					
					float commission=ConsoleInput.getFloat();
					
					employeeList.add(new SalesPerson(name, address, age , gender , basicSalary,commission));
			}
					
					break;
				case EXIT:
					System.out.println("Employee Added");
					break;
				default:
					System.out.println("Invaild Choice!");
			}
		}
	}
	

	public static void main(String[] args) {
		
		LinkedList<Employee> employeeList = new LinkedList<Employee>();
		
		
		
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
				addEmployee(employeeList);
				break;
			case 2:
			{
				int choiceEmp=0;
				
				
				while(choiceEmp!=6) {
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
						Employee temp = employeeList.getFirst();
						while (temp != null) {
                            System.out.println(temp);
                            System.out.println("Total Salary: " + temp.getTotalSalary());

                            temp = employeeList.getNext();
                        }
					}
						break;
					case 2:
					{
						Employee temp = employeeList.getFirst();
						if (temp != null) {
							System.out.println(temp);
							System.out.println("Total Salary: " + temp.getTotalSalary());
						} else {
							System.out.println("List is empty.");
						}
					}
					break;
					case 3:
					{
						Employee temp = employeeList.getNext();
						if (temp != null) {
							System.out.println(temp);
							System.out.println("Total Salary: " + temp.getTotalSalary());
						} else {
							System.out.println("No next element.");
						}
					}
					break;
					case 4:
						{
							Employee temp = employeeList.getPrevious();
							if (temp != null) {
								System.out.println(temp);
								System.out.println("Total Salary: " + temp.getTotalSalary());
							} else {
								System.out.println("No next element.");
							}
						}
					break;
					case 5:
					{
						Employee temp = employeeList.getLast();
						if (temp != null) {
							System.out.println(temp);
							System.out.println("Total Salary: " + temp.getTotalSalary());
						} else {
							System.out.println("No next element.");
						}
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
							+ "1. All Manager \r\n"
							+ "2. All Engineer \r\n"
							+ "3. All Sales person \r\n"
							+ "4. All Employees Alphabetic order ascending \r\n"
							+ "5. All Employees Alphabetic order descending \r\n"
							+ "4. Exit \r\n");
				
					choiceEmp = ConsoleInput.getInteger();
					switch(choiceEmp) {
					case 1:
						{
						if (employeeList.getMaxCount() == 0) {
					        System.out.println("No employees to sort!");
					    } else {
					        Operations.sortLinkedList(employeeList);
						}
						Employee temp = employeeList.getFirst();
						while(temp!=null) {
							if(temp  instanceof Manager) {
								System.out.println(temp);
								System.out.println("Total Salary: " + temp.getTotalSalary());
								
							}
							temp = employeeList.getNext();
						}
						}
						break;
					case 2:
					{
						if (employeeList.getMaxCount() == 0) {
					        System.out.println("No employees to sort!");
					    } else {
					        Operations.sortLinkedList(employeeList);
						}
						Employee temp = employeeList.getFirst();
						while(temp!=null) {
							if(temp  instanceof Engineer) {
								System.out.println(temp);
								System.out.println("Total Salary: " + temp.getTotalSalary());
								
							}
							temp = employeeList.getNext();
						}
					}
						
						break;
					case 3:
					{
						if (employeeList.getMaxCount() == 0) {
					        System.out.println("No employees to sort!");
					    } else {
					        Operations.sortLinkedList(employeeList);
						}
						Employee temp = employeeList.getFirst();
						while(temp!=null) {
							if(temp  instanceof SalesPerson) {
								System.out.println(temp);
								System.out.println("Total Salary: " + temp.getTotalSalary());
								
							}
							temp = employeeList.getNext();
						}
						
					}
						break;
					case 4:
						{
						if (employeeList.getMaxCount() == 0) {
					        System.out.println("No employees to sort!");
					    } else {
					        Operations.sortLinkedList(employeeList);
						}
						
						Employee temp = employeeList.getFirst();
						while(temp!=null) {
							System.out.println(temp);
							System.out.println("Total Salary: " + temp.getTotalSalary());
							temp = employeeList.getNext();
						}
						}
						break;
					case 5:
					{
						if (employeeList.getMaxCount() == 0) {
					        System.out.println("No employees to sort!");
					    } else {
					        Operations.sortLinkedListDesc(employeeList);
						}
						
						Employee temp = employeeList.getFirst();
						while(temp!=null) {
							System.out.println(temp);
							System.out.println("Total Salary: " + temp.getTotalSalary());
							temp = employeeList.getNext();
						}
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
				 break;
			case 4:
				System.out.println("Feature Not Available!");
				break;
			case 5:
				System.out.println("Feature Not Available!");
				break;
			case 6:
				System.out.println("Feature Not Available!");
				break;
			default:
				System.out.println("Invalid choice!");
				break;
					
			}
		}
	}
	}
	


