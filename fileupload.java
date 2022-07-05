package qsp;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileupload {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Prakash/Desktop/naukri.html");
		Thread.sleep(3000);
		File f =new File("./data/SAIRAM RESUME-converted (1).pdf");
		String absolutepath=f.getAbsolutePath();
		driver.findElement(By.id("cv")).sendKeys(absolutepath);
		

	}

}
