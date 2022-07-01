package qsp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multipleHandling {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//a[@id='loginButton']/div")).click();
		Thread.sleep(3000);
        driver.findElement(By.xpath("(//div[@class='popup_menu_icon'])[4]")).click();
		
		Thread.sleep(3000);
			driver.findElement(By.xpath("//a[text()='About your actiTIME']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[text()='Read Service Agreement']")).click();
			Set<String> alltabs = driver.getWindowHandles();
			for(String tab:alltabs)
			{
				driver.switchTo().window(tab);
				
				
			}
		
	}

}
