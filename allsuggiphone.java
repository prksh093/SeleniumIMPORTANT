package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class allsuggiphone {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("i phone");
		List<WebElement> allsugg = driver.findElements(By.xpath("//div[@class='lrtEPN _17d0yO']"));
		int count = allsugg.size();
		for(int i=0;i<count;i++) {
			String text = allsugg.get(i).getText();
			System.out.println(text);
		}

	}

}
