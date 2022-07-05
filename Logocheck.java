package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logocheck {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demo.actitime.com/");
		boolean logo = driver.findElement(By.xpath("//*[@id=\"logoContainer\"]/div[1]/div")).isDisplayed();

		if (logo == true) {
			System.out.println("logo is displayd");
		} else {
			System.out.println("logo is not displayed");
		}
		driver.close();
	}

}
