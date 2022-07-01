
package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigateto {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/ChromeDriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
//		Object creation
		WebDriver driver = new ChromeDriver();
//		ENter the URl
		driver.get("file:///D:/Arun_java/demo.html");
//		Maximize the screen
		driver.manage().window().maximize();
//		maintain the speed
		Thread.sleep(2000);
//		close the application

		driver.findElement(By.className("c1")).click();

		driver.navigate().back();

		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[id='i1']")).click();
		driver.navigate().back();
		Thread.sleep(2000);

		driver.findElement(By.id("i1")).click();
		driver.navigate().back();
		Thread.sleep(2000);

		driver.findElement(By.name("n1")).click();
		driver.navigate().back();
		Thread.sleep(2000);

		driver.findElement(By.linkText("Google")).click();
		driver.navigate().back();
		Thread.sleep(2000);

		driver.findElement(By.partialLinkText("gle")).click();
		driver.navigate().back();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a")).click();
		driver.navigate().back();
		Thread.sleep(2000);
		driver.quit();
	}

}