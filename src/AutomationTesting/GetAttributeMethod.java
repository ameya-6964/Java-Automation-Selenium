package AutomationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.facebook.com");
		
		String attribute = driver.findElement(By.xpath("//img[@alt='Facebook']")).getAttribute("src");
		System.out.println(attribute);
		Thread.sleep(3000);
		driver.close();
	}

}
