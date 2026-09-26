import utilities.list.*;
public class Operations {

	
	public static void sortLinkedList(LinkedList<Employee> employeeList) {
		Node<Employee> current=employeeList.getHeadNode();
		Node<Employee> index;
		Employee temp;
		
		if(employeeList.getFirst()!=null) {
		while(current!=null) {
			index=current.getNext();
			
			while(index!=null) {
				if(current.getData().getName().compareToIgnoreCase(index.getData().getName())>0) {
					temp=current.getData();
					current.setData(index.getData());
					index.setData(temp);
				}
				index=index.getNext();
			}
			current=current.getNext();
		}
		}
		System.out.println("Employee list sorted by Name!");
	}
	
	public static void sortLinkedListDesc(LinkedList<Employee> employeeList) {
		Node<Employee> current=employeeList.getHeadNode();
		Node<Employee> index;
		Employee temp;
		
		if(employeeList.getFirst()!=null) {
		while(current!=null) {
			index=current.getNext();
			
			while(index!=null) {
				if(current.getData().getName().compareToIgnoreCase(index.getData().getName())<0) {
					temp=current.getData();
					current.setData(index.getData());
					index.setData(temp);
				}
				index=index.getNext();
			}
			current=current.getNext();
		}
		}
		System.out.println("Employee list sorted by Name!");
	}
	
	
	public static void sortEmpDesc(Employee arrEmp[], int count){
		
		Employee temp;
		
		for(int i=0; i<count;i++) {
			for(int j=i+1;j<count;j++) {
				if(arrEmp[i].name.compareToIgnoreCase(arrEmp[j].name)<0) {
					temp=arrEmp[i];
					arrEmp[i]=arrEmp[j];
					arrEmp[j]=temp;
				}
			}
		}
	}
	
	
	public static void sortAllEmp(Employee arrEmp[], int count){
		Employee temp;
		for(int i=0; i<count;i++) {
			for(int j=i+1;j<count;j++) {
				if(arrEmp[i].getName().compareToIgnoreCase(arrEmp[j].getName())>0) {
					temp = arrEmp[i];
					arrEmp[i] = arrEmp[j];
					arrEmp[j] = temp;
				}
			}
		}
	}
	
}
