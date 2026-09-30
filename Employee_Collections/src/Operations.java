

import java.io.File;
import java.util.LinkedList;
import java.util.ListIterator;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class Operations {
	
public static void writeDataIntoFile(File objFile, LinkedList<Employee> employeeList) throws FileNotFoundException, IOException {
		
		try(FileOutputStream fileStream= new FileOutputStream(objFile); ObjectOutputStream objData = new ObjectOutputStream(fileStream)){
			if(objFile.exists()) {
				System.out.println("File Already Exists.");
			}
			else {
				System.out.println("Creating a new file.");
				objFile = new File("E:\\javaseProjects\\Encryption\\Employee.txt");
			}
			ListIterator<Employee> iter = employeeList.listIterator();
			Employee temp=employeeList.getFirst();
			while(temp!=null) {
				objData.writeObject(temp);
				temp=iter.next();
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
	
	
	
}
