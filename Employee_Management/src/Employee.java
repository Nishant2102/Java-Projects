
public abstract class Employee {
	
	protected String name;
	protected String address;
	protected int age;
	protected boolean gender;
	protected float basicSalary;
	
	public Employee() {
		
	}
	public Employee(String name, String address, int age , boolean gender , float basicSalary) {
		this.name=name;
		this.address=address;
		this.age=age;
		this.gender=gender;
		this.basicSalary=basicSalary;
	}

	private String getName() {
		return name;
	}

	private void setName(String name) {
		if(name.length()>3){
			this.name = name;
		}
	}

	private String getAddress() {
		return address;
	}

	private void setAddress(String address) {
		if(address.length()>5) this.address = address;
	}

	private int getAge() {
		return age;
	}

	private void setAge(int age) {
		if(age>18) this.age = age;
	}

	private boolean getGender() {
		return gender;
	}

	private void setGender(boolean gender) {
		this.gender = gender;
	}

	private float getBasicSalary() {
		return basicSalary;
	}

	private void setBasicSalary(float basicSalary) {
		if(basicSalary>10000) this.basicSalary = basicSalary;
	}
	
	public abstract float totalSalary();
	public abstract void display();
	
	
//	public abstract void addEmployee(Employee arrEmp[]);
	
}
