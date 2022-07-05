

//                              Question



//write a scriot to search for this specific option present in MTR listBox


package qsp;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class searchOption {
static {
System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the option");
		String option = sc.nextLine();
WebDriver driver= new ChromeDriver();
driver.get("file:///C:/Users/Prakash/Desktop/htmlcode.html");
WebElement mtrlistbox=driver.findElement(By.id("mtr"));

Select s= new Select(mtrlistbox);
List<WebElement> alloption = s.getOptions();

int count=alloption.size();
int counter = 0;
for(int i=0;i<count;i++) {
	String text = alloption.get(i).getText();
	if(text.equals(option)) {
		counter ++;
		
	}
}
	if(counter==1) {
		System.out.println("option is not present");}
		else if(counter==1) 
			System.out.println("option is present without duplicate");
			else 
				System.out.println("is present with duplicate");
			}
		}
	

