package LambdaDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LunchBrowser {
	
	@Test
	public void MyTest() {
		System.out.println("TEST WORKING");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver() ;
		driver.get("https://www.lambdatest.com/");

		System.out.println("Title of the page: " +driver.getTitle());
		
		driver.quit();
	}

}
