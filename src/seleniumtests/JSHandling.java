package seleniumtests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,600)");

		List<WebElement> coursePrices = driver.findElements(By.xpath("//table[@name='courses']//tr//td[3]"));
		System.out.println("Number of Rows in this Table are; "
				+ driver.findElements(By.xpath("//table[@name='courses']//tr")).size());
		List<WebElement> rowData2 = driver.findElements(By.xpath("//table[@name='courses']//tr[3]//td"));
		System.out.println("Number of columns in 2nd row are: " + rowData2.size());
		for (WebElement cell : rowData2) {
			System.out.println("Cell value in row2: " + cell.getText());
		}

		int totalPrice = 0;

		for (WebElement coursePrice : coursePrices) {
			totalPrice = totalPrice + Integer.parseInt(coursePrice.getText());
		}

		System.out.println("Calculated total price is: " + totalPrice);

		driver.close();

	}

}
