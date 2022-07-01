

//                                   Question:-


//write a script to print first selected option present in checkbox LISTBOX ?
//----------------------------------------------------------------------------
package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FirstSelectOption {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("C:\\Users\\Prakash\\eclipse-workspace\\Automation\\Data\\htmlcode.html");
		
		WebElement CPListBox = driver.findElement(By.id("cp"));
		Select s =new Select(CPListBox);
		String text = s.getFirstSelectedOption().getText();
		System.out.println(text);
		

	}

}
