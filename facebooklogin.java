package qsp;



import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class facebooklogin {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {

		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notications--");
		WebDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("");
//		Thread.sleep(3000);
		driver.findElement(By.id("pass")).sendKeys("");
//		Thread.sleep(3000);
		driver.findElement(By.name("login")).click();
//		Thread.sleep(3000);
		
		System.out.println("Login Suceesfully");
	}
}
