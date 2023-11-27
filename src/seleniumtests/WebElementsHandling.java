package seleniumtests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebElementsHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		WebElement checkboxLabel = driver.findElement(By.xpath("//div[@id='checkbox-example']//fieldset//label[2]"));
		checkboxLabel.findElement(By.tagName("input")).click();
		String labelText = checkboxLabel.getText();
		System.out.println(labelText);
		
		WebElement selectBox = driver.findElement(By.id("dropdown-class-example"));
		Select select =  new Select(selectBox);
		select.selectByVisibleText(labelText);
		
		WebElement inputField = driver.findElement(By.id("name"));
		inputField.sendKeys(labelText);
		driver.findElement(By.id("alertbtn")).click();
		Alert alertBox = driver.switchTo().alert();
		String alertText = alertBox.getText();
		System.out.println("Alert message shown is: "+ alertText);
		alertBox.accept();
		
		if(alertText.contains(labelText)) {
			System.out.println("Your selected option "+labelText+" is shown in the Alert message!");
		}else {
			System.out.println("Label text is not found!");
		}
		
		driver.close();
		

	}

}
