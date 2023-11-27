package seleniumtests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InvokeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Chrome Launch
//		 System.setProperty("webdriver.chrome.driver",
//		 "/Users/user/Documents/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());

		// Firefox Launch
//		System.setProperty("webdriver.gecko.driver",
//		"/Users/user/Do	cuments/drivers/geckodriver");
		WebDriver driver1 = new FirefoxDriver();
		driver1.get("https://www.google.com");
		System.out.println(driver1.getCurrentUrl());
		System.out.println(driver1.getTitle());

		// MS Edge Launch
		// System.setProperty("webdriver.edge.driver",
		// "/Users/user/Documents/drivers/msedgedriver");
		WebDriver driver2 = new EdgeDriver();

		driver2.get("https://www.google.com");
		System.out.println(driver2.getCurrentUrl());
		System.out.println(driver2.getTitle());
		
		

		driver.quit();
		driver1.quit();
		driver2.quit();
	}

}
