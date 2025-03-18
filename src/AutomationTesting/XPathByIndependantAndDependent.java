package AutomationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathByIndependantAndDependent {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.navigate().to("https://www.flipkart.com/");
	Thread.sleep(3000);
	driver.findElement(By.name("q")).sendKeys("Iphone 16");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[@type='submit' and @title='Search for Products, Brands and More']")).click();
	String text = driver.findElement(By.xpath("//div[text()='Apple iPhone 16 (White, 128 GB)']")).getText();
	System.out.println(text);
	Thread.sleep(3000);
	driver.close();
}

}
