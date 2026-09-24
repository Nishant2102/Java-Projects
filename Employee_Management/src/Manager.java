
public class Manager extends Employee {
	private float hra;
	public Manager() {
		super();
	}
//	public Manager(String name, String address, int age , boolean gender , float basicSalary, float hra) {
//		super(name,address, age , gender, basicSalary);
//		this.hra = hra;
//	}
	private float getHra() {
		return hra;
	}
	private void setHra(float hra) {
		this.hra = hra;
	}
	
	@Override
	public  float totalSalary(){
		return basicSalary+hra;
	}
	
	@Override
	public void display() {
		System.out.println("Name: "+ name);
		System.out.println("Address: "+ address);
		System.out.println("Age: "+ age);
		System.out.println("Gender: "+ (gender?"Male":"Female"));
		System.out.println("basicSalary: "+ basicSalary);
		System.out.println("HRA: "+ hra);
	}
	
	public void addEmployee() {
		System.out.println("Enter Name :");
		this.name=ConsoleInput.getString();
		
		System.out.println("Enter Address :");
		this.address=ConsoleInput.getString();
		
		System.out.println("Enter Age :");
		this.age=ConsoleInput.getInteger();
		
		System.out.println("Enter Gender (Male true/ Female False) :");
		this.gender=ConsoleInput.getBoolean();
		
		System.out.println("Enter Basic Salary :");
		this.basicSalary=ConsoleInput.getFloat();
		
		System.out.println("Enter HRA :");
		this.hra=ConsoleInput.getFloat();
		
//		Manager objManager = new Manager(name, address, age, gender, basicSalary, hra);
//		
//		return objManager;
	}
	
}
