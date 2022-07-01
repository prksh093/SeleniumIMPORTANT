
//Question :- Write a Script to check weather logo is displayed or not in facebook?

package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class LogoDisplayedInFB {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		boolean logo = driver.findElement(By.xpath("//img[@alt='Facebook']")).isDisplayed();

		if (logo == true) {
			System.out.println("logo is displayed");
		} else {
			System.out.println("logo is not displayed");
		}

	}

}
