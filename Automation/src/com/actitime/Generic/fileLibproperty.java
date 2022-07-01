package com.actitime.Generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
/**
 * 
 * @author Prakash
 *
 */
public class fileLibproperty {
	/**
	 * 
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public String getpropertyData(String key) throws IOException {
	FileInputStream fis = new FileInputStream("./Data/command.property");
	Properties p= new Properties();
	p.load(fis);
	String data=p.getProperty(key);
	return data;}
}


