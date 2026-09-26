
public class Manager extends Employee {
	private float hra;
	public Manager(String name, String address, int age , boolean gender , float basicSalary, float hra) {
		super(name, address, age, gender, basicSalary);
		setHra(hra);
		totalSalary();
	}

	public float getHra() {
		return hra;
	}
	private void setHra(float hra) {
		this.hra = hra;
	}
	
	@Override
	public  void totalSalary(){
		this.totalSalary=basicSalary+hra;
	}
	

	
}
