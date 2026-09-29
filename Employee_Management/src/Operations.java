import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import utilities.list.LinkedList;
import utilities.list.LinkedListException;
import utilities.list.Node;

public class Operations {
	
public static void writeDataIntoFile(File objFile, LinkedList<Employee> employeeList) throws FileNotFoundException, IOException, LinkedListException {
		
		try(FileOutputStream fileStream= new FileOutputStream(objFile); ObjectOutputStream objData = new ObjectOutputStream(fileStream)){
			if(objFile.exists()) {
				System.out.println("File Already Exists.");
			}
			else {
				System.out.println("Creating a new file.");
				objFile = new File("E:\\javaseProjects\\Encryption\\Employee.txt");
			}
			
			Employee temp=employeeList.getFirst();
			while(temp!=null) {
				objData.writeObject(temp);
				temp=employeeList.getNext();
			}
		}
}
	public static void readFromFile(File objFile, LinkedList<Employee> employeeList) throws IOException, ClassNotFoundException {
		try(FileInputStream inStream = new FileInputStream(objFile); ObjectInputStream objData= new ObjectInputStream(inStream)){
			if(!objFile.exists()) throw new FileNotFoundException();
			
			while(true) {
				Employee temp=(Employee)objData.readObject();
				employeeList.add(temp);
				System.out.println(temp);
			}
		}
	}
	
	public static void sortLinkedList(LinkedList<Employee> employeeList) throws LinkedListException {
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
	
	public static void sortLinkedListDesc(LinkedList<Employee> employeeList) throws LinkedListException {
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
