package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DOB {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		driver.findElement(By.name("firstname")).sendKeys("raju");
		driver.findElement(By.name("lastname")).sendKeys("mewada");
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("7080864710");
	    driver.findElement(By.id("day")).click();
		//Thread.sleep(3000);
		
		

	}

}
