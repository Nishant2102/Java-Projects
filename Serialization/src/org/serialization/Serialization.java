package org.serialization;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Serialization {
	public static void writeDataIntoFile(File objFile) throws FileNotFoundException, IOException {
		
		try(FileOutputStream fileStream= new FileOutputStream(objFile); DataOutputStream objData = new DataOutputStream(fileStream)){
			if(objFile.exists()) {
				System.out.println("File Already Exists.");
			}
			else {
				System.out.println("Creating a new file.");
				objFile = new File("E:\\javaseProjects\\Encryption\\Test.txt");
			}
			System.out.println("Add Statement to write!");
			Scanner scanner = new Scanner(System.in);
			String str = scanner.nextLine();
			String encrypt = "";
			
			for(int i=0; i<str.length(); i++) {
				encrypt += (char)(str.charAt(i) + 15);
			}
			
			objData.writeUTF(encrypt);
		}
	}
}