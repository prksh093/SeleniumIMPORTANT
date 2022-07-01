package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginButtonInFB {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("loginbutton")).click();
		boolean login = driver.findElement(By.id("loginbutton")).isEnabled();

		if (login == true) {
			System.out.println("login is enabled");
		} else {
			System.out.println("login is not enabled");
		}
		driver.close();

	}

}
