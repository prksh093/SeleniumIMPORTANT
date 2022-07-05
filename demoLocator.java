package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoLocator {
	static {
		System.setProperty("webdrive.chrome.driver", "./driver/chrome.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get(null);

	}

}
