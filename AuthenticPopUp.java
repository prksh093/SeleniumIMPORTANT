package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AuthenticPopUp {
static {
	System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
}
	public static void main(String[] args) {
WebDriver driver=new FirefoxDriver();
driver.get("https://admin:admin@the-internet.herokuapp,com/basic_auth");
	}

}
