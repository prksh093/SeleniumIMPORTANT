package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Navigatecls {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

	}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com");
		driver.manage().window().maximize();

		driver.navigate().to("https://www.gmail.com/");
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.close();
	}

}
