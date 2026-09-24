
public class Engineer extends Employee {

	private float overTime;
	public Engineer() {
		super();
	}
//	public Engineer(String name, String address, int age , boolean gender , float basicSalary, float overTime) {
//		super(name,address, age , gender, basicSalary);
//		this.overTime = overTime;
//	}
	private float getOverTime() {
		return overTime;
	}
	private void setOverTime(float overTime) {
		this.overTime = overTime;
	}
	
	@Override
	public  float totalSalary(){
		return basicSalary+overTime;
	}
	
	@Override
	public void display() {
		System.out.println("Name: "+ name);
		System.out.println("Address: "+ address);
		System.out.println("Age: "+ age);
		System.out.println("Gender: "+ (gender?"Male":"Female"));
		System.out.println("Basic Salary: "+ basicSalary);
		System.out.println("Over Time: "+ overTime);
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
		this.overTime=ConsoleInput.getFloat();
		
//		Engineer objEngineer = new Engineer(name, address, age, gender, basicSalary, overTime);
		
//		return objEngineer;
	}

}
