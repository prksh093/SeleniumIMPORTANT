package qsp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseONlySpecificBrowser {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://secure.indeed.com/");		
		driver.findElement(By.id("apple-signin-button")).click();
		driver.findElement(By.id("login-facebook-button")).click();
		Set<String> alltabs = driver.getWindowHandles();
int count = alltabs.size();
for(String tab:alltabs) {
	System.out.println(tab); 
	driver.switchTo().window(tab);
	String title = driver.getTitle();
//	if(title.equals("facebook"));
//	{
//		driver.close();
//	}
//}
	if(title.equals("facebook"));
		
	
	else{
		driver.close();
	}
}
	}
}
	


