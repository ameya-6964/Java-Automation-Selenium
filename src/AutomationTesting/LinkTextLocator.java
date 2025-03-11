package AutomationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextLocator {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.navigate().to("https://www.facebook.com/");
	Thread.sleep(3000);
	driver.findElement(By.linkText("Create new account")).click();
	Thread.sleep(3000);
	driver.findElement(By.name("firstname")).sendKeys("Ameya");
	Thread.sleep(3000);
	driver.findElement(By.name("lastname")).sendKeys("Belvalkar");
	Thread.sleep(4000);
	driver.close();
	
	}
}
