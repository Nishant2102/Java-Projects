
import java.util.Comparator;

public class EmployeeComparatorDesc implements Comparator<Employee> {
	@Override
	public int compare(Employee o1, Employee o2) {
		return -1*o1.name.compareTo(o2.name);
	}
}
