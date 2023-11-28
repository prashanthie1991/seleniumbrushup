package seleniumtests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

public class HandleSSL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String browser = "safari"; // chrome, firfox, edge, safari
		WebDriver driver = null;

		switch (browser.toLowerCase()) {
		case "chrome":
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.setAcceptInsecureCerts(true);
			driver = new ChromeDriver(chromeOptions);
			break;
		case "firefox":
			FirefoxOptions firefoxOptions = new FirefoxOptions();
			firefoxOptions.setAcceptInsecureCerts(true);
			firefoxOptions.setCapability("headless", true);
			// System.setProperty("webdriver.firefox.driver","/Users/user/Documents/drivers/geckodriver");
			driver = new FirefoxDriver(firefoxOptions);
			break;
		case "edge":
			EdgeOptions edgeOptions = new EdgeOptions();
			edgeOptions.setAcceptInsecureCerts(true);
			driver = new EdgeDriver(edgeOptions);
			break;
		case "safari":
			SafariOptions safariOptions = new SafariOptions();
			safariOptions.setAcceptInsecureCerts(true);
			driver = new SafariDriver(safariOptions);
			break;
		default:
			System.out.println("Browser name given doesnt match!");

		}
		
		driver.get("https://expired.badssl.com/");
		System.out.println("Browser:"+ browser + " - Page Tile: "+ driver.getTitle());
		driver.close();

	}

}
