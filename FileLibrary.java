package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
/**
 * 
 * @author Prakash
 *
 */
public class FileLibrary {
public String  getPropertyData(String key) throws Exception {
FileInputStream fis = new FileInputStream("./Data/command.property");
Properties p =new Properties();
p.load(fis);
String data = p.getProperty(key);
return data;
}
}


