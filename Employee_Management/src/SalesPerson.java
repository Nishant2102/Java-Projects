
public class SalesPerson extends Employee {

	private float commission;
	public SalesPerson() {
		super();
	}
//	public SalesPerson(String name, String address, int age , boolean gender , float basicSalary, float commission) {
//		super(name,address, age , gender, basicSalary);
//		this.commission = commission;
//	}
	private float getCommission() {
		return commission;
	}
	private void setCommission(float commission) {
		this.commission = commission;
	}
	
	@Override
	public  float totalSalary(){
		return basicSalary+commission;
	}
	
	@Override
	public void display() {
		System.out.println("Name: "+ name);
		System.out.println("Address: "+ address);
		System.out.println("Age: "+ age);
		System.out.println("Gender: "+ (gender?"Male":"Female"));
		System.out.println("basicSalary: "+ basicSalary);
		System.out.println("commission: "+ commission);
	}
	
	public void addEmployee() {
		System.out.println("Enter Name :");
		this.name=ConsoleInput.getString();
		
		System.out.println("Enter Address :");
		this.address=ConsoleInput.getString();
		
		System.out.println("Enter Age :");
		this.age=ConsoleInput.getInteger();
		
		System.out.println("Enter Gender (Male true/ Female false)");
		this.gender=ConsoleInput.getBoolean();
		
		System.out.println("Enter Basic Salary :");
		this.basicSalary=ConsoleInput.getFloat();
		
		System.out.println("Enter HRA :");
		this.commission=ConsoleInput.getFloat();
		
//		SalesPerson objSalesPerson = new SalesPerson(name, address, age, gender, basicSalary, commission);
//		
//		return objSalesPerson;
	}

}
