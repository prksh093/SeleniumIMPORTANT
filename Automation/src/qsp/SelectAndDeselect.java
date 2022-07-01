                                


//                                 Question:-


//write a script to select idli,vada,dosa and deselected?
//----------------------------------------------------------

package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectAndDeselect {
static{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get(".Data/htmlcode.html");
		WebElement mtrLIstBox = driver.findElement(By.id("mtr"));
		Select s=new Select(mtrLIstBox);
		s.selectByValue("i");
		Thread.sleep(3000);
		s.selectByIndex(2);
		Thread.sleep(3000);
		s.selectByVisibleText("dosa");
		Thread.sleep(3000);
		s.deselectByIndex(1);
		Thread.sleep(3000);
		s.deselectByValue("v");
		Thread.sleep(3000);
		s.deselectByVisibleText("idly");
		Thread.sleep(3000);
		System.out.println("multi is "+s.isMultiple());

	}

}
