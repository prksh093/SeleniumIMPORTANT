package Practisce;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllSuggestion {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("java");
		List<WebElement> allsugg = driver.findElements(By.xpath("//span[text()='java']"));
		int count = allsugg.size();
		System.out.println(count);
		for( int i=0;i<=count;i++) {	
			String data = allsugg.get(i).getText();
			System.out.println(data);
			
		}
	}

}
