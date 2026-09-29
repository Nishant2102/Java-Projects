package org.serialization;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Deserialization {
	public static void readDataFromFile(File objFile) throws FileNotFoundException, IOException {
		
		if(!objFile.exists()) {
			throw new FileNotFoundException("Input file not found at: " + objFile.getAbsolutePath());
		}
		
		String out = "";
		
		try(FileInputStream fileStream = new FileInputStream(objFile); 
		    DataInputStream objData = new DataInputStream(fileStream)) {
			
			out = objData.readUTF();
		}
		
		String decrypt = "";
		for(int i = 0; i < out.length(); i++) {
			decrypt += (char)(out.charAt(i) - 15);
		}
		
		File objDecryptFile = new File("E:\\javaseProjects\\Encryption\\DecryptedTest.txt"); 
		try(FileOutputStream fileDecryptStream = new FileOutputStream(objDecryptFile); 
		    DataOutputStream objDecryptData = new DataOutputStream(fileDecryptStream)) {
			
			for(int i=0;i<decrypt.length();i++) {
				char x= decrypt.charAt(i);
				objDecryptData.writeChars(Character.toString(x));
			}
		}
		
	}
}