import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Program {
	static Scanner sc = new Scanner(System.in);

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
			
			choiceEmp = sc.nextInt();
			sc.nextLine();
			switch(choiceEmp) {
				case MENU_ADD_MANAGER:{
					System.out.println("Enter Name :");
					String name=sc.nextLine();
					
					System.out.println("Enter Address :");
					String address=sc.nextLine();
					
					System.out.println("Enter Age :");
					int age=sc.nextInt();
					
					System.out.println("Enter Gender (Male true/ Female False) :");
					boolean gender=sc.nextBoolean();
					
					System.out.println("Enter Basic Salary :");
					float basicSalary=sc.nextFloat();
					
					System.out.println("HRA :");
					float hra=sc.nextFloat();
					sc.nextLine();
					
					employeeList.add(new Manager(name, address, age , gender , basicSalary,hra));
				}
					break;
				case MENU_ADD_ENGINEER:
				{
					System.out.println("Enter Name :");
					String name=sc.nextLine();
					
					System.out.println("Enter Address :");
					String address=sc.nextLine();
					
					System.out.println("Enter Age :");
					int age=sc.nextInt();
					
					System.out.println("Enter Gender (Male true/ Female False) :");
					boolean gender=sc.nextBoolean();
					
					System.out.println("Enter Basic Salary :");
					float basicSalary=sc.nextFloat();
					
					System.out.println("Over Time :");
					float overTime=sc.nextFloat();
					sc.nextLine();
					
					employeeList.add(new Engineer(name, address, age , gender , basicSalary,overTime));
				}
					break;
				case MENU_ADD_SALESPERSON:
				{
					System.out.println("Enter Name :");
					String name=sc.nextLine();
					
					System.out.println("Enter Address :");
					String address=sc.nextLine();
					
					System.out.println("Enter Age :");
					int age=sc.nextInt();
					
					System.out.println("Enter Gender (Male true/ Female False) :");
					boolean gender=sc.nextBoolean();
					
					System.out.println("Enter Basic Salary :");
					float basicSalary=sc.nextFloat();
					
					System.out.println("Commission :");
					float commission=sc.nextFloat();
					sc.nextLine();
					
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

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		LinkedList<Employee> employeeList = new LinkedList<Employee>();
		ListIterator<Employee> displayIter = null;
		
		File objFile = new File("E:\\javaseProjects\\Encryption\\Employee.txt");
		
		int choice=0;
		while(choice!=6) {
			System.out.println("Enter Choice: \r\n"
					+ "1. Add Employee \r\n"
					+ "2.Display \r\n"
					+ "3. Sort \r\n"
					+ "4. Save to File \r\n"
					+ "5. Load from File \r\n"
					+ "6. Exit\r\n");
			choice = sc.nextInt();
			sc.nextLine();
			switch(choice) {
			
			case 1:
				addEmployee(employeeList);
				displayIter = null;
				break;
			case 2:
			{
				int choiceEmp=0;
				
				while(choiceEmp!=6) 
				{
					System.out.println("Enter Choice: \r\n"
						+"1. All Employees \r\n" 
						+"2. First Employee \r\n" 
						+"3. Next Employee \r\n" 
						+"4. Previous Employee \r\n" 
						+"5. Last Employee \r\n" 
						+"6. Exit to Main Menu \r\n");
				
					choiceEmp = sc.nextInt();
					sc.nextLine();
					switch(choiceEmp) {
					case 1:
					{	
						if (employeeList.isEmpty()) {
							System.out.println("List is empty.");
						} else {
							for (Employee temp : employeeList) {
								System.out.println(temp);
								System.out.println("Total Salary: " + temp.getTotalSalary());
							}
						}
					}
						break;
					case 2:
					{
						if (!employeeList.isEmpty()) {
							Employee temp = employeeList.getFirst();
							System.out.println(temp);
							System.out.println("Total Salary: " + temp.getTotalSalary());
						} else {
							System.out.println("List is empty.");
						}
					}
					break;
					case 3:
					{
						if (displayIter == null) {
							displayIter = employeeList.listIterator();
						}
						if (displayIter.hasNext()) {
							Employee temp = displayIter.next();
							System.out.println(temp);
							System.out.println("Total Salary: " + temp.getTotalSalary());
						} else {
							System.out.println("No next element.");
						}
					}
					break;
					case 4:
					{
						if (displayIter == null) {
							displayIter = employeeList.listIterator();
						}
						if (displayIter.hasPrevious()) {
							Employee temp = displayIter.previous();
							System.out.println(temp);
							System.out.println("Total Salary: " + temp.getTotalSalary());
						} else {
							System.out.println("No previous element.");
						}
					}
					break;
					case 5:
					{
						if (!employeeList.isEmpty()) {
							Employee temp = employeeList.getLast();
							System.out.println(temp);
							System.out.println("Total Salary: " + temp.getTotalSalary());
						} else {
							System.out.println("List is empty.");
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
				
				while(choiceEmp!=6) {
					System.out.println("Enter Choice: \r\n"
							+ "1. All Manager \r\n"
							+ "2. All Engineer \r\n"
							+ "3. All Sales person \r\n"
							+ "4. All Employees Alphabetic order ascending \r\n"
							+ "5. All Employees Alphabetic order descending \r\n"
							+ "6. Exit \r\n");
				
					choiceEmp = sc.nextInt();
					sc.nextLine();
					switch(choiceEmp) {
					case 1:
						{
						if (employeeList.isEmpty()) {
					        System.out.println("No employees to sort!");
					    } else {
					    	Collections.sort(employeeList, new EmployeeComparatorAsc());
					    	for (Employee temp : employeeList) {
								if(temp instanceof Manager) {
									System.out.println(temp);
									System.out.println("Total Salary: " + temp.getTotalSalary());
								}
							}
					    }						
						}
						break;
					case 2:
					{
						if (employeeList.isEmpty()) {
					        System.out.println("No employees to sort!");
					    } else {
					    	Collections.sort(employeeList, new EmployeeComparatorAsc());
					    	for (Employee temp : employeeList) {
								if(temp instanceof Engineer) {
									System.out.println(temp);
									System.out.println("Total Salary: " + temp.getTotalSalary());
								}
							}
					    }						
					}
						break;
					case 3:
					{
						if (employeeList.isEmpty()) {
					        System.out.println("No employees to sort!");
					    } else {
					    	Collections.sort(employeeList, new EmployeeComparatorAsc());
					    	for (Employee temp : employeeList) {
								if(temp instanceof SalesPerson) {
									System.out.println(temp);
									System.out.println("Total Salary: " + temp.getTotalSalary());
								}
							}
					    }						
					}
						break;
					case 4:
						{
							if (employeeList.isEmpty()) {
						        System.out.println("No employees to sort!");
						    } else {
						    	Collections.sort(employeeList, new EmployeeComparatorAsc());
						    	for (Employee temp : employeeList) {
									System.out.println(temp);
									System.out.println("Total Salary: " + temp.getTotalSalary());
								}
						    }						
						}
						break;
					case 5:
					{
						if (employeeList.isEmpty()) {
					        System.out.println("No employees to sort!");
					    } else {
					    	Collections.sort(employeeList, new EmployeeComparatorDesc());
					    	for (Employee temp : employeeList) {
								System.out.println(temp);
								System.out.println("Total Salary: " + temp.getTotalSalary());
							}
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
				displayIter = null;
				break;
			case 4:
				Operations.writeDataIntoFile(objFile, employeeList);
				break;
			case 5:
				try{
					Operations.readFromFile(objFile, employeeList);
					displayIter = null;
				}
				catch(EOFException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 6:
				System.out.println("Thanks for using!");
				break;
			default:
				System.out.println("Invalid choice!");
				break;
			}
		}
	}
}