package qsp;

import java.awt.*;
import java.awt.RenderingHints.Key;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrintPopUp {
static {
	System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
}
	public static void main(String[] args) throws AWTException, InterruptedException {
WebDriver driver=new FirefoxDriver();
driver.get("https://www.google.com");
Robot r= new Robot();
r.keyPress(KeyEvent.VK_CONTROL);
r.keyPress(KeyEvent.VK_P);
r.keyRelease(KeyEvent.VK_CONTROL);
Thread.sleep(3000);
r.keyPress(KeyEvent.VK_ENTER);
r.keyRelease(KeyEvent.VK_ENTER);
Thread.sleep(3000);
r.keyPress(KeyEvent.VK_A);
r.keyPress(KeyEvent.VK_ENTER);
r.keyRelease(KeyEvent.VK_ENTER);
driver.close();
}

}
