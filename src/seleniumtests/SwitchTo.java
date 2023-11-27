package seleniumtests;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		
		// Logic 1: Window Handling
		driver.findElement(By.partialLinkText("Multiple Windows")).click();
		driver.findElement(By.linkText("Click Here")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> it = windowHandles.iterator();
		String window1 = it.next();
		String window2 = it.next();
		
		System.out.println(driver.switchTo().window(window2).findElement(By.tagName("h3")).getText());
		System.out.println(driver.switchTo().window(window1).findElement(By.tagName("h3")).getText());
		driver.switchTo().window(window1).navigate().back();
		
		// Logic 2: Frames Handling
		driver.findElement(By.linkText("Nested Frames")).click();
		// System.out.println(driver.findElements(By.tagName("frame")).size());
		System.out.println(driver.switchTo().frame(0).switchTo().frame(1).findElement(By.id("content")).getText());
		driver.switchTo().defaultContent();
		
		driver.quit();

	}

}
