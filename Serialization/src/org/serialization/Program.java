package org.serialization;

import static org.serialization.Deserialization.readDataFromFile;
import static org.serialization.Serialization.writeDataIntoFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		File objFile = new File("E:\\javaseProjects\\Encryption\\Test.txt");
		
		int choice = 0;
		final int MENU_ENCRYPT=1;
		final int MENU_DECRYPT=2;
		final int MENU_EXIT=3;
		
		Scanner sc = new Scanner(System.in);
		try {
			do {
				System.out.println("Enter Choice: 1. Encryption, 2. Decryption, 3. Exit");
				choice = sc.nextInt();
				sc.nextLine();
				switch(choice) {
					case MENU_ENCRYPT:
						writeDataIntoFile(objFile);
						break;
					case MENU_DECRYPT:
						readDataFromFile(objFile);
						break;
					case MENU_EXIT:
						System.out.println("Thanks for using our code!");
						break;	
					default:
						System.out.println("Invalid input!");
				}
			
			} while(choice!=MENU_EXIT);
		} catch(IOException e) {
			System.out.println("Invalid IO Operation:"+ e.getMessage());
		}
	}
}