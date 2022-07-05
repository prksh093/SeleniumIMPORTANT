package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GendeRadioButton {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("facebook");

		driver.findElement(By.name("btnK")).click();

		driver.findElement(By.xpath("//*[@class='LC20lb MBeuO DKV0Md']")).click();
		driver.findElement(By.xpath("//*[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		driver.findElement(By.xpath("//*[@class='_58mt']")).click();
		int x1 = driver.findElement(By.id("//*[@id='u_3_2_+h']")).getLocation().getX();
		driver.findElement(By.xpath("//*[@id='u_3_o_ND']/span[2]/label")).click();
		int x2 = driver.findElement(By.id("//*[@id='u_3_3_h9']")).getLocation().getX();
		driver.findElement(By.xpath("//*[@id='u_3_o_ND']/span[3]/label")).click();
		int x3 = driver.findElement(By.id("//*[@id='u_3_4_xT']")).getLocation().getX();
		driver.close();

	}
}
