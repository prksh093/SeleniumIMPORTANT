package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.support.PageFactory;

public class propertyFile {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("./data/common.property");
		Properties p =new Properties();
		p.load(fis);
		String url = p.getProperty("url");
		String un = p.getProperty("username");
		String pw=p.getProperty("password");
		System.out.println(url);
		System.out.println(un);
		System.out.println(pw);

	}

}
