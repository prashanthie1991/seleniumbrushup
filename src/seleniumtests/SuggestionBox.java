package seleniumtests;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SuggestionBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String country = "india";
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement suggestBox = driver.findElement(By.id("autocomplete"));
		
		suggestBox.sendKeys("ind");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3000));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ui-id-1")));
		
		List<WebElement> suggestions = driver.findElements(By.cssSelector("ul#ui-id-1 li"));
		System.out.println("For ind we found "+ suggestions.size() + " suggestions!");
		
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
		String selectedValue = driver.findElement(By.id("autocomplete")).getAttribute("value").toString().toLowerCase();
		Assert.assertEquals(country, selectedValue);
		
//		boolean selected = false;
//		for(WebElement suggestion : suggestions) {
//			if(suggestion.getText().equalsIgnoreCase(country)) {
//				suggestion.click();
//				selected = true;
//				System.out.println("Given country selected!");
//				break;
//			}
//		}
//		if(!selected) {
//			System.out.println("Given country not selected!");
//		}
		
		driver.close();
		
	}

}
