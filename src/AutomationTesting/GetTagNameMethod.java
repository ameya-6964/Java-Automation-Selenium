package AutomationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTagNameMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://github.com/ameya-6964");
		
		String tagName = driver.findElement(By.xpath("//img[@width='260']")).getTagName();
		System.out.println(tagName);
		Thread.sleep(3000);
		driver.close();
	}
}
