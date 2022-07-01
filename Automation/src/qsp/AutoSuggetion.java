package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggetion {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("java");
		Thread.sleep(3000);
		List<WebElement> allsugs = driver.findElements(By.xpath("//span[contains(text(),'java')]"));
		
		for(int i=0;i<allsugs.size();i++) {
			String text = allsugs.get(i).getText();
			System.out.println(text);
		}
		driver.close();
	}
}
