package AutomationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathByIndexing {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.navigate().to("https://www.myntra.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("shoes");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@class='desktop-submit']")).click();
		String text = driver.findElement(By.xpath("(//h3[text()='Louis Philippe'])[5]")).getText();
		System.out.println(text);
		Thread.sleep(5000);
		driver.close();
	}

}
