package AutomationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTable {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//section[text()='Web Table']")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Dynamic Web Table")).click();
		Thread.sleep(3000);
		String price = driver.findElement(By.xpath("//th[contains(text(),'Levi')]/../td[4]")).getText();
		System.out.println(price);
		Thread.sleep(3000);
		driver.close();
		
		
	}

}
