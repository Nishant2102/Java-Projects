
public class Engineer extends Employee {

	private float overTime;
	
	public Engineer(String name, String address, int age , boolean gender , float basicSalary ,float overTime) {
		super(name, address, age, gender, basicSalary);
		setOverTime(overTime);
		totalSalary();
	}

	public float getOverTime() {
		return overTime;
	}
	private void setOverTime(float overTime) {
		this.overTime = overTime;
	}
	
	@Override
	public  void totalSalary(){
		this.totalSalary= basicSalary+overTime;
	}

}
