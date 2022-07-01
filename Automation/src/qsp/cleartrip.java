package qsp;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.asm.Advice.Enter;

public class cleartrip {
	private static final String Key = null;
	private static final String Enter = null;
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");

	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com");
		driver.findElement(By.xpath("//input[@value='BLR - Bangalore, IN']")).sendKeys("Bangalore, IN - Kempegowda International Airport (BLR)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Goa, IN - Dabolim Airport (GOI)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@class='flex flex-middle flex-between t-all fs-2 focus:bc-secondary-500 bg-transparent bc-neutral-100 c-pointer pr-2 pl-3 pt-2 pb-2 ba br-4 h-8 c-neutral-900'])[1]"+Keys.ENTER));
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[text()='15'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Search flights']")).click();
	}

}
