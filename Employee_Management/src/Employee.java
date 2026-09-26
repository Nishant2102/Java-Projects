
public abstract class Employee {
	
	protected String name;
	protected String address;
	protected int age;
	protected boolean gender;
	protected float basicSalary;
	protected  float totalSalary;
	
	
	public Employee(String name, String address, int age , boolean gender , float basicSalary) {
		
		setName(name);
		setAddress(address);
		setAge(age);
		setGender(gender);
		setBasicSalary(basicSalary);
	}

	public String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = (name != null && name.length() > 3) ? name : "Unknown";
	}

	public String getAddress() {
		return address;
	}

	private void setAddress(String address) {
		this.address = (address != null) ? address : "Not Provided";
	}

	public int getAge() {
		return age;
	}

	private void setAge(int age) {
		this.age = (age > 18) ? age : 18;
	}

	public boolean getGender() {
		return gender;
	}

	private void setGender(boolean gender) {
		this.gender = gender;
	}

	public float getBasicSalary() {
		return basicSalary;
	}

	private void setBasicSalary(float basicSalary) {
		this.basicSalary = (basicSalary > 10000) ? basicSalary : 10000;
	}
	
	public float getTotalSalary() {
		return totalSalary;
	}
	
	public abstract void totalSalary() ;
	
	public String toString()
	{
		StringBuffer empDetails = new StringBuffer();
		empDetails.append("Name is: ").append(this.name);
		empDetails.append(" | Address is: ").append(this.address);
		empDetails.append(" | Age: ").append(this.age);
		empDetails.append(" | Gender: ").append(this.gender ? "Male" : "Female");
		empDetails.append(" | Basic Salary: ").append(this.basicSalary);
		
		return empDetails.toString();
	}
	
	

	
}
