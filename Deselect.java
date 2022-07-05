package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Deselect {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("C:\\Users\\Prakash\\eclipse-workspace\\Automation\\Data\\htmlcode.html");
		WebElement mtrlistbox = driver.findElement(By.id("mtr"));
		Select s = new Select(mtrlistbox);
		s.selectByValue("i");
		Thread.sleep(3000);
		s.selectByIndex(3);
		Thread.sleep(3000);
		s.selectByVisibleText("pongal");
		Thread.sleep(3000);
		s.deselectByIndex(3);
		Thread.sleep(3000);
		s.deselectByValue("i");
		Thread.sleep(3000);
		s.deselectByVisibleText("pongal");
		Thread.sleep(3000);
		

	}

}
