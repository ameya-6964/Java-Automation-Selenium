package AutomationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssLocator {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.navigate().to("https://www.flipkart.com/");
	Thread.sleep(3000);
	driver.findElement(By.name("q")).sendKeys("Iphone 16");
	Thread.sleep(5000);
	driver.findElement(By.cssSelector("button[type='submit']")).click();
	Thread.sleep(3000);
	driver.close();
	}
}
