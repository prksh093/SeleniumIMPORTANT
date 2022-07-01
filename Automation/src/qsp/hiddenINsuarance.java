package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class hiddenINsuarance {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
Thread.sleep(3000);
driver.findElement(By.id("policynumber")).sendKeys("123");
Thread.sleep(3000);
driver.findElement(By.id("dob")).click();
WebElement month = driver.findElement(By.xpath("ui-datepicker-month"));
Select s = new Select(month);
List<WebElement> alloptions = s.getOptions();
String text = null;
for(int i =0 ;i<alloptions.size();i++)
	text=alloptions.get(i).getText();
System.out.println(text);
driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-active']")).click();
Thread.sleep(3000);
driver.findElement(By.id("alternative_number"));
	}

}
