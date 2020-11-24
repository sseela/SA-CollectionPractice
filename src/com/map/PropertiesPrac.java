package com.map;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesPrac {
	public static void main(String[] args) throws IOException {
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\BPER\\Notes\\Collections\\abc.properties");
		prop.load(fis); 								// load property file
		System.out.println(prop);
		prop.setProperty("position", "analyst");		// setting a new property
		System.out.println(prop);		
		FileOutputStream fos = new FileOutputStream("C:\\BPER\\Notes\\Collections\\abc.properties");
		prop.store(fos, "added successfully");			// saving the new property
	}
}
