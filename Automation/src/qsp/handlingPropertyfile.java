

//    notepad
//In this program i am making a one property file in desktop in notepad 
//like :-
//    1....url https://demo.actitime.com/
//    2....username admin
//    3....password manager


//                question:-
//  write a script to read the data from the property file?


package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class handlingPropertyfile {

	public static void main(String[] args) throws IOException {
//		get the jsvs representative object of the physical file .
		FileInputStream fis= new FileInputStream("C:\\Users\\Prakash\\Desktop\\command.property");
//		create an object of property class.
		Properties p=new Properties();
//		load the file 
		p.load(fis);
//		get the value or data by passing the key
		String url = p.getProperty("url");
		String un = p.getProperty("username");
		String pw = p.getProperty("password");
		System.out.println(url);
		System.out.println(un);
		System.out.println(pw);
	}

}
