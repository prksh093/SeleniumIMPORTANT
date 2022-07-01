package qsp;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriUploadResume {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).sendKeys("prkshrajput@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("9977446682Pr");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='UPDATE PROFILE']")).click();
		driver.findElement( By.id("//input[@id='attachCV']")).click();
		Thread.sleep(3000);
		File f =new File("./data/SAIRAM RESUME-converted (1).pdf");
		String absolutepath=f.getAbsolutePath();
		//driver.findElement(By.("cv")).sendKeys(absolutepath);
		
		driver.close();
	}

}
