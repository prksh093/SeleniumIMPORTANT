package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrintPopUPAASIGNMENT {
static {
	System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
}
	public static void main(String[] args) throws AWTException, InterruptedException {
WebDriver driver = new FirefoxDriver();
driver.get("https://www.selenium.dev/downloads/");
Robot r =new Robot();
r.keyPress(KeyEvent.VK_CONTROL);
r.keyPress(KeyEvent.VK_P);
r.keyRelease(KeyEvent.VK_CONTROL);
Thread.sleep(3000);
r.keyPress(KeyEvent.VK_TAB);
r.keyRelease(KeyEvent.VK_TAB);
//r.keyPress(KeyEvent.VK_TAB);
//r.keyRelease(KeyEvent.VK_TAB);
r.keyPress(KeyEvent.VK_DOWN); 
r.keyRelease(KeyEvent.VK_DOWN);
r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);
r.keyPress(KeyEvent.VK_DOWN);
r.keyPress(KeyEvent.VK_1);
r.keyPress(KeyEvent.VK_MINUS);
r.keyPress(KeyEvent.VK_1);
Thread.sleep(3000);
r.keyPress(KeyEvent.VK_ENTER);
r.keyRelease(KeyEvent.VK_ENTER);
Thread.sleep(3000);
r.keyPress(KeyEvent.VK_A);
r.keyPress(KeyEvent.VK_ENTER);
r.keyRelease(KeyEvent.VK_ENTER);

	}

}
