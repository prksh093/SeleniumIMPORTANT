package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class heightWidth {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		int height = driver.findElement(By.id("username")).getSize().getHeight();
		int width = driver.findElement(By.name("pwd")).getSize().getHeight();

		System.out.println(height);
		System.out.println(width);
	}

}
