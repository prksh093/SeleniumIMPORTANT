package qsp;

import java.util.List;	

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllSelectedOption {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("C:\\Users\\Prakash\\eclipse-workspace\\Automation\\Data\\htmlcode.html");
		WebElement CPlistbox = driver.findElement(By.id("cp"));
		Select s =new Select(CPlistbox); 
		List<WebElement> allsOption = s.getAllSelectedOptions();
		int  count=allsOption.size();
		System.out.println(count);
		for(int i=0;i<count;i++) {
			String test=allsOption.get(i).getText();
			System.out.println(test);
			driver.close();


		}



	}

}
