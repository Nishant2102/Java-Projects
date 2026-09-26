
public class SalesPerson extends Employee {

	private float commission;
	public SalesPerson(String name, String address, int age , boolean gender , float basicSalary, float commission) {
		super(name, address, age, gender, basicSalary);
		setCommission(commission);
		totalSalary();
	}

	public float getCommission() {
		return commission;
	}
	private void setCommission(float commission) {
		this.commission = commission;
	}
	
	@Override
	public  void totalSalary(){
		this.totalSalary= basicSalary+commission;
	}

}
