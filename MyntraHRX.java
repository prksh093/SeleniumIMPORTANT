package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MyntraHRX {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.findElement(By.xpath("//a[@data-group='men']")).click();
		Actions a =new Actions(driver);
		a.doubleClick().perform();
		

	}

}
