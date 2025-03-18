package AutomationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathByContainsFunction {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.findElement(By.name("q")).sendKeys("HP Laptop");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@type='submit' and @title='Search for Products, Brands and More']")).click();
		String text = driver.findElement(By.xpath("//div[contains(text(),'HP Chromebook Intel Celeron Dual Core N4120')]")).getText();
		System.out.println(text);
		Thread.sleep(3000);
		driver.close();
	}

}
