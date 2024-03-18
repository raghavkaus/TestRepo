package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectbyvalue {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ragha\\Desktop\\chromedriver-win64 (6)\\chromedriver-win64\\chromedriver.exe");
		// TODO Auto-generated method stub
		
		
		
				WebDriver driver = new ChromeDriver();
				driver.get("http://ironspider.ca/forms/dropdowns.htm");
				WebElement w = driver.findElement(By.name("coffee"));
				Select s2 =new Select(w);
				s2.selectByIndex(3);
		// TODO Auto-generated method stub

	}

}
