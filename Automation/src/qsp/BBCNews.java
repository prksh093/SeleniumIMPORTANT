package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BBCNews {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bbc.com/");
		Thread.sleep(3000);
	   List<WebElement> alllink = driver.findElements(By.xpath("//span[@class='top-list-item__bullet']/.."));
	   int count =alllink.size();
	   System.out.println(count);
		for(int i=0;i<count;i++)
		{
		String text = alllink.get(i).getText();
		System.out.println(text);
		}

	}

}
