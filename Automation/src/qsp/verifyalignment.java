
//Question:-write a script to check whether user name and password text box properly aligned or not in actitime? 

package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class verifyalignment {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe/");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		int x1 = driver.findElement(By.id("username")).getLocation().getX();
		int x2 = driver.findElement(By.name("pwd")).getLocation().getY();

		if (x1 == x2) {
			System.out.println("properly aligned");
		} else {
			System.out.println("not properly aligned");
		}
		driver.close();
	}

}
