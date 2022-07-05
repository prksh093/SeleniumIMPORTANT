package qsp;

import java.sql.Driver;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountTabsInACTITIME {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		driver.findElement(By.xpath("//a[text()='actiTIME Inc.']"));
		Set<String> alltabs = driver.getWindowHandles();
		int count = alltabs.size();
		System.out.println(count);
		for(String tab:alltabs)
			System.out.println(tab);
		driver.quit();
	}

}
