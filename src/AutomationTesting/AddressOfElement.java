package AutomationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddressOfElement {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/belwa/OneDrive/Desktop/index.html");
	WebElement element = driver.findElement(By.id("fk"));
	element.click();
	Thread.sleep(5000);
	driver.close();
	}
}
