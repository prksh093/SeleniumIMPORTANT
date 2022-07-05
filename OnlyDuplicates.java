package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OnlyDuplicates {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Prakash/Desktop/htmlcode.html");
		WebElement mtrLIstbox = driver.findElement(By.id("mtr"));
	Select s= new Select(mtrLIstbox);
	List<WebElement> allOptions = s.getOptions();
	int count = allOptions.size();
for(int i=0;i<count;i++) {
	String text = allOptions.get(i).getText();
	System.out.println(text);

}
driver.close();

	}

}
